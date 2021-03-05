import com.example.demo.UserService;
import com.example.demo.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userservice = context.getBean("user", UserService.class);

        userservice.insert();
    }
}
