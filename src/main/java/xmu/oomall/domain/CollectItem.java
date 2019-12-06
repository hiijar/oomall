package xmu.good.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:收藏明细
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class CollectItem {
    private Integer id;
    /**
    *商品id
    */
    private Integer goodsId;
    /**
    *用户id
    */
    private Integer userId;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    @Override
    public String toString() {
        return "CollectItem{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", userId=" + userId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        CollectItem that = (CollectItem) o;
        return Objects.equals(id, that.id);
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}
