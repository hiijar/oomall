package xmu.good.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 专题信息
 * @Date: Created in 16:00 2019/11/29
 * @Modified By:
 **/

public class Topic {

    private Integer id;
    /**
     * 专题图片的url的list
     */
    private String picUrlList;
    /**
     * 专题的内容
     */
    private String content;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", picUrlList='" + picUrlList + '\'' +
                ", content='" + content + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id);
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

    public String getPicUrlList() {
        return picUrlList;
    }

    public void setPicUrlList(String picUrlList) {
        this.picUrlList = picUrlList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
