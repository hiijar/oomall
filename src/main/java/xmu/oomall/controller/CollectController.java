package xmu.oomall.discount.controller;/*


/**
 * 用户收藏服务
 */

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xmu.oomall.domain.CollectItem;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("")// 收藏夹
@Validated
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
    public List<CollectItem> list(Integer userId,Byte type,Integer page,Integer limit) {

    }

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
    public CollectItem add( Integer userId,  String body) {

    }

    @DeleteMapping("/collects/{id}")
    public CollectItem update( Integer userId, String body) {

    }
}