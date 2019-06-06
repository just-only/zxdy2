package com.zxdy.model;

public class DyApply {
    private Integer aid;

    private Integer uid;

    private Integer tgid;

    private String areason;

    private Integer aflag;

    private String astatus;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    public String getAreason() {
        return areason;
    }

    public void setAreason(String areason) {
        this.areason = areason == null ? null : areason.trim();
    }

    public Integer getAflag() {
        return aflag;
    }

    public void setAflag(Integer aflag) {
        this.aflag = aflag;
    }

    public String getAstatus() {
        return astatus;
    }

    public void setAstatus(String astatus) {
        this.astatus = astatus == null ? null : astatus.trim();
    }
}