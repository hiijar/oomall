package xmu.good.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:足迹信息
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class FootPrintItem {
    private Integer id;

    /**
    *创建时间
    */
    private LocalDateTime birthTime;
    /**
    *用户id
    */
    private Integer userId;
    /**
    *商品id
    */
    private Integer goodsId;
    private LocalDateTime gmtCreate;

    @Override
    public String toString() {
        return "FootPrintItem{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", birthTime=" + birthTime +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        FootPrintItem that = (FootPrintItem) o;
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

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(LocalDateTime birthTime) {
        this.birthTime = birthTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
