import com.study.service.UserService;
import com.study.service.UserService2;
import com.study.service.UserService3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /**
     * 方式一：使用spring的API接口
     */
    @Test
    public void aopByInterface() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口：注意点
        UserService userService = (UserService) context.getBean("userService");
        userService.select();
    }

    /**
     * 方式二：自定义来实现AOP【主要是切面定义】
     */
    @Test
    public void aopByDiyPointCut() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService2 userService = (UserService2) context.getBean("userService2");
        userService.select();
    }

    /**
     * 方式三：使用注解实现AOP
     */
    @Test
    public void aopByAnnotation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService3 userService = (UserService3) context.getBean("userService3");
        userService.select();
    }
}
