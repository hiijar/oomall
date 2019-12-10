package xmu.oomall.controller.vo;

/**
 * admin端的 GET /topics 请求VO
 */
public class AdminTopicsRequestVo {

    // //根据专题标题搜索专题
    // private String name;
    // //根据专题子标题搜索专题
    // private String subName;


    //根据内容搜索专题
    private String content;
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
        return "AdminTopicsRequestVo{" +
                // "name="+ name +
                // ", subName="+ subName +
                ", content=" + content +
                ", page=" + page +
                ", limit=" + limit +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                '}';
    }


    // public String getName(){
    //     return name;
    // }
    // public void setName(String name){
    //     this.name=name;
    // }

    // public String subName(){
    //     return subName;
    // }

    // public void setSubName(String subName){
    //     this.subName=subName;
    // }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content=content;
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
