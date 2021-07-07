import com.study.pojo.Hello;
import com.study.pojo.Student;
import com.study.pojo.Teacher;
import com.study.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void getHello() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

    @Test
    public void getUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }

    @Test
    public void getUser2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 使用别名获取bean对象
        User user = (User) context.getBean("user2");
        System.out.println(user.toString());
    }

    @Test
    public void getStudent() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void getTeacher() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //使用c命名空间注入
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }

    @Test
    public void testScope() {
        // 作用域测试：默认是singleton单例，prototype原型模式（多例）
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);

        Teacher teacher2 = (Teacher) context.getBean("teacher");
        System.out.println(teacher == teacher2);
    }
}
