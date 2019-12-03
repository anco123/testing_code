package ConfigByAnnotation.appContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ConfigByAnnotation/service", "ConfigByAnnotation/client"})
public class context_Config {
//    @Bean
//    public A getA(){
//        return new A();
//    }
//
//    @Bean
//    public B getB(){
//        return new B();
//    }
}
