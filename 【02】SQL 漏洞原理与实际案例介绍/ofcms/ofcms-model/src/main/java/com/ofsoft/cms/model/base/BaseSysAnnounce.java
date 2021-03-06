package com.ofsoft.cms.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysAnnounce<M extends BaseSysAnnounce<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return getInt("id");
	}

	public M setTitle(String title) {
		set("title", title);
		return (M)this;
	}

	public String getTitle() {
		return getStr("title");
	}

	public M setContent(String content) {
		set("content", content);
		return (M)this;
	}

	public String getContent() {
		return getStr("content");
	}

	public M setType(String type) {
		set("type", type);
		return (M)this;
	}

	public String getType() {
		return getStr("type");
	}

	public M setUserId(String userId) {
		set("user_id", userId);
		return (M)this;
	}

	public String getUserId() {
		return getStr("user_id");
	}

	public M setReleaseTerminal(String releaseTerminal) {
		set("release_terminal", releaseTerminal);
		return (M)this;
	}

	public String getReleaseTerminal() {
		return getStr("release_terminal");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public M setSort(String sort) {
		set("sort", sort);
		return (M)this;
	}

	public String getSort() {
		return getStr("sort");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}

	public String getRemark() {
		return getStr("remark");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M)this;
	}

	public String getStatus() {
		return getStr("status");
	}

}
