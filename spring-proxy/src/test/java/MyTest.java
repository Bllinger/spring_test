import com.example.demo.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<User> userClass = User.class;

        Constructor<User> constructor = userClass.getDeclaredConstructor();
        User user = constructor.newInstance();

        user.setName("张三");
        System.out.println(user.getName());

        Method setName = userClass.getDeclaredMethod("setName", String.class);
        Method getName = userClass.getDeclaredMethod("getName");

        setName.invoke(user,"李四");
        System.out.println(getName.invoke(user));
    }
}
