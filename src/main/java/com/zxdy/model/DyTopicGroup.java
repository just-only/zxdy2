package com.zxdy.model;

public class DyTopicGroup {
    private Integer tgid;

    private String tgname;

    private String tdetail;

    public Integer getTgid() {
        return tgid;
    }

    public void setTgid(Integer tgid) {
        this.tgid = tgid;
    }

    public String getTgname() {
        return tgname;
    }

    public void setTgname(String tgname) {
        this.tgname = tgname == null ? null : tgname.trim();
    }

    public String getTdetail() {
        return tdetail;
    }

    public void setTdetail(String tdetail) {
        this.tdetail = tdetail == null ? null : tdetail.trim();
    }
}