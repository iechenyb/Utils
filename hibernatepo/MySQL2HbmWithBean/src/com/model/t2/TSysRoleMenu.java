package com.model.t2;

/**
 * TSysRoleMenu entity. @author MyEclipse Persistence Tools
 */

public class TSysRoleMenu implements java.io.Serializable {

	// Fields

	private String id;
	private String menuid;
	private String roleid;

	// Constructors

	/** default constructor */
	public TSysRoleMenu() {
	}

	/** full constructor */
	public TSysRoleMenu(String menuid, String roleid) {
		this.menuid = menuid;
		this.roleid = roleid;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenuid() {
		return this.menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

}