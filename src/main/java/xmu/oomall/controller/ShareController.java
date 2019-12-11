package lsz.test;

import org.springframework.web.bind.annotation.*;

/**
 * @Author xyt
 * @create 2019/12/4 13:00
 */

@RestController
@RequestMapping("shareService")
public interface ShareController {

    /**
    *现在的需求是一个商品只有一个分享规则
     * return shareRules
     */
    @GetMapping("/goods/{id}shareRules")
    public Object list(@PathVariable Integer shareRuleId);

    /**
     * return shareRule
     */
    @PostMapping("/shareRules")
    public Object create(@RequestBody ShareRule shareRule);

    /**
     *return
     */
    @DeleteMapping("/shareRules/{id}")
    public Object delete(@PathVariable Integer id);

    /**
     * return shareRule
     */
    @PutMapping("/shareRules/{id}")
    public Object update(@RequestBody ShareRule shareRule, @PathVariable Integer id);

    /**
     * return beShareItem
     */
    @PostMapping("/beSharedItems")
    public Object createSharedItems(@RequestBody BeSharedItem beSharedItem);

    /**
     *
     * @param order
     * @return  Integer
     */
    @GetMapping("/reback")
    public Object calculateReback(@RequestBody Order order);

}