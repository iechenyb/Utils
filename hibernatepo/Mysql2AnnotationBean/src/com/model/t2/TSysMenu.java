package com.model.t2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSysMenu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_menu", catalog = "test")
public class TSysMenu implements java.io.Serializable {

	// Fields

	private String id;
	private Long createTime;
	private String cretatePerson;
	private Integer isLeaf;
	private String menuDesc;
	private String menuName;
	private String modifyPerson;
	private Long modifyTime;
	private Integer ordor;
	private String parentId;
	private String url;

	// Constructors

	/** default constructor */
	public TSysMenu() {
	}

	/** minimal constructor */
	public TSysMenu(String id) {
		this.id = id;
	}

	/** full constructor */
	public TSysMenu(String id, Long createTime, String cretatePerson,
			Integer isLeaf, String menuDesc, String menuName,
			String modifyPerson, Long modifyTime, Integer ordor,
			String parentId, String url) {
		this.id = id;
		this.createTime = createTime;
		this.cretatePerson = cretatePerson;
		this.isLeaf = isLeaf;
		this.menuDesc = menuDesc;
		this.menuName = menuName;
		this.modifyPerson = modifyPerson;
		this.modifyTime = modifyTime;
		this.ordor = ordor;
		this.parentId = parentId;
		this.url = url;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 50)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "createTime")
	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Column(name = "cretatePerson", length = 50)
	public String getCretatePerson() {
		return this.cretatePerson;
	}

	public void setCretatePerson(String cretatePerson) {
		this.cretatePerson = cretatePerson;
	}

	@Column(name = "isLeaf")
	public Integer getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	@Column(name = "menuDesc", length = 200)
	public String getMenuDesc() {
		return this.menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	@Column(name = "menuName", length = 20)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "modifyPerson", length = 50)
	public String getModifyPerson() {
		return this.modifyPerson;
	}

	public void setModifyPerson(String modifyPerson) {
		this.modifyPerson = modifyPerson;
	}

	@Column(name = "modifyTime")
	public Long getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Column(name = "ordor")
	public Integer getOrdor() {
		return this.ordor;
	}

	public void setOrdor(Integer ordor) {
		this.ordor = ordor;
	}

	@Column(name = "parentId", length = 50)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "url", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}