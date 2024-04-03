import java.util.*;

public class Task {
	private int taskId;
	private String desc;
	private boolean isComplete;

	// Constructors, getters, setters
	public Task(int taskId, String desc, boolean isComplete) {
		this.taskId = taskId;
		this.desc = desc;
		this.isComplete = isComplete;
	}

	public int getId() {
		return taskId;
	}

	// Get task
	public String getTask() {
		return desc;
	}
	
	public boolean getTaskStatus() {
		return isComplete;
	}

	public boolean setStatus() {
		return this.isComplete = true;
	}

	
	// Get task status
	@Override
	public String toString() {
		if (getTaskStatus() == false) {
			return taskId + ". " + "[Incomplete] - " + desc;
		} else {
			return taskId + ". " + "[Complete] - " + desc;
		}
	}

}
