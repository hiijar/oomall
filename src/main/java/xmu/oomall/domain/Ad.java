package xmu.good.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:广告信息
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class Ad {
    private Integer id;
    /**
     * 该广告的链接
     */
    private String link;
    /**
     * 该广告的名称
     */
    private String name;
    /**
     * 该广告的内容
     */
    private String content;
    /**
     * 该广告显示时的图片
     */
    private String picUrl;
    /**
     * 该广告是否是默认广告
     * 0: 不是   1：是
     */
    private Boolean beDefault;
    /**
     * 该广告是否启用
     */
    private Boolean beEnable;
    /**
     * 该广告上线的时间
     */
    private LocalDateTime startTime;
    /**
     * 该广告下线的时间
     */
    private LocalDateTime endTime;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", beDefault=" + beDefault +
                ", beEnable=" + beEnable +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Ad ad = (Ad) o;
        return Objects.equals(id, ad.id);
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Boolean getBeDefault() {
        return beDefault;
    }

    public void setBeDefault(Boolean beDefault) {
        this.beDefault = beDefault;
    }

    public Boolean getBeEnable() {
        return beEnable;
    }

    public void setBeEnable(Boolean beEnable) {
        this.beEnable = beEnable;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
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

    public Boolean getBeDeleted() {
        return beDeleted;
    }

    public void setBeDeleted(Boolean beDeleted) {
        this.beDeleted = beDeleted;
    }
}
