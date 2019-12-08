package xmu.oomall.controller.vo;

/**
 * admin端的 GET /footprints 请求VO
 */
public class AdminFootprintsRequestVo {
    /**
     * 根据用户id来搜索足迹
     */
    private Integer userId;

    /**
     * 根据商品id来搜索足迹
     */
    private Integer goodsId;

    /**
     * 根据用户名搜索足迹
     */
    private String userName;

    /**
     * 根据商品名搜索足迹
     */
    private String goodsName;

    /**
     * 第几页
     */
    private Integer page;

    /**
     * 一页多大
     */
    private Integer limit;

    /**
     * 按照什么排序，如add_time
     */
    private String sort;

    /**
     * 按照升序或降序排序,如desc
     */
    private String order;

    @Override
    public String toString() {
        return "AdminFootprintsRequestVo{" +
                "userId=" + userId +
                ", goodsId=" + goodsId +
                ", userName='" + userName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                '}';
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
