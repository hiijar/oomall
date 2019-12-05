/*
package和import需要根据项目导入
 */


/**
 * 用户收藏服务
 */
@RestController
@RequestMapping("")// 收藏夹
@Validated
@Api()
public interface CollectController {

    /**
     * 用户收藏列表
     *
     * @param userId 用户ID
     * @param type   类型，如果是0则是商品收藏，如果是1则是专题收藏
     * @param page   分页页数
     * @param limit   分页大小
     * @return 用户收藏列表
     */
    @GetMapping("/collects")
    @ApiOperation(value = "获取用户收藏列表 /list", notes = "获取用户收藏列表")
    public Object list(@LoginUser Integer userId,
                       @NotNull Byte type,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) ;

    /**
     * 用户收藏添加或删除
     * <p>
     * 如果商品没有收藏，则添加收藏；如果商品已经收藏，则删除收藏状态。
     *
     * @param userId 用户ID
     * @param body   请求内容，{ type: xxx, valueId: xxx }
     * @return 操作结果
     */

    @PostMapping("/collects")
    @ApiOperation(value = "添加收藏 ")
    public Object add(@LoginUser Integer userId, @RequestBody String body) ;

    @DeleteMapping("/collects/{id}")
    @ApiOperation(value = "取消收藏 ")
    public Object update(@LoginUser Integer userId, @RequestBody String body) ;
}