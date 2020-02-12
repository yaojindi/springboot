package com.lianxi.Model;

public class Dept {


    private Integer did;//员工号
    private String dname; // 员工姓名
    private String dsex; //员工性别


    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDsex() {
        return dsex;
    }

    public void setDsex(String dsex) {
        this.dsex = dsex;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dsex='" + dsex + '\'' +
                '}';
    }
}
