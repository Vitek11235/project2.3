import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanFirst = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatFirst = (Cat) applicationContext.getBean("cat");
        Cat beanCatSecond = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение: " + beanFirst.equals(beanSecond));
        System.out.println("Сравнение Cat: " + beanCatFirst.equals(beanCatSecond));
    }
}