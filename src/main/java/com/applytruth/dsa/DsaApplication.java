package com.applytruth.dsa;


import com.applytruth.dsa.DataStructures.ArraysReview;
import com.applytruth.dsa.DataStructures.LinkedListReview;
import com.applytruth.dsa.DataStructures.StackDequeReview;
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
            int choice = 0; // Declare a variable to store the user's choice

            System.out.println("Running the app");
            do {
                System.out.println("Please choose a Data Structure to review:");
                System.out.println("1 - Review Arrays");
                System.out.println("2 - Review Linked Lists");
                System.out.println("3 - Review Stacks and Queues");
                System.out.println("4 - Exit");
                choice = scanner.nextInt();
                System.out.println("You chose: " + choice);
                switch (choice) {
                    case 1:
                        ArraysReview arraysReview = new ArraysReview();
                        arraysReview.run();
                        break;
                    case 2:
                        LinkedListReview linkedListReview = new LinkedListReview();
                        linkedListReview.run();
                        break;
                    case 3:
                        StackDequeReview stackDequeReview = new StackDequeReview();
                        stackDequeReview.run();
                        break;
                    case 4:
                        System.out.println("Exiting the app");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } while (true);
        };

    }

}
