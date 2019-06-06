package com.zxdy.model;

import java.util.Date;

public class DyTopic {
    private Integer tid;

    private Integer uid;

    private Integer tgid;

    private String ttitle;

    private Date tdate;

    private Integer treadcount;

    private String tcontent;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTgid() {
        return tgid;
    }

    public void setTgid(Integer tgid) {
        this.tgid = tgid;
    }

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle == null ? null : ttitle.trim();
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }

    public Integer getTreadcount() {
        return treadcount;
    }

    public void setTreadcount(Integer treadcount) {
        this.treadcount = treadcount;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent == null ? null : tcontent.trim();
    }
}