import edu.soft2.pojo.User;
import edu.soft2.service.UserService;
import edu.soft2.service.impl.HelloworldService;
import edu.soft2.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    //1.获取上下文(context)对象
    ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void helloworldTest(){
        HelloworldService helloworldService = (HelloworldService) context.getBean("helloworldService");
        helloworldService.sayHi();//调用方法
        helloworldService.sayHello();//调用方法

    }

    @Test
    public void userServiceTest(){
        String name = "peter";
        String pwd = "123";
        UserService service = (UserService) context.getBean(UserServiceImpl.class);
        User user = context.getBean(User.class);
        user.setName(name);
        user.setPwd(pwd);
       /* User user = new User();
        user.setName("peter");
        user.setPwd("123");
        user.setEmail("peter@test.com");*/
        //service.addUser(user);
        if (service.addUser(user) == 1) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
        if (service.delUser(user) == 1) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        if (service.updateUser(user) == 1) {
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        if (service.queryUser(user) == 1) {
            System.out.println("查询成功");
        }else {
            System.out.println("查询失败");
        }
    }
}