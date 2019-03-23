package com.ssm.sprin_mvc.javabea;


import lombok.Data;

/**
 * @Data 项目打包时会自动生成 get/set
 */
@Data
public class UserInfoPo {

    private Integer userId;
    private  String userName;
    private  String userPass;
    private  String userPhone;
    private String  userState;


}
