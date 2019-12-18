package xmu.oomall.domain;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:品牌信息
 * @Data:Created in 14:50 2019/12/11
 **/

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BrandPo {
    private Integer id;
    /**
    *品牌名称
    */
    private String name;
    /**
    *品牌描述
    */
    private String description;
    /**
    *品牌图片链接
     */
    private String picUrl;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
