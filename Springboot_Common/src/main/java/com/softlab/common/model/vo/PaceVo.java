package com.softlab.common.model.vo;

import lombok.Data;

/**
 * @author LiXiwen
 * @date 2019/11/8 14:28
 */
@Data
public class PaceVo {
    /**
     * 用户id
     */
    private String openId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户头像
     */
    private String userIcon;
    /**
     * 用户步数
     */
    private Integer userPace;
    /**
     * 微信步数的加密数据
     */
    private String encryptedData;
    /**
     * 微信用户的iv
     */
    private String iv;
    /**
     * onlogin接口返回的sessionKey
     */
    private String sessionKey;

}