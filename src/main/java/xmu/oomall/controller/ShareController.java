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
     *
     */
    @DeleteMapping("/shareRules/{id}")
    public Object delete(@PathVariable Integer id);
    /**
     */
    @PutMapping("/shareRules/{id}")
    public Object update(@RequestBody ShareRule shareRule, @PathVariable Integer id);

    /**
     * return beShareItem
     */
    @PostMapping("/beSharedItems")
    public Object createSharedItems(@RequestBody BeSharedItem beSharedItem);


}