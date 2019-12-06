package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zhc
 * @create 2019/12/4 8:30
 */

@RestController
@RequestMapping("/discount")

public interface discountController {
	
	/**
	*根据条件查找优惠券
	*/	
    @GetMapping("/couponRules")
    @ApiOperation(value="根据条件查找优惠券/list")
    public Object list(String name, Short type, Short status,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                       @Order @RequestParam(defaultValue = "desc") String order);
						@RequestParam(defaultValue = "add_time") String sort,
						@RequestParam(defaultValue = "desc") String order);
						
   /**
   *查找某种优惠券被某个用户的领取情况
   */
    @GetMapping("/couponRule/{id}/user/{id}/coupon")
    @ApiOperation("查找某种优惠券被某个用户的领取情况/listuser")
    public Object listuser(Integer userId, Integer id, Short status,
                           @RequestParam(defaultValue = "1") Integer page,
                           @RequestParam(defaultValue = "10") Integer limit,
//                         @Sort @RequestParam(defaultValue = "add_time") String sort,
//                         @Order @RequestParam(defaultValue = "desc") String order);
						   @RequestParam(defaultValue = "add_time") String sort,
                           @RequestParam(defaultValue = "desc") String order);

	/**
	*添加优惠券
	*/
    @PostMapping("/couponRules")
    @ApiOperation(value="添加优惠券/create")
    public Object create(@RequestBody LitemallCoupon coupon);

    /**
	*查看一种优惠券
	*/
    @GetMapping("/couponRules/{id}")
    @ApiOperation(value="查看一种优惠券/read")
    public Object read(@PathVariable Integer id);
	
	 /**
	*修改优惠券信息
	*/
    @PutMapping("/couponRules/{id}")
    @ApiOperation(value="修改优惠券信息/update")
    public Object update(@PathVariable Integer id,@RequestBody LitemallCoupon coupon);

    /**
	*删除一种优惠券
	*/
    @DeleteMapping("/couponRules/{id}")
    @ApiOperation(value="删除一种优惠券/delete")
    public Object delete(@PathVariable Integer id, @RequestBody LitemallCoupon coupon);

	
	/**
     * 优惠券列表
     *
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    @ApiOperation("查看优惠券列表 /list")
    @GetMapping("")
    public Object list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                     @Sort @RequestParam(defaultValue = "add_time") String sort,
//                     @Order @RequestParam(defaultValue = "desc") String order);
					   @RequestParam(defaultValue = "add_time") String sort,
                       @RequestParam(defaultValue = "desc") String order);
    /**
     * 个人优惠券列表
     *
     * @param userId
     * @param status
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    @ApiOperation("查看自己的优惠券 /mylist")
    @GetMapping("/{id}")
    public Object mylist(@LoginUser Integer userId,
                       Short status,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                     @Sort @RequestParam(defaultValue = "add_time") String sort,
//                     @Order @RequestParam(defaultValue = "desc") String order);
					   @RequestParam(defaultValue = "add_time") String sort,
                       @RequestParam(defaultValue = "desc") String order);


    /**
     * 当前购物车下单商品订单可用优惠券
     *
     * @param userId
     * @param cartIds
     * @return
     */
    @ApiOperation("用户查看当前购物车下单商品订单可用优惠券 /selectlist")
    @GetMapping("/availableCoupons")
    public Object selectlist(@LoginUser Integer userId, List<Integer> cartIds);


	/**
	 *Order模块调用Discount模块，计算使用优惠券后的价格
	 */
	@ApiOperation(value="计算使用优惠券后的价格/calcDiscount")
	@GetMapping("/calcDiscount")
	public Object calcDiscount(List<Integer> cartIds, Integer couponId);
	
    /**
     * 优惠券领取
     *
     * @param userId 用户ID
     * @param body 请求内容， { couponId: xxx }
     * @return 操作结果
     */
    @ApiOperation("用户领取一种优惠券 /receive")
    @PostMapping("")
    public Object receive(@LoginUser Integer userId, @RequestBody String body);

	
	/**
	*修改团购规则信息
	*/
    @PutMapping("/grouponRules/{id}")
    @ApiOperation(value = "修改团购规则信息/update", notes = "修改团购规则信息")
    public Object update(@RequestBody LitemallGrouponRules grouponRules);

	/**
	*创建一个新的团购规则
	*/
    @PostMapping("/grouponRules")
    @ApiOperation(value = "创建一个新的团购规则/create", notes = "创建一个新的团购规则")
    public Object create(@RequestBody LitemallGrouponRules grouponRules);

	/**
	*删除一个团购规则
	*/
    @DeleteMapping("/grouponRules/{id}")
    @ApiOperation(value = "删除一个团购规则/delete", notes = "删除一个团购规则")
    public Object delete(@RequestBody LitemallGrouponRules grouponRules);
	
	
	 /**
     * 团购规则列表
     *
     * @param page 分页页数
     * @param limit 分页大小
     * @return 团购规则列表
     */
    @GetMapping("/grouponRules")
    @ApiOperation(value = "获取团购规则列表/list", notes = "获取团购规则列表")
    public Object list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                     @Sort @RequestParam(defaultValue = "add_time") String sort,
//                     @Order @RequestParam(defaultValue = "desc") String order);
					   @RequestParam(defaultValue = "add_time") String sort,
                       @RequestParam(defaultValue = "desc") String order);
    /**
     * 团购活动详情
     *
     * @param userId    用户ID
     * @param grouponRuleId 团购活动规则ID
     * @return 团购活动详情
     */
    @GetMapping("/grouponRules/{id}")
    @ApiOperation(value = "获取团购活动详情/detail", notes = "获取团购活动详情")
    public Object detail(@LoginUser Integer userId, @NotNull Integer grouponRuleId);
	
	
	
    /**
     * 参加团购
     *
     * @param grouponId 团购活动ID
     * @return 操作结果
     */
/*   @GetMapping("/grouponRules/{id}/joinResult")
    @ApiOperation(value = "参加团购操作结果/join", notes = "参加团购操作结果")
    public Object join(@NotNull Integer grouponId);

*/	
	
    /**
     * 用户开团或入团情况
     *
     * @param userId 用户ID
     * @param showType 显示类型，如果是0，则是当前用户开的团购；否则，则是当前用户参加的团购
     * @return 用户开团或入团情况
     */
    @GetMapping("/grouponRules/{id}/joinInformation")
    @ApiOperation(value = "查看用户开团或入团情况/join", notes = "查看用户开团或入团情况")
    public Object my(@LoginUser Integer userId, @RequestParam(defaultValue = "0") Integer showType);
	
	
	
}
