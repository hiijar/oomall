package xmu.oomall.controller;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;
import xmu.oomall.domain.*;

import javax.validation.constraints.NotNull;

/**
 * @Author 
 * @create 
 */

@RestController
@RequestMapping("/")
public interface GoodsController {


    /**
     * 根据条件搜索品牌
     * @param id
     * @param name
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    @GetMapping("/admins/brands")
    public Object listBrandByCodition(String id, String name,
                                      @RequestParam(defaultValue = "1") Integer page,
                                      @RequestParam(defaultValue = "10") Integer limit,
                                      @Sort @RequestParam(defaultValue = "add_time") String sort,
                                      @Order @RequestParam(defaultValue = "desc") String order) ;


    /**
     * 创建一个品牌
     * @param brand
     * @return
     */
    @PostMapping("/brands")
    public Object addBrand(@RequestBody Brand brand);

    /**
     * 查看单个品牌信息
     * @param id
     * @return
     */
    @GetMapping("/brands/{id}")
    public Object getBrandById(@PathVariable Integer id);

    /**
     * 修改单个品牌的信息
     * @param id
     * @param brand
     * @return
     */
    @PutMapping("/brands/{id}")
    public Object updateBrandById(@PathVariable Integer id, @RequestBody Brand brand);


    /**
     * 删除一个品牌
     * @param brand
     * @return
     */
    @DeleteMapping("/brands/{id}")
    public Object deleteBrandById(@RequestBody Brand brand) ;


    /**
     * 查看所有的分类
     * @return
     */
    @GetMapping("/categories")
    public Object listGoodsCategory() ;


    /**
     * 新建一个分类
     * @param goodsCategory
     * @return
     */
    @PostMapping("/categories")
    public Object addGoodsCategory(@RequestBody GoodsCategory goodsCategory);

    /**
     * 查看单个分类信息
     * @param id
     * @return
     */
    @GetMapping("/categories/{id}")
    public Object getGoodsCategoryById(@NotNull Integer id) ;


    /**
     * 修改分类信息
     * @param id
     * @param goodsCategory
     * @return
     */
    @PutMapping("/categories/{id}")
    public Object updateGoodsCategoryById(@PathVariable Integer id, @RequestBody GoodsCategory goodsCategory);


    /**
     * 删除单个分类
     * @param id
     * @param goodsCategory
     * @return
     */
    @DeleteMapping("/categories/{id}")
    public Object deleteGoodsCategory(@PathVariable Integer id, @RequestBody GoodsCategory goodsCategory) ;


    /**
     * 查看所有一级分类
     * @return
     */
    @GetMapping("/categories/l1")
    public Object listOneLevelGoodsCategory() ;

    /**
     * 获取商品列表
     *
     * @param goodsSn
     * @param name
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    @GetMapping("/goods")
    public Object listGoods(String goodsSn, String name,
                            @RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer limit,
                            @Sort @RequestParam(defaultValue = "add_time") String sort,
                            @Order @RequestParam(defaultValue = "desc") String order);



    /**
     * 根据id更新商品信息
     *
     * @param goodsAllinone
     * @return
     */
    @PutMapping("/goods/{id}")
    public Object updateGoodsById(@PathVariable Integer id, @RequestBody GoodsAllinone goodsAllinone);

    /**
     * 根据id删除商品信息
     *
     * @param goods
     * @return
     */
    @DeleteMapping("/goods/{id}")
    public Object deleteGoodsById(@PathVariable Integer id);

    /**
     * 新建商品
     *
     * @param goodsAllinone
     * @return
     */
    @PostMapping("/goods")
    public Object addGoods(@RequestBody GoodsAllinone goodsAllinone);

    /**
     * 根据id获取某个商品
     *
     * @param id
     * @return
     */
    @GetMapping("/goods/{id}")
    public Object getGoodsById(@NotNull Integer id) ;

    //--------------user

    /**
     * 查看所有品牌
     *
     * @param page 分页页数
     * @param limit 分页大小
     * @return 品牌列表
     */
    @GetMapping("/brands")
    public Object listBrand(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer limit,
                            @Sort @RequestParam(defaultValue = "add_time") String sort,
                            @Order @RequestParam(defaultValue = "desc") String order) ;

    /**
     * 获取二级分类
     * @param id
     * @return
     */
    @GetMapping("/categories/l2")
    public Object listSecondLevelGoodsCategory(@NotNull Integer id) ;



    /**
     * 获取当前一级分类下的二级分类
     *
     * @param id 分类类目ID
     * @return 当前分类栏目
     */
    @GetMapping("categories/l1/{id}/l2")
    public Object listSecondLevelGoodsCategoryById(@NotNull Integer id);

    /**
	 * 获取商品信息列表
	 * <p>
	 * 用户可以不登录。
	 * 如果用户登录，则记录用户足迹以及返回用户收藏信息。
	 *
	 * @param userId 用户ID
	 * @param id     商品ID
	 * @return 商品详情
	 */
	@GetMapping("/goods")
	public Object getGoodsById(@LoginUser Integer userId, @NotNull Integer id) ;


	/**
	 * 根据条件搜索商品
	 * <p>
	 * 1. 这里的前五个参数都是可选的，甚至都是空
	 * 2. 用户是可选登录，如果登录，则记录用户的搜索关键字
	 *
	 * @param goodsCategoryId 分类类目ID，可选
	 * @param brandId    品牌商ID，可选
	 * @param keyword    关键字，可选
	 * @param isNew      是否新品，可选
	 * @param isHot      是否热买，可选
	 * @param userId     用户ID
	 * @param page       分页页数
	 * @param limit       分页大小
	 * @param sort       排序方式，支持"add_time", "retail_price"或"name"
	 * @param order      排序类型，顺序或者降序
	 * @return 根据条件搜素的商品详情
	 */
	@GetMapping("/goods/searchinformation")
	public Object listGoodsBySearchInfo(
            Integer goodsCategoryId,
            Integer brandId,
            String keyword,
            Boolean isNew,
            Boolean isHot,
            @LoginUser Integer userId,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer limit,
            @Sort(accepts = {"add_time", "retail_price", "name"}) @RequestParam(defaultValue = "add_time") String sort,
            @Order @RequestParam(defaultValue = "desc") String order) ;

		

	/**
	 * 查看推荐商品
	 *
	 * @param id, 商品ID
	 * @return 商品详情页面推荐商品
	 */
	@GetMapping("/recommendedGoods")
	public Object getRecommendedGoods(@NotNull Integer id) ;

	/**
	 * 查看在售的商品总数
	 *
	 * @return 在售的商品总数
	 */
	@GetMapping("/goodsCounts")
    public Object getGoodsCounts() ;

    /**
     * 根据id获得产品对象
     * @param id
     * @return
     */
	@GetMapping("/product/{id}")
	public Object getProductById(@PathVariable Integer id);

    /**
     *管理员查询商品下的产品
     * @param id
     * @return
     */
	@GetMapping("/goods/{id}/products")
    public Object listProductByGoodsId(@PathVariable Integer id);

    /**
     * 管理员添加商品下的产品
     * @param id
     * @return
     */
    @PostMapping("/goods/{id}/products")
    public Object listProductByGoodsId(@PathVariable Integer id);

    /**
     * 管理员修改商品下的某个产品信息
     * @param id
     * @return
     */
    @PutMapping("/goods/{id}/products/{id}")
    public Object updateProductById(@PathVariable Integer id);

    /**
     * @PathVariable Integer id
     * @param id
     * @return
     */
    @DeleteMapping("/goods/{id}/products/{id}")
    public Object deleteProductById(@PathVariable Integer id);
}
