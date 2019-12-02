package com.oomall.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:日志信息
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class Log {
    private Integer id;
    /**
     * 进行该操作的管理员ID
     */
    private Integer adminIdId;
    /**
     * 操作者的IP地址
     */
    private String ip;
    /**
     * 操作的类型
     */
    private short type;
    /**
     * 操作的动作
     */
    private String action;
    /**
     * 操作的状态(如 200)
     */
    private short statusCode;
    /**
     * 操作对象的ID
     */
    private Integer actionId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDelete;

    @java.lang.Override
    public java.lang.String toString() {
        return "Log{" +
                "id=" + id +
                ", adminIdId=" + adminIdId +
                ", ip='" + ip + '\'' +
                ", type=" + type +
                ", action='" + action + '\'' +
                ", statusCode=" + statusCode +
                ", actionId=" + actionId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDelete=" + beDelete +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Log log = (Log) o;
        return Objects.equals(id, log.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminIdId() {
        return adminIdId;
    }

    public void setAdminIdId(Integer adminIdId) {
        this.adminIdId = adminIdId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public short getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(short statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getBeDelete() {
        return beDelete;
    }

    public void setBeDelete(Boolean beDelete) {
        this.beDelete = beDelete;
    }
}
