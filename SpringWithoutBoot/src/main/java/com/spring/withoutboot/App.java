package com.spring.withoutboot;

import another.world.Repo;
import com.spring.withoutboot.beans.CartService;
import com.spring.withoutboot.beans.OrderService;
import com.spring.withoutboot.beans.UserService;
import com.spring.withoutboot.config.AppConfig;
import com.spring.withoutboot.web.AuthController;
import com.spring.withoutboot.web.HomeController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    // First, we need required Spring dependencies
    // Spring Core, Spring Context (Minimum for Spring Core functionality)
    public static void main( String[] args )
    {
        System.out.println( "Application Started ✅" );

        // We have to create object of Application Context
        // for XML, ClassPathXmlApplicationContext
        // if annotation is used for Configuration, use AnnotationConfigApplicationContext();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);

        System.out.println("############################");
        CartService cartService = context.getBean("cartService", CartService.class);
        cartService.createCart();

        System.out.println("############################");
        // Setup ComponentScan first
        UserService userService = context.getBean(UserService.class);
        userService.saveUser();

        System.out.println("############################");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrder();

        System.out.println("############################");
        HomeController homeController = context.getBean(HomeController.class);
        homeController.homePage();

        System.out.println("############################");
        AuthController authController = context.getBean(AuthController.class);
        authController.login();

        System.out.println("############################");
        Repo repo = context.getBean(Repo.class);
        repo.getUser();
    }
}
