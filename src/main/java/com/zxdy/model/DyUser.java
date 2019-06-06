package com.zxdy.model;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class DyUser {
    private Integer uid;

    private String uname;

    private String upwd;

    private String ugender;

    private String uemail;

    private Integer urole;

    private String uhead;

    private Date uregdate;

    private Date ulastlogin;

    private Date ulastemit;

    private Integer upermit;
    
	private List<DyTopic> topics;
    
	public List<DyTopic> getTopics() {
		return topics;
	}

	public void setTopics(List<DyTopic> topics) {
		this.topics = topics;
	}

	public List<DyRevert> getReverts() {
		return reverts;
	}

	public void setReverts(List<DyRevert> reverts) {
		this.reverts = reverts;
	}

	public List<DyTopicGroup> getTopicGroups() {
		return topicGroups;
	}

	public void setTopicGroups(List<DyTopicGroup> topicGroups) {
		this.topicGroups = topicGroups;
	}

	private List<DyRevert> reverts;
	
	private List<DyTopicGroup> topicGroups;
	
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender == null ? null : ugender.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public Integer getUrole() {
        return urole;
    }

    public void setUrole(Integer urole) {
        this.urole = urole;
    }

	public String getUhead() {
        return uhead;
    }

    public void setUhead(String uhead) {
        this.uhead = uhead == null ? null : uhead.trim();
    }

    public Date getUregdate() {
        return uregdate;
    }

    public void setUregdate(Date uregdate) {
        this.uregdate = uregdate;
    }

    public Date getUlastlogin() {
        return ulastlogin;
    }

    public void setUlastlogin(Date ulastlogin) {
        this.ulastlogin = ulastlogin;
    }

    public Date getUlastemit() {
        return ulastemit;
    }

    public void setUlastemit(Date ulastemit) {
        this.ulastemit = ulastemit;
    }

    public Integer getUpermit() {
        return upermit;
    }

    public void setUpermit(Integer upermit) {
        this.upermit = upermit;
    }
}