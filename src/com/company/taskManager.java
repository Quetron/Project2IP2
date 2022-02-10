package com.company;

import java.util.*;

public class taskManager {
    int x = 5;
    static Scanner input = new Scanner(System.in);
    static List<String> words = new ArrayList<String>();
    static Map<String, Map> taskSelection = new HashMap<String, Map>();
    static Map<String, Integer> taskPriorityMap = new HashMap<String, Integer>();

    static void betterMap(){
        for (int i = 0; i < taskSelection.size(); i++) {
            System.out.println("Task: " + taskSelection.get(1) + " " + "Description: " + taskPriorityMap.get(1) + " " + "Priority: ");
        }
    }



    static void addTask(){
        //Asks user for input and asks task to ArrayList
        System.out.println();
        System.out.print("What is the title of the task you would like to add?: ");
        String newTitle = input.nextLine();

        System.out.print("What is the description of the Task?: ");
        String taskDescription = input.nextLine();

        System.out.print("What is the priority of the task (0-5)?: ");
        int taskPriorityNum = input.nextInt();

        taskPriorityMap.put(taskDescription, taskPriorityNum);
        taskSelection.put(newTitle, taskPriorityMap);

        System.out.println(taskSelection);
        System.out.println(taskSelection.get());
        betterMap();
    }

    /*
    static void removeTask(){
        System.out.println();
        System.out.println("Current list of tasks: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i+1) + ": " + words.get(i));
        }
        //Asks user for which task they want to remove (int)
        Scanner removeItem = new Scanner(System.in);
        System.out.print("Which task would you like to remove?:");
        int removeNumber = removeItem.nextInt();
        //Removes selected number
        words.remove(removeNumber-1);

        System.out.println("New list of tasks: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i+1) + ": " + words.get(i));
        }
    }
    static void updateTask(){
        System.out.println();
        System.out.println("Before change: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i+1) + ": " + words.get(i));
        }

        //Asks user for the task number they want to change
        Scanner updateNumber = new Scanner(System.in);
        System.out.print("Which task would you like to update?: ");
        int updateItem = updateNumber.nextInt();
        updateItem = updateItem - 1;//Sets the Item to the correct one in the Array (Array starts at 0 while list number starts at 1)

        //Asks user for the task they want to change it to
        Scanner newTask = new Scanner(System.in);
        System.out.print("What task would you like to add?: ");
        String updatedTask = newTask.nextLine();
        System.out.println(updatedTask);

        //Updates the Arraylist with selected task and position user chose
        words.set(updateItem, updatedTask);

        System.out.println();
        System.out.println("After change: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i+1) + ": " + words.get(i));
        }
    }

     */


    static void menuSelection() {
        try{
            System.out.println("Menu:");
            System.out.println("------------");
            System.out.println("1: Add a task");
            System.out.println("2: Remove a task");
            System.out.println("3: Update a task");
            System.out.println("4: See your current list of tasks");
            System.out.println("0: Quit");

            //User input for which menu number they want to select
            Scanner number = new Scanner(System.in);
            System.out.print("Enter a number here: ");
            int usrNumber = number.nextInt();

            switch (usrNumber) {
                case 1:
                    addTask();
                    menuSelection();
                    break;
                case 2:
                    //removeTask();
                    menuSelection();
                    break;
                case 3:
                    //updateTask();
                    menuSelection();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Here is your list:");
                    for (int i = 0; i < words.size(); i++) {
                        System.out.println((i+1) + ": " + words.get(i));
                    }
                    System.out.println();

                    menuSelection();
                    break;
                case 0:
                    //Closes the program
                    System.out.println("Thanks!");
                    break;


                default:
                    System.out.println("Not a valid input, please input a number 0-5");
                    menuSelection();
            }

        }
        //Catch anything that isn't a variable being entered in
        catch (InputMismatchException e){
            System.out.println("That is not and integer, please enter an Integer.");
            menuSelection();
        }

    }

}
