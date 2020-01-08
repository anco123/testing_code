package com.logicbig.example;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class MyWebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup (ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx =
                            new AnnotationConfigWebApplicationContext();

        //khởi tạo class đăng kí
        ctx.register(MyWebConfig.class);


        ctx.setServletContext(servletContext);
        System.out.println(ctx.toString());

        //using servlet 3 api to dynamically create
        //spring dispatcher servlet
        System.out.println(servletContext.toString());
        ServletRegistration.Dynamic servlet =
                            servletContext.addServlet("springDispatcherServlet",
                                                      new DispatcherServlet(ctx));

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}