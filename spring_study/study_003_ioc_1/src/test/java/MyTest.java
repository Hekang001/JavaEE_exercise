import com.kang.pro.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String args[]){
   //     User user= new User();

        //Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       // User user= (User)context.getBean("Sky");
        User user= (User)context.getBean("user");
       // User user2= (User)context.getBean("user");
        user.show();
       // System.out.println(user==user2);
//        user.toString();
    }
}
