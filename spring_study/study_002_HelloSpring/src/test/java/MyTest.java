import com.kang.pro.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main (String args[]){
        //获取spring的上下文对象
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都是在spring中的管理了，我们要使用，直接去里面就可以了

        //   context.getBean("Hello");
        Hello hello=(Hello) context.getBean("Hello");
        System.out.println(hello.toString());
    }
}