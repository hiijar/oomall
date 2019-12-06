package xmu.good.oomall.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 特殊运费模板
 * @Date: Created in 16:00 2019/11/29
 * @Modified By:
 **/

public class SpecialFreight {

    private Integer id;
    /**
     * 首几件
     */
    private Integer firstNumPiece;
    /**
     * 首几件价格
     */
    private BigDecimal firstNumPiecePrice;
    /**
     * 续几件
     */
    private Integer continueNumPiece;
    /**
     * 续几件的价格
     */
    private BigDecimal continueNumPiecePrice;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "SpecialFreight{" +
                "id=" + id +
                ", firstNumPiece=" + firstNumPiece +
                ", firstNumPiecePrice=" + firstNumPiecePrice +
                ", continueNumPiece=" + continueNumPiece +
                ", continueNumPiecePrice=" + continueNumPiecePrice +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        SpecialFreight that = (SpecialFreight) o;
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

    public Integer getFirstNumPiece() {
        return firstNumPiece;
    }

    public void setFirstNumPiece(Integer firstNumPiece) {
        this.firstNumPiece = firstNumPiece;
    }

    public BigDecimal getFirstNumPiecePrice() {
        return firstNumPiecePrice;
    }

    public void setFirstNumPiecePrice(BigDecimal firstNumPiecePrice) {
        this.firstNumPiecePrice = firstNumPiecePrice;
    }

    public Integer getContinueNumPiece() {
        return continueNumPiece;
    }

    public void setContinueNumPiece(Integer continueNumPiece) {
        this.continueNumPiece = continueNumPiece;
    }

    public BigDecimal getContinueNumPiecePrice() {
        return continueNumPiecePrice;
    }

    public void setContinueNumPiecePrice(BigDecimal continueNumPiecePrice) {
        this.continueNumPiecePrice = continueNumPiecePrice;
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
