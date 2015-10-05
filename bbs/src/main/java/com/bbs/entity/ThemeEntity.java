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

import com.bbs.utils.StringUtils;

@Entity
@Table(name = "bbs_themes")
public class ThemeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	private String title;
	private String content;
	@Column(name = "visit_num")
	private Integer visitNum;
	@Column(name = "love_num")
	private Integer loveNum;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "reverts_num")
	private Integer revertsNum;
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "author_id")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UserEntity author;

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

	public Integer getRevertsNum() {
		return revertsNum;
	}

	public void setRevertsNum(Integer revertsNum) {
		this.revertsNum = revertsNum;
	}

	public Integer getVisitNum() {
		return visitNum;
	}

	public void setVisitNum(Integer visitNum) {
		this.visitNum = visitNum;
	}

	public Integer getLoveNum() {
		return loveNum;
	}

	public void setLoveNum(Integer loveNum) {
		this.loveNum = loveNum;
	}

	public Integer getTid() {
		return tid;
	}

	public String getCreatedDate() {
		return StringUtils.dateFormat(createdDate);
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
