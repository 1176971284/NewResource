package com.hjcrm.system.entity;

import java.sql.Timestamp;
import java.util.List;

public class Menu {

    private int menuid;// bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
    private int menuparaid;// bigint(20) DEFAULT NULL COMMENT '上级菜单ID',
    private String menuname;// varchar(50) DEFAULT NULL COMMENT '菜单名称',
    private String menucode;// varchar(50) DEFAULT NULL COMMENT '菜单编码',
    private int menuno;//` int(10) DEFAULT NULL COMMENT '菜单序号',
    private String menuurl;//` varchar(200) DEFAULT NULL COMMENT '菜单URL',
    private String menuimgurl;//` varchar(300) DEFAULT NULL COMMENT '菜单图片地址url',
    private int dr;//` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志 0未删除 1已删除',
    private int menutype;//` int(1) DEFAULT NULL COMMENT '菜单类型',
    private Timestamp create_time;//` timestamp NULL DEFAULT NULL COMMENT '创建时间',
    private Timestamp update_time;//` timestamp NULL DEFAULT NULL COMMENT '更新时间',
    private int create_id;//` bigint(20) DEFAULT NULL COMMENT '创建人',
    private int update_id;//` bigint(20) DEFAULT NULL COMMENT '更新人',

    private List<Menu> children; //子菜单集合


    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Menu() {
    }

    public Menu(int menuid, int menuparaid, String menuname, String menucode, int menuno, String menuurl, String menuimgurl, int dr, int menutype, Timestamp create_time, Timestamp update_time, int create_id, int update_id) {
        this.menuid = menuid;
        this.menuparaid = menuparaid;
        this.menuname = menuname;
        this.menucode = menucode;
        this.menuno = menuno;
        this.menuurl = menuurl;
        this.menuimgurl = menuimgurl;
        this.dr = dr;
        this.menutype = menutype;
        this.create_time = create_time;
        this.update_time = update_time;
        this.create_id = create_id;
        this.update_id = update_id;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public int getMenuparaid() {
        return menuparaid;
    }

    public void setMenuparaid(int menuparaid) {
        this.menuparaid = menuparaid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public int getMenuno() {
        return menuno;
    }

    public void setMenuno(int menuno) {
        this.menuno = menuno;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public String getMenuimgurl() {
        return menuimgurl;
    }

    public void setMenuimgurl(String menuimgurl) {
        this.menuimgurl = menuimgurl;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

    public int getMenutype() {
        return menutype;
    }

    public void setMenutype(int menutype) {
        this.menutype = menutype;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuid=" + menuid +
                ", menuparaid=" + menuparaid +
                ", menuname='" + menuname + '\'' +
                ", menucode='" + menucode + '\'' +
                ", menuno=" + menuno +
                ", menuurl='" + menuurl + '\'' +
                ", menuimgurl='" + menuimgurl + '\'' +
                ", dr=" + dr +
                ", menutype=" + menutype +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", create_id=" + create_id +
                ", update_id=" + update_id +
                ", children=" + children +
                '}';
    }
}
