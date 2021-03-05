import com.example.mapper.UserMapper2;
import com.example.pojo.User;
import com.example.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理方法
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);

        // userMapper.deleteUser("李四");
        List<User> userList = userMapper.selectUser();
        userList.forEach(System.out::println);

        System.out.println();
        //静态
        UserMapper2 userMapper2Impl = applicationContext.getBean("userMapper2Impl", UserMapper2.class);
        // userMapper2Impl.deleteUser("王五");
        List<User> userList1 = userMapper2Impl.selectUser();
        userList1.forEach(System.out::println);
    }
}
