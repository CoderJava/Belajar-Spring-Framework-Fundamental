package com.tokobuku;

import com.tokobuku.hello.Hello;
import com.tokobuku.traveler.Traveler;
import com.tokobuku.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("Beans.xml");

        Hello helloWorld = (Hello) context.getBean("helloWorld");
        helloWorld.printMessage();
        System.out.println();

        Vehicle carMercy = (Vehicle) context.getBean("TheMercedes");
        System.out.println(carMercy);
        carMercy.move();
        System.out.println("--------------------------------------------------------------------------");
        Vehicle carBmw = (Vehicle) context.getBean("TheBmw");
        System.out.println(carBmw);
        carBmw.move();
        System.out.println("--------------------------------------------------------------------------");
        Traveler travelerNissan = (Traveler) context.getBean("TheTraveler");
        travelerNissan.startJourney();
    }
}
