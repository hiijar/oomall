package com.oomall.oomall.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class SpecialFreight {

    private Integer id;
    /**
     * 首几件
     */
    private Short firstXPiece;
    /**
     * 首几件价格
     */
    private BigDecimal firstXPiecePrice;
    /**
     * 续几件
     */
    private Short continueXPiece;
    /**
     * 续几件的价格
     */
    private BigDecimal continueXPiecePrice;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDelete;

    @Override
    public String toString() {
        return "SpecialFreight{" +
                "id=" + id +
                ", firstXPiece=" + firstXPiece +
                ", firstXPiecePrice=" + firstXPiecePrice +
                ", continueXPiece=" + continueXPiece +
                ", continueXPiecePrice=" + continueXPiecePrice +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDelete=" + beDelete +
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

    public Short getFirstXPiece() {
        return firstXPiece;
    }

    public void setFirstXPiece(Short firstXPiece) {
        this.firstXPiece = firstXPiece;
    }

    public BigDecimal getFirstXPiecePrice() {
        return firstXPiecePrice;
    }

    public void setFirstXPiecePrice(BigDecimal firstXPiecePrice) {
        this.firstXPiecePrice = firstXPiecePrice;
    }

    public Short getContinueXPiece() {
        return continueXPiece;
    }

    public void setContinueXPiece(Short continueXPiece) {
        this.continueXPiece = continueXPiece;
    }

    public BigDecimal getContinueXPiecePrice() {
        return continueXPiecePrice;
    }

    public void setContinueXPiecePrice(BigDecimal continueXPiecePrice) {
        this.continueXPiecePrice = continueXPiecePrice;
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
