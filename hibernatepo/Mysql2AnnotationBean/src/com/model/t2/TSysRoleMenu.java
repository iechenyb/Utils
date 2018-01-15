package com.model.t2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSysRoleMenu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_role_menu", catalog = "test")
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
	public TSysRoleMenu(String id, String menuid, String roleid) {
		this.id = id;
		this.menuid = menuid;
		this.roleid = roleid;
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

	@Column(name = "menuid", nullable = false, length = 50)
	public String getMenuid() {
		return this.menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	@Column(name = "roleid", nullable = false, length = 50)
	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

}