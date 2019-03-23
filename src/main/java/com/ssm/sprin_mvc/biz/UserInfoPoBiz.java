package com.ssm.sprin_mvc.biz;

import com.ssm.sprin_mvc.javabea.UserInfoPo;

import java.util.List;

public interface UserInfoPoBiz {




    /**
     * 注册用户
     */
    public UserInfoPo  seave(UserInfoPo  ui);


    /**
     * 查询所有用户
     */
public List<UserInfoPo>  search();

}
