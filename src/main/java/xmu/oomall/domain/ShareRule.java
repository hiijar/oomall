package xmu.good.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 分享规则
 * @Date: Created in 16:00 2019/11/29
 * @Modified By:
 **/

public class ShareRule {
    private Integer id;
    /**
    *该分享活动开始时间
    */
    private LocalDateTime beginTime;
    /**
    * 该分享活动结束时间
    */
    private LocalDateTime endTime;
    /**
    * 分享等级（分享次数所对应返利）
    */
    private String shareLevelStrategy;
    /**
    *商品ID
    */
    private Integer goodsId;

    private Boolean beDeleted;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "ShareRule{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", shareLevelStrategy='" + shareLevelStrategy + '\'' +
                ", goodsId=" + goodsId +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ShareRule shareRule = (ShareRule) o;
        return Objects.equals(id, shareRule.id);
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

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getShareLevelStrategy() {
        return shareLevelStrategy;
    }

    public void setShareLevelStrategy(String shareLevelStrategy) {
        this.shareLevelStrategy = shareLevelStrategy;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getBeDeleted() {
        return beDeleted;
    }

    public void setBeDeleted(Boolean beDeleted) {
        this.beDeleted = beDeleted;
    }
}
