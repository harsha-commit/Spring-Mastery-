package com.spring.core;

import com.spring.core.couple.*;
import com.spring.core.scope.Pepsi;
import com.spring.core.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
//@ComponentScan(basePackages= {"",""})
@ComponentScan(basePackages = {"com.spring.core","test"})
public class SpringCoreConceptsApplication {
	public static void main(String[] args) {

		// Bean and Dependencies Management
		// 1. About the beans
		// 1.1 Using XML, Bean Annotation (Read Later)
		// 1.2 Using @Component ✅

		// 2. About the dependencies
		// 2.1 Using XML
		// 2.2 Using @Autowired ✅

		// 3. Where to scan for beans
		// by default, the same package as main's package
		// for additional, use @ComponentScan ✅


		// returns the IOC Container
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);

		System.out.println("############################");
		Human human = context.getBean(Human.class);
		human.playWithPet();

		System.out.println("############################");
		// accessing the outside package, see @ComponentScan
		Test test = context.getBean(Test.class);
		System.out.println(test);

		System.out.println("############################");
		// accessing using names
		Pet cat = context.getBean("cat", Pet.class);
		cat.play();

		System.out.println("############################");
		// understanding Bean Scopes
		Pepsi bean1 = context.getBean(Pepsi.class);
		System.out.println(bean1);
		bean1.drink();

		Pepsi bean2 = context.getBean(Pepsi.class);
		System.out.println(bean2);
		bean1.drink();

		System.out.println("############################");
		// understanding Proxy mode in Bean Scopes
		Pepsi pepsi1 = context.getBean(Pepsi.class);
		System.out.println(pepsi1);
		Soda soda = pepsi1.getSoda();
		System.out.println(soda);

		Pepsi pepsi2 = context.getBean(Pepsi.class);
		System.out.println(pepsi2);
		Soda soda2 = pepsi2.getSoda();
		System.out.println(soda2);

		System.out.println("############################");

	}
}
