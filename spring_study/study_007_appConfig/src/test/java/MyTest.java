import com.kang.config.kangConfig;
import com.kang.pro.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(kangConfig.class);
        User getUser= context.getBean("getUser", User.class);
        System.out.println(getUser.toString());

    }
}
