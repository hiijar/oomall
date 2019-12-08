package xmu.oomall.controller.vo;


import xmu.oomall.domain.*;

import java.util.List;

/**
 * WX端 GET /goods/{id}的返回值VO
 */
public class GooodsVo {

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
    private GrouponRule grouponRule;

}
