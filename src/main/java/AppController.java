import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.zhoulk")
public class AppController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppController.class, args);
    }
}
