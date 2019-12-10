package xmu.oomall.controller.vo;

/**
 * admin端的 GET /roles 请求VO
 */
public class AdminRolesRequestVo {
    /**
     * 根据角色名称来搜索角色
     */
    private String name;

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
        return "AdminRolesRequestVo{" +
                // "userId=" + userId +
                // ", goodsId=" + goodsId +
                // ", userName='" + userName + '\'' +
                // ", goodsName='" + goodsName + '\'' +
                ", name=" + name +
                ", page=" + page +
                ", limit=" + limit +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
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
