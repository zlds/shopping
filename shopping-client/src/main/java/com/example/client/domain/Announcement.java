package com.example.client.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 公告
 * @author: hanchaowei
 * @date 2023/12/11
 * @description:
 */
@TableName("t_announcements")
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