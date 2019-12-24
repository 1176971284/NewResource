package com.hjcrm.system.entity;

import java.sql.Timestamp;

public class Dept {

    private int deptid;// bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
    private int deptparaid;//bigint(20) DEFAULT NULL COMMENT '上级部门ID',
    private String deptname;//` varchar(50) DEFAULT NULL COMMENT '部门名称',
    private String deptcode;//` varchar(20) DEFAULT NULL COMMENT '部门编码',
    private int dr;//` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志 0未删除 1已删除',
    private Timestamp create_time;//` timestamp NULL DEFAULT NULL COMMENT '创建时间',
    private int create_id;//` bigint(20) DEFAULT NULL COMMENT '创建人',
    private Timestamp update_time;//` timestamp NULL DEFAULT NULL COMMENT '修改时间',
    private int update_id;//` bigint(20) DEFAULT NULL COMMENT '修改人',


    public Dept() {
    }

    public Dept(int deptid, int deptparaid, String deptname, String deptcode, int dr, Timestamp create_time, int create_id, Timestamp update_time, int update_id) {
        this.deptid = deptid;
        this.deptparaid = deptparaid;
        this.deptname = deptname;
        this.deptcode = deptcode;
        this.dr = dr;
        this.create_time = create_time;
        this.create_id = create_id;
        this.update_time = update_time;
        this.update_id = update_id;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public int getDeptparaid() {
        return deptparaid;
    }

    public void setDeptparaid(int deptparaid) {
        this.deptparaid = deptparaid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", deptparaid=" + deptparaid +
                ", deptname='" + deptname + '\'' +
                ", deptcode='" + deptcode + '\'' +
                ", dr=" + dr +
                ", create_time=" + create_time +
                ", create_id=" + create_id +
                ", update_time=" + update_time +
                ", update_id=" + update_id +
                '}';
    }
}