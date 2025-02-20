import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        logger.info(bean.getMessage());
        logger.info(bean1.getMessage());

        logger.info(cat.getName());
        logger.info(cat1.getName());

        logger.info(() -> "HelloWorld бины одинаковые: " + (bean == bean1));
        logger.info(() -> "Cat бины одинаковые: " + (cat == cat1));
    }
}