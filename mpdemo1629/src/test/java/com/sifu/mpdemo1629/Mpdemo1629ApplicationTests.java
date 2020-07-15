package com.sifu.mpdemo1629;

import com.sifu.mpdemo1629.entity.User;
import com.sifu.mpdemo1629.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class Mpdemo1629ApplicationTests {

    @Autowired
    private UserMapper um;

    @Test
    void queryAll() {
        System.out.println("--测试查询所有--");
        List<User> users = um.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void addOne(){
        System.out.println("--测试添加一个--");
        User user = new User();
        user.setName("四伏");
        int insert = um.insert(user);
        System.out.println("insert"+insert);
    }

}
