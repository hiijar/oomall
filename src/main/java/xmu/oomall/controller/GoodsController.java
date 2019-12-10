package xmu.oomall.controller;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;
import xmu.oomall.domain.*;

import javax.validation.constraints.NotNull;

/**
 * @Author 模块标准组
 * @Description:商品模块外部及内部api
 * @create 2019/12/3 18:30
 */

@RestController
@RequestMapping("/goodsService")
public interface GoodsController {

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
    public Object listProductByGoodsId(@PathVariable Integer id,@RequestBody Product product);

    /**
     * 管理员修改商品下的某个产品信息
     * @param id
     * @return
     */
    @PutMapping("/products/{id}")
    public Object updateProductById(@PathVariable Integer id,@RequestBody Product product);

    /**
     * 管理员删除商品下的某个产品信息
     * @param id
     * @return
     */
    @DeleteMapping("/products/{id}")
    public Object deleteProductById(@PathVariable Integer id);

    /**
     * 新建商品
     *
     * @param goodsAllinone
     * @return
     */
    @PostMapping("/goods")
    public Object addGoods(@RequestBody Goods goods);

    /**
     * 根据id获取某个商品
     * @param id
     * @return
     */
    @GetMapping("/goods/{id}")
    public Object getGoodsById(Integer id) ;

    /**
     * 根据id更新商品信息
     * @param goodsAllinone
     * @return
     */
    @PutMapping("/goods/{id}")
    public Object updateGoodsById(@PathVariable Integer id, @RequestBody Goods goods);

    /**
     * 根据id删除商品信息
     * @param id
     * @return
     */
    @DeleteMapping("/goods/{id}")
    public Object deleteGoodsById(@PathVariable Integer id);

    /**
     * 获取商品分类信息
     * @return
     */
    @GetMapping("/categories/{id}/goods")
    public Object getCategoriesInfoById();

    /**
     * 根据条件搜素商品
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
                            @RequestParam Integer page,
                            @RequestParam Integer limit,
                            @RequestParam String sort,
                            @RequestParam String order);

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
    public Object listBrandByCondition(String id, String name,
                                      @RequestParam Integer page,
                                      @RequestParam Integer limit,
                                      @RequestParam String sort,
                                      @RequestParam String order) ;


    /**
     * 创建一个品牌
     * @param brand
     * @return
     */
    @PostMapping("/brands")
    public Object addBrand(@RequestBody Brand brand);

    /**
     * 查看品牌详情,此API与商城端/brands/{id}完全相同
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
    public Object getGoodsCategoryById(Integer id) ;

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
     * 查看所有品牌
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    @GetMapping("/brands")
    public Object listBrand(@RequestParam Integer page,
                            @RequestParam Integer limit,
                            @RequestParam String sort,
                            @RequestParam String order) ;

    /**
     * 获取当前一级分类下的二级分类
     *
     * @param id 分类类目ID
     * @return 当前分类栏目
     */
    @GetMapping("categories/l1/{id}/l2")
    public Object listSecondLevelGoodsCategoryById(Integer id);

    /**
     * 根据id获得产品对象
     * @param id
     * @return
     */
	@GetMapping("/product/{id}")
	public Object getProductById(@PathVariable Integer id);


}
