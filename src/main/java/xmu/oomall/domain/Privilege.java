package xmu.ddao.domain.standard;

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
     * 角色权限
     * JSON格式:  {"url":xxx, "method":"GET"}
     * eg.  {"url":"/user/{id}", "method":"GET"}, 表示拥有通过GET方式访问url "/user/{id}"的权限
     */
    private String name;
    /**
     * 权限描述，文字性质的（可能用不到）
     */
    private String description;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
