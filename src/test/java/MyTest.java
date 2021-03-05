import com.example.config.MyConfig;
import com.example.pojo.Cat;
import com.example.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        People people = (People) context.getBean("people1");
//        people.getCat().call();
//        people.getDog().call();
//        System.out.println(people.getName());
//
//        Cat cat = (Cat) context.getBean("cat");
//        cat.call();


    }
}
