package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;
/**
 * @Author: 数据库与对象模型标准组
 * @Description: 角色权限表
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Privilege {
    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 访问url地址
     * eg. /user/{id}
     */
    private String url;
    /**
     * 访问方式：GET、POST、PUT、DELETE
     */
    private String method;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
