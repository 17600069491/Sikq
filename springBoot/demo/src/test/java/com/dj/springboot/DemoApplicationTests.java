package com.dj.springboot;

import com.dj.springboot.pojo.User;
import com.dj.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		//查询
		List<User> users = userService.userList();
		for (User user : users) {
			System.out.println(user.getId() + "====" + user.getName());
		}
	}
	@Test
	public void test01() {
		User test01s = userService.user01(1);
		System.out.println(test01s.getId()+"======="+test01s.getName());
	}
	@Test
	public void addTest() {
		User test01 = new User();
		test01.setName("zs");
		userService.addUser(test01);
	}

	@Test
	public void updateTest() {
		User test01 = new User();
		test01.setId(1);
		test01.setName("ls");
		userService.updateUser(test01);
	}

	@Test
	public void deleteTest() {
		userService.deleteUser(1);
	}
}
