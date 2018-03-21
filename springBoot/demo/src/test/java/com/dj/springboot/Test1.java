package com.dj.springboot;

import com.dj.springboot.pojo.User;
import com.dj.springboot.service.UserService02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    private UserService02 UserService02;

   /* @Test
    public void testList() {//11111
        List<User> test01s = UserService02.testList();
        for (User test01 : test01s) {
            System.out.println(test01.getId()+"======="+test01.getName());
        }
    }*/

    @Test
    public void test01() {
        User test01s = UserService02.test01(1);
        System.out.println(test01s.getId()+"======="+test01s.getName());
    }

    @Test
    public void addTest() {
        User test01 = new User();
        test01.setName("zs");
        UserService02.addTest(test01);
    }

    @Test
    public void updateTest() {
        User test01 = new User();
        test01.setId(1);
        test01.setName("ls");
        UserService02.updateTest(test01);
    }

    @Test
    public void deleteTest() {
        UserService02.deleteTest(1);
    }
}
