import com.study.config.MyConfig;
import com.study.pojo.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    /**
     * 在Spring中有三种装配方式
     * 1.xml中显式的配置
     * 2.在java中显式配置
     * 3.隐式的自动装配bean【重要】
     */
    @Test
    public void getPeople() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        System.out.println(people);

        Cat cat = people.getCat();
        cat.shout();

        Dog dog = people.getDog();
        dog.shout();
    }

    @Test
    public void getPeople2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People2 people2 = (People2) context.getBean("people2");
        System.out.println(people2);

        Cat cat = people2.getCat();
        cat.shout();

        Dog dog = people2.getDog();
        dog.shout();
    }

    @Test
    public void getPeople3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People3 people3 = (People3) context.getBean("people3");
        System.out.println(people3);

        Cat cat = people3.getCat();
        cat.shout();

        Dog dog = people3.getDog();
        dog.shout();

        Snake snake = people3.getSnake();
        snake.shout();
    }

    @Test
    public void getUser() {
        // 使用注解开发就是注入对象和创建对象不再依赖beans.xml(applicationContext.xml)文件，直接在实体类上面加上对应的注解实现创建注入
        // @Component：这里的@Component相当于我们以前的<bean id="user" class="com.study.pojo.User"/>
        // @Value("呵呵呵")：就相当于<property name="name" value="呵呵呵"/>
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void getJavaConfigUser() {
        // 通过javaConfig的方式完成bean对象的绑定到Spring容器统一管理
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User2 user = (User2) context.getBean("getUserByJavaConfig");
        System.out.println(user);
    }
}
