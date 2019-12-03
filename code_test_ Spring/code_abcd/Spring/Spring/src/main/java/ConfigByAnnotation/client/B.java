package ConfigByAnnotation.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ConfigByAnnotation.service.C;
import ConfigByAnnotation.service.D;

@Component
public class B {
    @Autowired
    private C c;

    @Autowired
    private D d;
}
