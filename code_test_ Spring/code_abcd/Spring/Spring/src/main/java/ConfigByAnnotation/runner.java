package ConfigByAnnotation;

import ConfigByAnnotation.appContext.context_Config;
import ConfigByAnnotation.client.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(context_Config.class);
        context.getBean(A.class);
    }
}
