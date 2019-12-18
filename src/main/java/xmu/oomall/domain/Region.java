package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 地区信息
 * @Date: Created in 16:00 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Region {

    private Integer id;
    /**
     * 父亲的id
     */
    private Integer pid;
    /**
     * 名字
     */
    private String name;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 邮政编码
     */
    private String postalCode;

}
