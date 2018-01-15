package com.model.t1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSysFile entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_file", catalog = "test")
public class TSysFile extends com.model.base.PoBase implements
		java.io.Serializable {

	// Fields

	private String id;
	private String content;
	private String fjname;
	private Long size;
	private String time;
	private String title;

	// Constructors

	/** default constructor */
	public TSysFile() {
	}

	/** minimal constructor */
	public TSysFile(String id) {
		this.id = id;
	}

	/** full constructor */
	public TSysFile(String id, String content, String fjname, Long size,
			String time, String title) {
		this.id = id;
		this.content = content;
		this.fjname = fjname;
		this.size = size;
		this.time = time;
		this.title = title;
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

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "fjname")
	public String getFjname() {
		return this.fjname;
	}

	public void setFjname(String fjname) {
		this.fjname = fjname;
	}

	@Column(name = "size")
	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	@Column(name = "time")
	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}