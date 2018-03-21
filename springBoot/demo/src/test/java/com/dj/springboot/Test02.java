package com.dj.springboot;

import com.dj.springboot.pojo.User;
import com.dj.springboot.service.UserService03;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test02 {
    @Autowired
    private UserService03 UserService03;

    @Test
    public void testList() {
        List<User> test03s = UserService03.testList();
        for (User test03 : test03s) {
            System.out.println(test03.getId()+"======="+test03.getName());
        }
    }

  /*  @Test
    public void test03() {//111
        User test03s = UserService03.test03(1);
        System.out.println(test03s.getId()+"======="+test03s.getName());
    }*/

    @Test
    public void addTest() {
        User test03 = new User();
        test03.setName("zsss");
        UserService03.addTest(test03);
    }

    @Test
    public void updateTest() {
        User test03 = new User();
        test03.setId(1);
        test03.setName("lsss");
        UserService03.updateTest(test03);
    }

    @Test
    public void deleteTest() {
        UserService03.deleteTest(1);
    }
}
