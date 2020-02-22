import com.kang.pro.Dao.Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dao dao = context.getBean("dao", Dao.class);
        System.out.println(dao.name);
    }
}
