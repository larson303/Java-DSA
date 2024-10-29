package com.applytruth.dsa;


import com.applytruth.dsa.DataStructures.ArraysReview;
import com.applytruth.dsa.DataStructures.LinkedListReview;
import com.applytruth.dsa.DataStructures.StackDequeReview;
import com.applytruth.dsa.Classes.Cookie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            Scanner scanner = new Scanner(System.in);
            char choice = 0; // Declare a variable to store the user's choice
            boolean continueLoop = true; // Declare a variable to control the loop

            System.out.println("Running the app");
            do {
                System.out.println("Review Options:");
                System.out.println("1 - Arrays");
                System.out.println("2 - Linked Lists");
                System.out.println("3 - Stacks and Queues");
                System.out.println("4 - Cookies");
                System.out.println("X - Exit");
                System.out.println();
                System.out.print("Choose what to Review: ");
                choice = scanner.next().charAt(0);

                switch (choice) {
                    case '1':
                        System.out.println("Creating an array");
                        ArraysReview arraysReview = new ArraysReview();
                        arraysReview.run();
                        System.out.println();
                        break;
                    case '2':
                        System.out.println("Creating a linked list");
                        LinkedListReview linkedListReview = new LinkedListReview();
                        linkedListReview.run();
                        System.out.println();
                        break;
                    case '3':
                        System.out.println("Creating a stack and a queue");
                        StackDequeReview stackDequeReview = new StackDequeReview();
                        stackDequeReview.run();
                        System.out.println();
                        break;
                    case '4':
                        System.out.println("Creating a cookie object");
                        Cookie cookie = new Cookie("chocolate", 100);
                        Cookie cookie2 = new Cookie("macadamia nut", 150);
                        System.out.println(cookie.toString());
                        System.out.println(cookie2.toString());
                        System.out.println(cookie.getFlavor());
                        System.out.println();
                        break;
                    case 'X' | 'x':
                        System.out.println("Exiting the app");
                        continueLoop = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            } while (continueLoop);
            System.exit(0);
        };
    }

}
