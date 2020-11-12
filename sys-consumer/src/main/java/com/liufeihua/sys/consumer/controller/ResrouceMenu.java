package com.liufeihua.sys.consumer.controller;

import java.util.List;

import lombok.Builder;
import lombok.Data;

import com.liufeihua.sys.common.response.ElementTreeTableVo;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/28 16:04
 */
public class ResrouceMenu {

	private int id;

	private int parentId;

	private String createTime;

	private String title;

	private int level;

	private int sort;

	private String name;

	private String icon;

	private int hidden;

	private String path;

	private String component;

	private int type;

	private int status;

	private String redirect;

	private Meta meta;

	private List<ResrouceMenu> children;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getHidden() {
		return hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<ResrouceMenu> getChildren() {
		return children;
	}

	public void setChildren(List<ResrouceMenu> children) {
		this.children = children;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
}