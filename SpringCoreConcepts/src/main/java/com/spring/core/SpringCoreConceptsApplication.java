package com.spring.core;

import com.spring.core.couple.Cat;
import com.spring.core.couple.Dog;
import com.spring.core.couple.Human;
import com.spring.core.couple.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
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
		Human human = context.getBean(Human.class);
		human.playWithPet();

		// accessing the outside package, see @ComponentScan
		Test test = context.getBean(Test.class);
		System.out.println(test);
	}

}
