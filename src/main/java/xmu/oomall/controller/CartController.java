/*
package 和 import 需要根据项目导入
 */

/**
 * 用户购物车服务
 */
@RestController
@RequestMapping("")// 购物车
@Validated
@Api()
public interface CartController {

    /**
     * 用户购物车信息
     *
     * @param userId 用户ID
     * @return 用户购物车信息
     */
    @GetMapping("/carts")
    @ApiOperation(value = "获取购物车明细 /cartIndex")
    public Object cartIndex(@LoginUser Integer userId) ;

    /**
     * 加入商品到购物车
     * <p>
     * 如果已经存在购物车货品，则增加数量；
     * 否则添加新的购物车货品项。
     *
     * @param userId 用户ID
     * @param cart   购物车商品信息， { goodsId: xxx, productId: xxx, number: xxx }
     * @return 加入购物车操作结果
     */
    @PostMapping("/carts")
    @ApiOperation(value = "添加商品到购物车 /add", notes = "添加一个购物车项")
    public Object add(@LoginUser Integer userId, @RequestBody Cart cart) ;

    /**
     * 立即购买
     * <p>
     * 和add方法的区别在于：
     * 1. 如果购物车内已经存在购物车货品，前者的逻辑是数量添加，这里的逻辑是数量覆盖
     * 2. 添加成功以后，前者的逻辑是返回当前购物车商品数量，这里的逻辑是返回对应购物车项的ID
     *
     * @param userId 用户ID
     * @param cart   购物车商品信息， { goodsId: xxx, productId: xxx, number: xxx }
     * @return 立即购买操作结果
     */
    @PostMapping("/carts/{id}")
    @ApiOperation(value = "添加一个购物车明细，如果已经存在这种商品，就进行数量覆盖，否则就新增购物车明细 /fastadd", notes = "添加一个购物车项（直接购买）")
    public Object fastadd(@LoginUser Integer userId, @RequestBody Cart cart);

    /**
     * 修改购物车商品货品数量
     *
     * @param userId 用户ID
     * @param cart   购物车商品信息， { id: xxx, goodsId: xxx, productId: xxx, number: xxx }
     * @return 修改结果
     */
    @PutMapping("/carts/{id}")
    @ApiOperation(value = "修改某个购物车项信息 /update", notes = "修改某个购物车项信息")
    public Object update(@LoginUser Integer userId, @RequestBody Cart cart) ;

    /**
     * 购物车商品删除
     *
     * @param userId 用户ID
     * @param body   购物车商品信息， { productIds: xxx }
     * @return 购物车信息
     * 成功则
     * {
     * errno: 0,
     * errmsg: '成功',
     * data: xxx
     * }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @DeleteMapping("/carts/{id}")
    @ApiOperation(value = "删除一个购物车项 /delete", notes = "删除一个购物车项")
    public Object delete(@LoginUser Integer userId, @RequestBody String body);

    /**
     * 购物车商品货品数量
     * <p>
     * 如果用户没有登录，则返回空数据。
     *
     * @param userId 用户ID
     * @return 购物车商品货品数量
     */
    @GetMapping("/carts/count")
    @ApiOperation(value = "返回购物车中所有货品数量 /goodscount")
    public Object goodscount(@LoginUser Integer userId) ;

    /**
     * 购物车下单
     *
     * @param userId    用户ID
     * @param cartId    购物车商品ID：
     *                  如果购物车商品ID是空，则下单当前用户所有购物车商品；
     *                  如果购物车商品ID非空，则只下单当前购物车商品。
     * @param addressId 收货地址ID：
     *                  如果收货地址ID是空，则查询当前用户的默认地址。
     * @param couponId  优惠券ID：
     *                  如果优惠券ID是空，则自动选择合适的优惠券。
     * @return 购物车操作结果
     */
    @PostMapping("/orders")
    @ApiOperation(value = "购物车下单 /checkout")
    public Object checkout(@LoginUser Integer userId, Integer cartId, Integer addressId, Integer couponId, Integer grouponRulesId);

}