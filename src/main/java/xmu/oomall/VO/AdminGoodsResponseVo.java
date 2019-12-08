package xmu.oomall.controller.vo;


import xmu.oomall.domain.*;

import java.util.List;

/**
 * WX端 GET /goods/{id}的返回值VO
 */
public class AdminGoodsResponseVo {

    /**
     * 商品信息
     */
    private  Goods goods;

    /**
     * 商品的种类信息
     */
    private GoodsCategory goodsCategory;

    /**
     * 商品的品牌信息
     */
    private Brand brand;

    /**
     * 商品的返点规则
     */
    private List<ShareRule> shareRules;

    /**
     * 商品的规格
     */
    private List<Product> products;

    /**
     * todo
     * 商品的预售规则
     */
    // private PreSaleGoods preSaleGoods;

    /**
     * 商品的特殊运费规则，若无，则为null
     */
    private SpecialFreight specialFreight;

    /**
     * 商品的团购规则，若无，则为null
     */
    private GroupOnRule grouponRule;

    @Override
    public String toString() {
        return "AdminGoodsResponseVo{" +
                "goods=" + goods +
                ", goodsCategory=" + goodsCategory +
                ", brand=" + brand +
                ", shareRules=" + shareRules +
                ", products=" + products +
                ", specialFreight=" + specialFreight +
                ", grouponRule=" + grouponRule +
                '}';
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsCategory getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(GoodsCategory goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<ShareRule> getShareRules() {
        return shareRules;
    }

    public void setShareRules(List<ShareRule> shareRules) {
        this.shareRules = shareRules;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public SpecialFreight getSpecialFreight() {
        return specialFreight;
    }

    public void setSpecialFreight(SpecialFreight specialFreight) {
        this.specialFreight = specialFreight;
    }

    public GroupOnRule getGrouponRule() {
        return grouponRule;
    }

    public void setGrouponRule(GroupOnRule grouponRule) {
        this.grouponRule = grouponRule;
    }
}

