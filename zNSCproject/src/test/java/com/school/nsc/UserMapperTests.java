package com.school.nsc;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.school.nsc.mapper.UserMapper;
import com.school.nsc.pojo.User;
import com.school.nsc.service.exception.ServiceException;
import com.school.nsc.service.impl.UserServiceimpl;


@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
    @Autowired
    private UserMapper userMapper;
    private UserServiceimpl userserviceimpl;

    @Test
    public void testinsert() {
        User user = new User();
        user.setUname("王1");
        user.setPassword("123456");
        int rows = userMapper.insert(user);
        System.out.println("rows=" + rows);
    }

    @Test
    public void testlogin() {
        try {
            String username = "王2";
            String password = "123456";
			User user = userserviceimpl.login(username, password);
			System.out.println("登录成功！" + user);
        } catch (ServiceException e) {
            System.out.println("登录失败！" + e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void changePassword() {
        try {
            String username = "王3";
            String oldPassword = "123456";
            String newPassword = "888888";
            userserviceimpl.changePassword( username, oldPassword, newPassword);
            System.out.println("密码修改成功！");
        } catch (ServiceException e) {
            System.out.println("密码修改失败！" + e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getByUid() {
        try {
            int uid = 3;
            User user = userserviceimpl.getByUid(uid);
            System.out.println(user);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
   
}

