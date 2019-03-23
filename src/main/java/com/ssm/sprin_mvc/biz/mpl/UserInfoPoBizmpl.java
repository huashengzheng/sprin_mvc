package com.ssm.sprin_mvc.biz.mpl;

import com.ssm.sprin_mvc.biz.UserInfoPoBiz;
import com.ssm.sprin_mvc.javabea.UserInfoPo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//业务层注解
public class UserInfoPoBizmpl implements UserInfoPoBiz {


 static List<UserInfoPo> list = new ArrayList<UserInfoPo>();
    static {

        for (int i = 0; i < 15; i++) {
            UserInfoPo temp = new UserInfoPo();
            temp.setUserId(007+i);

            temp.setUserName("终结者" + i + "号");
            temp.setUserPass("123123");
            temp.setUserPhone("12580");
            temp.setUserState("0");
            list.add(temp);//list add
        }
    }
    /**
     * 注册用户
     *
     * @param ui
     */
    @Override
    public UserInfoPo seave(UserInfoPo ui) {
        list.add(ui);
        return ui;
    }

    /**
     * 查询所有用户
     */
    @Override
    public List<UserInfoPo> search() {
        return list;
    }
}
