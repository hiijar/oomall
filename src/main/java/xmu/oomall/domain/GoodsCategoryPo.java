package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:商品种类的信息
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GoodsCategoryPo {
    private Integer id;
    /**
     * 种类的名称
     */
    private String name;
    /**
     * 该种类的父种类ID
     */
    private Integer pid;
    /**
     * 二级目录的pic
     */
    private String picUrl;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
