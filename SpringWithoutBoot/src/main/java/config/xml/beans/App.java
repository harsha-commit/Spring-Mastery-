package config.xml.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("XML Main Started");
        // for XML file, search "spring xml config dtd file"
        // copy the first code into the XML file

        // NOTE: always check the folders in File Explorer (because of dot, might be in file name)
        // first refers to resources
        ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
        Student student = context.getBean(Student.class);
        student.sayHello();
        System.out.println(student);

        Address address = student.getAddress();
        System.out.println(address);
    }
}
