package com.bbs.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.junit.Ignore;

@Entity
@Table(name = "bbs_posts")
public class PostEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	@JoinColumn(name = "tid")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private ThemeEntity theme;

	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "author_id")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UserEntity author;

	private String content;
	@Column(name = "created_date")
	private Date createdDate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public ThemeEntity getTheme() {
		return theme;
	}

	public void setTheme(ThemeEntity theme) {
		this.theme = theme;
	}

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
