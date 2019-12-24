package com.hjcrm.system.entity;

import java.sql.Timestamp;

public class User {

    private int userid;// bigint(30) NOT NULL AUTO_INCREMENT COMMENT '用户id',
    private String username;//varchar(50) DEFAULT NULL COMMENT '用户真实姓名',
    private String nickname;//varchar(100) DEFAULT NULL COMMENT '用户昵称',
    private String password;// varchar(50) DEFAULT NULL COMMENT '密码',
    private String email;// varchar(50) DEFAULT NULL COMMENT '邮箱',
    private String userphoto;// varchar(200) DEFAULT NULL COMMENT '头像',
    private String phone;// varchar(20) DEFAULT NULL COMMENT '手机号码',
    private String mobile;// varchar(20) DEFAULT NULL COMMENT '座机号码',
    private int deptid;// bigint(30) DEFAULT NULL COMMENT '部门ID',
    private int roleid;// bigint(30) DEFAULT NULL COMMENT '角色ID',
    private int state;// int(1) DEFAULT '0' COMMENT '状态 0 可用  1不可用',
    private int sex;// int(1) DEFAULT '0' COMMENT '性别  0男  1女',
    private String wxopenid;// varchar(30) DEFAULT NULL COMMENT '关联微信ID',
    private String qqopenid;// varchar(30) DEFAULT NULL COMMENT '关联QQID',
    private int dr;// int(1) NOT NULL DEFAULT '0' COMMENT '删除标志 0未删除 1已删除',
    private Timestamp create_time;// timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    private int create_id;// bigint(20) DEFAULT NULL COMMENT '创建人',
    private Timestamp update_time;//timestamp NULL DEFAULT NULL COMMENT '更新时间',
    private int update_id;// bigint(20) DEFAULT NULL COMMENT '更新人',
    private String note;// varchar(200) DEFAULT NULL COMMENT '备注',
    private int ischange;// int(1) DEFAULT '0' COMMENT '是否修改密码 0无1修改',
    private int deptgroup;// int(1) DEFAULT '0' COMMENT '部门大类：0市场部 、1基金销售、 2机构客户部、 3重庆代理1、4重庆代理2 、5西安代理 、6南京代理1、 7南京代理2、8苏州代理、9泰州代理、10长春代理 、11太原代理',

    public User() {
    }


    public User(int userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    public User(int userid, String username, String nickname, String password, String email, String userphoto, String phone, String mobile, int deptid, int roleid, int state, int sex, String wxopenid, String qqopenid, int dr, Timestamp create_time, int create_id, Timestamp update_time, int update_id, String note, int ischange, int deptgroup) {
        this.userid = userid;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.userphoto = userphoto;
        this.phone = phone;
        this.mobile = mobile;
        this.deptid = deptid;
        this.roleid = roleid;
        this.state = state;
        this.sex = sex;
        this.wxopenid = wxopenid;
        this.qqopenid = qqopenid;
        this.dr = dr;
        this.create_time = create_time;
        this.create_id = create_id;
        this.update_time = update_time;
        this.update_id = update_id;
        this.note = note;
        this.ischange = ischange;
        this.deptgroup = deptgroup;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserphoto() {
        return userphoto;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid;
    }

    public String getQqopenid() {
        return qqopenid;
    }

    public void setQqopenid(String qqopenid) {
        this.qqopenid = qqopenid;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIschange() {
        return ischange;
    }

    public void setIschange(int ischange) {
        this.ischange = ischange;
    }

    public int getDeptgroup() {
        return deptgroup;
    }

    public void setDeptgroup(int deptgroup) {
        this.deptgroup = deptgroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userphoto='" + userphoto + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", deptid=" + deptid +
                ", roleid=" + roleid +
                ", state=" + state +
                ", sex=" + sex +
                ", wxopenid='" + wxopenid + '\'' +
                ", qqopenid='" + qqopenid + '\'' +
                ", dr=" + dr +
                ", create_time=" + create_time +
                ", create_id=" + create_id +
                ", update_time=" + update_time +
                ", update_id=" + update_id +
                ", note='" + note + '\'' +
                ", ischange=" + ischange +
                ", deptgroup=" + deptgroup +
                '}';
    }
}
