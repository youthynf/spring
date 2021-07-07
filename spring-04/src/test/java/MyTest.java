import com.study.mapper.UserMapperImpl;
import com.study.mapper.UserMapperImpl2;
import com.study.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    @Test
    public void getUserList() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapper = (UserMapperImpl) context.getBean("userMapper");
        List<User> userList = userMapper.getUserList();
        System.out.println(userList);
    }

    @Test
    public void getUserList2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 userMapper = (UserMapperImpl2) context.getBean("userMapper2");
        List<User> userList = userMapper.getUserList();
        System.out.println(userList);
    }
}
