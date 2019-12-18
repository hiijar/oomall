package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:广告信息
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Ad {
    private Integer id;
    /**
     * 该广告的链接
     */
    private String link;
    /**
     * 该广告的名称
     */
    private String name;
    /**
     * 该广告的内容
     */
    private String content;
    /**
     * 该广告显示时的图片
     */
    private String picUrl;
    /**
     * 该广告是否是默认广告
     */
    private Boolean beDefault;
    /**
     * 该广告是否启用
     */
    private Boolean beEnabled;
    /**
     * 该广告上线的时间
     */
    private LocalDateTime startTime;
    /**
     * 该广告下线的时间
     */
    private LocalDateTime endTime;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
