package com.model.t2;

/**
 * TSysMenu entity. @author MyEclipse Persistence Tools
 */

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

	/** full constructor */
	public TSysMenu(Long createTime, String cretatePerson, Integer isLeaf,
			String menuDesc, String menuName, String modifyPerson,
			Long modifyTime, Integer ordor, String parentId, String url) {
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getCretatePerson() {
		return this.cretatePerson;
	}

	public void setCretatePerson(String cretatePerson) {
		this.cretatePerson = cretatePerson;
	}

	public Integer getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getMenuDesc() {
		return this.menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getModifyPerson() {
		return this.modifyPerson;
	}

	public void setModifyPerson(String modifyPerson) {
		this.modifyPerson = modifyPerson;
	}

	public Long getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getOrdor() {
		return this.ordor;
	}

	public void setOrdor(Integer ordor) {
		this.ordor = ordor;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}