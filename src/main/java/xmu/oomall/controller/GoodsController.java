package xmu.oomall.controller;


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
     * @return List<ProductVo>，所属该商品的产品列表
     */
    @GetMapping("/goods/{id}/products")
    public Object listProductByGoodsId(@PathVariable Integer id);

    /**
     * 管理员添加商品下的产品
     * @param id
     * @param product
     * @return Product，新添加的产品信息
     */
    @PostMapping("/goods/{id}/products")
    public Object addProductByGoodsId(@PathVariable Integer id,@RequestBody Product product);

    /**
     * 管理员修改商品下的某个产品信息
     * @param id
     * @param product
     * @return Product，修改后的产品信息
     */
    @PutMapping("/products/{id}")
    public Object updateProductById(@PathVariable Integer id,@RequestBody Product product);

    /**
     * 管理员删除商品下的某个产品信息
     * @param id
     * @return 无（ResponseUtil.ok()即可）
     */
    @DeleteMapping("/products/{id}")
    public Object deleteProductById(@PathVariable Integer id);

//    /**
//     * 获取商品列表
//     * @return
//     */
//    @GetMapping("/goods")
//    public Object listGoods();

    /**
     * 新建/上架一个商品
     *
     * @param goods
     * @return Goods，即新建的一个商品
     */
    @PostMapping("/goods")
    public Object addGoods(@RequestBody Goods goods);

    /**
     * 根据id获取某个商品
     * @param id
     * @return GoodsVo，即商品的信息，此URL与WX端是同一个URL
     */
    @GetMapping("/goods/{id}")
    public Object getGoodsById(Integer id) ;

    /**
     * 根据id更新商品信息
     * @param id
     * @param goods
     * @return Goods，修改后的商品信息
     */
    @PutMapping("/goods/{id}")
    public Object updateGoodsById(@PathVariable Integer id, @RequestBody Goods goods);

    /**
     * 根据id删除商品信息
     * @param id
     * @return  无（即ResponseUtil.ok()即可）
     */
    @DeleteMapping("/goods/{id}")
    public Object deleteGoodsById(@PathVariable Integer id);

    /**
     * 获取商品分类信息
     * @param id
     * @return
     */
    @GetMapping("/categories/{id}/goods")
    public Object getCategoriesInfoById(@PathVariable Integer id);

    /**
     * 根据条件搜索商品
     *
     * @param goodsSn 商品的序列号
     * @param name 商品的名字
     * @param page 第几页
     * @param limit 一页多少
//     * @param sort
//     * @param order
     * @return
     */
    @GetMapping("/goods")
    public Object listGoods(@RequestParam String goodsSn,
                            @RequestParam String name,
                            @RequestParam Integer page,
                            @RequestParam Integer limit
//                            @RequestParam String sort,
//                            @RequestParam String order
    );

    /**
     * 根据条件搜索品牌
     * @return List<Brand>
     */
    @GetMapping("/admins/brands")
    public Object listBrand() ;


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
    public Object updateBrandById(@PathVariable Integer id,@RequestBody Brand brand);

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
    public Object getGoodsCategoryById(@PathVariable Integer id) ;

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
     * @return List<Brand>
     */
    @GetMapping("/brands")
    public Object listBrand() ;

    /**
     * 获取当前一级分类下的二级分类
     *
     * @param id 分类类目ID
     * @return 当前分类栏目
     */
    @GetMapping("categories/l1/{id}/l2")
    public Object listSecondLevelGoodsCategoryById(@PathVariable Integer Integer id);

    /**
     * 根据id获得产品对象 - 内部
     * @param id
     * @return
     */
	@GetMapping("/product/{id}")
	public Object getProductById(@PathVariable Integer id);

    /**
     * 判断商品是否在售 - 内部
     * @param id
     * @return
     */
	@GetMapping("/goods/{id}/isOnSale")
	public Object isGoodsOnSale(@PathVariable Integer id);

}
