/*Ability to create Linked List by appending 30 and 70 to 56
- Node with data 56 is First Created
- Next Append 30 to 56
- Finally Append 70 to 30
- LinkedList Sequence: 56->30->70*/

        package com.bridgelabz.datastructure;

         import java.util.Scanner;



           public class Main {
            
            public static void main(String[] args) {
                System.out.println("Welcome to linkedList DataStructure Program");
                System.out.println("Welcome to linkedList DataStructure Program");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter 1 to add the data at the start"); // UC 2
                System.out.println("Enter 2 to add the data at the End"); // UC 3
                System.out.println("Enter 3 to add the data at In Between "); // UC 4
        
                switch (scanner.nextInt()) {
        
                    case 1:
                        Operation.addDataAtStart();
                        break;
                    case 2:
                        Operation.addDataAtEnd();
                        break;
                    case 3:
                        Operation.insertInBetween();
                        break;
                }
            }
        }
