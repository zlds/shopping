package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 公告
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_announcements")
@Data
public class Announcement extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 标题
     */
    private String title;


    /**
     * 内容
     */
    private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}