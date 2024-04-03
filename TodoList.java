import java.util.*;

public class TodoList {
	private List<Task> tasks;
	private Task task;

	public TodoList() {
		this.tasks = new ArrayList<>();
		this.task = task;
		tasks.add(new Task(1, "Complete Java Project", true));
		tasks.add(new Task(2, "Complete Python Project", false));
		tasks.add(new Task(3, "Complete C++ Project", false));
	}

	private String getTaskDesc() {
		System.out.print("Enter task description: ");
		return In.nextLine();
	}

	public void addTask() {
		String taskDesc = getTaskDesc();
		if (tasks.isEmpty()) {
			tasks.add(new Task(1, taskDesc, false));
		} else {
			int lastId = tasks.get(tasks.size()-1).getId();
			tasks.add(new Task(lastId+1, taskDesc, false));
		}
		System.out.println("Task added successfully!");
		System.out.println("");
	}

	public int getTaskIdToMark() {
		System.out.print("Enter the ID of the task to mark as complete: ");
		return In.nextInt();
	}

	public void markTaskAsComplete() {
		Task taskToMark = null;
		int markTaskId = getTaskIdToMark();
		for (Task task : tasks) {
			if (task.getId() == markTaskId) {
				taskToMark = task;
				break;
			}
		}
	
		boolean taskStatus = taskToMark.getTaskStatus();

		if (taskToMark != null && taskToMark.getTaskStatus() == false) {
			taskToMark.setStatus();
			System.out.println("Task masked as complete!");
		} else if (taskToMark != null && taskToMark.getTaskStatus() == true) {
			System.out.println("Task already complete!");
		} else {
			System.out.println("Task ID not found.");
		}
		System.out.println("");

	}

	public int getTaskIdToDelete() {
		System.out.print("Enter the ID of the task to delete: ");
		return In.nextInt();
	}

	public void deleteTask () {
		Task taskToRemove = null;
		int taskIdToDelete = getTaskIdToDelete();
		for (Task task : tasks) {
			if (task.getId() == taskIdToDelete) {
				taskToRemove = task;
				break;
			}
		}
		if (taskToRemove != null) {
			tasks.remove(taskToRemove);
		} else {
			System.out.println("Task with ID " + taskIdToDelete + " not found");
		}
		System.out.println("Task deleted successfully!");
		System.out.println("");
	}

	public void viewAllTasks() {
		System.out.println("\n" + "Tasks:");
		for (Task task : tasks) { 
			System.out.println(task);
		}
		System.out.println("");
	}
}
