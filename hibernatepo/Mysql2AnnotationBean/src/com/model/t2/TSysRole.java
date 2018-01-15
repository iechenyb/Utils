package com.model.t2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSysRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_role", catalog = "test")
public class TSysRole implements java.io.Serializable {

	// Fields

	private String id;
	private String description;
	private String rolename;

	// Constructors

	/** default constructor */
	public TSysRole() {
	}

	/** full constructor */
	public TSysRole(String id, String description, String rolename) {
		this.id = id;
		this.description = description;
		this.rolename = rolename;
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

	@Column(name = "description", nullable = false, length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "rolename", nullable = false, length = 100)
	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}