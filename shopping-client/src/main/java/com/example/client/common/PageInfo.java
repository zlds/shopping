package com.example.client.common;

import com.github.pagehelper.Page;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
public class PageInfo {

	// 当前页
	private int pageNum;
	// 每页的数量
	private int pageSize;
	// 总页数
	private int pages;
	// 是否有下一页
	private boolean hasNextPage;
	// 总数量
	private long total;

	public static PageInfo create(Page<?> p) {
		if (Objects.isNull(p))
			return new PageInfo();

		PageInfo entity = new PageInfo();
		entity.setPageNum(p.getPageNum());
		entity.setPages(p.getPages());
		entity.setPageSize(p.getPageSize());
		entity.setHasNextPage(p.getPages() > p.getPageNum());
		entity.setTotal(p.getTotal());
		return entity;
	}

	public static PageInfo createByPageInfo(com.github.pagehelper.PageInfo<?> info) {

		PageInfo entity = new PageInfo();
		entity.setPageNum(info.getPageNum());
		entity.setPages(info.getPages());
		entity.setPageSize(info.getPageSize());
		entity.setHasNextPage(info.getPages() > info.getPageNum());
		entity.setTotal(info.getTotal());
		return entity;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		if (pageSize == 0)
			return 10;
		return pageSize;
	}

	public int getPageNum() {
		if (pageNum == 0)
			return 1;
		return pageNum;
	}

	public static <T> Page<T> getPageInfo(int currentPage, int pageSize, List<T> list) {
		int total = list.size();
		if (total > pageSize) {
			int toIndex = pageSize * currentPage;
			if (toIndex > total) {
				toIndex = total;
			}
			list = list.subList(pageSize * (currentPage - 1), toIndex);
		}
		Page<T> page = new Page<>(currentPage, pageSize);
		page.addAll(list);
		page.setPages((total + pageSize - 1) / pageSize);
		page.setTotal(total);
		return page;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
}
