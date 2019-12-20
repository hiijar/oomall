package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:地址
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AddressPo {

    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 城市id
     */
    private Integer cityId;
    /**
     * 省份id
     */
    private Integer provinceId;
    /**
     * 县区id
     */
    private Integer countyId;
    /**
     * 地址详情
     */
    private String addressDetail;
    /**
     * 联系电话
     */
    private String mobile;
    /**
     * 邮政编码
     */
    private String postalCode;
    /**
     * 收件人
     */
    private String consignee;
    /**
     * 是否是默认地址
     */
    private Boolean beDefault;


    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;
}
