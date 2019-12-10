package com.example.user.controller.vo;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserInfoVo {
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 0：男， 1：女
     */
    private Integer gender;
    /**
     * 生日
     */
    private LocalDateTime birthday;
    /**
     * 用户电话
     */
    private String mobile;
    /**
     * 用户积分
     */
    private Integer rebate;
    /**
     * 用户头像图片
     */
    private String avatar;

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +              
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", mobile='" + mobile + '\'' +
                ", rebate=" + rebate +
                ", avatar='" + avatar + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getRebate() {
        return rebate;
    }

    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
