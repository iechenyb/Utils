package com.model.t2;

/**
 * TSysRole entity. @author MyEclipse Persistence Tools
 */

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
	public TSysRole(String description, String rolename) {
		this.description = description;
		this.rolename = rolename;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}