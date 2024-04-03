import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class TodoListApp {
	private TodoList todoList;

	public TodoListApp() {
		this.todoList = new TodoList();
	}
	public static void main(String[] args) {
		new TodoListApp().use();
	}

	private int readChoice() {
		System.out.println("Welcome to the Todo List Application!"
			+ "\n" + "1. Add a task"
			+ "\n" + "2. Mark a task complete"
			+ "\n" + "3. Delete a task"
			+ "\n" + "4. View all tasks"
			+ "\n" + "5. Exit");
		System.out.println();
		System.out.print("Please enter your choice: ");
		return In.nextInt();
	}

	public void use() {
        int choice;
        while ((choice = readChoice()) != 5){
            switch (choice){
				case 1: todoList.addTask(); break;
				case 2: todoList.markTaskAsComplete(); break;
				case 3: todoList.deleteTask(); break;
                case 4: todoList.viewAllTasks(); break;
                default: help(); break;
            }
        }
        System.out.println("Thank you for using the Todo List Application. Goodbye!");
    }

	private void help(){
		System.out.println("Please enter a number between 1 and 5.");
	}

}
