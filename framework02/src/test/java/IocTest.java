import edu.soft2.aop.HelloworldAspect;
import edu.soft2.ioc.coffee.CoffeeMachine;
import edu.soft2.ioc.print.Printer;
import edu.soft2.service.impl.HelloworldService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    //1.获取上下文(context)对象
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testCoffee(){

    /*    //2.context对象(封装了BeanFactory)
        CoffeeBean coffeeBean = (CoffeeBean) context.getBean("mocaCoffee");//注入
        coffeeBean.drink();*/
        CoffeeMachine machine = (CoffeeMachine) context.getBean("coffeeMachine");
        machine.make();
    }
    @Test
    public void testPrinter(){
        Printer printer = (Printer) context.getBean("printer");
        printer.print();
    }

}
