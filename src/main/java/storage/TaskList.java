package storage;

import java.time.LocalDate;
import java.util.ArrayList;

import task.Deadline;
import task.Event;
import task.Task;
import task.Todo;

/**
 * Program memory that stores a task list.
 */
public class TaskList {
    private ArrayList<Task> tasks;

    /**
     * Constructor for the task list.
     */
    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Constructor for the task list.
     *
     * @param tasks tasks to be populated
     */
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Adds a new todo task.
     *
     * @param task task to be added
     * @return The new todo
     */
    public Todo createTodo(String task) {
        Todo newTodo = new Todo(task);
        this.tasks.add(newTodo);
        return newTodo;
    }

    /**
     * Adds a new deadline task.
     *
     * @param task     task to be added
     * @param deadline deadline of the task
     * @return The new deadline
     */
    public Deadline createDeadline(String task, LocalDate deadline) {
        Deadline newDeadline = new Deadline(task, deadline);
        this.tasks.add(newDeadline);
        return newDeadline;
    }

    /**
     * Adds a new event task.
     *
     * @param task      task to be added
     * @param startTime starting time of the task
     * @param endTime   ending time of the task
     * @return The new task
     */
    public Event createEvent(String task, LocalDate startTime, LocalDate endTime) {
        Event newEvent = new Event(task, startTime, endTime);
        this.tasks.add(newEvent);
        return newEvent;
    }

    /**
     * Lists all tasks.
     *
     * @return A list of tasks.
     */
    public ArrayList<Task> indexTask() {
        return this.tasks;
    }

    /**
     * Shows one task.
     *
     * @param index index of the task item
     * @return The task item.
     */
    public Task showTask(int index) {
        return this.tasks.get(index);
    }

    /**
     * Marks task as completed.
     *
     * @param index index of task
     */
    public void markTask(int index) {
        this.tasks.get(index).markCompleted();
    }

    /**
     * Marks task as uncompleted.
     *
     * @param index index of task
     */
    public void unmarkTask(int index) {
        this.tasks.get(index).unmarkCompleted();
    }

    /**
     * Deletes task.
     *
     * @param index index of task
     */
    public void deleteTask(int index) {
        this.tasks.remove(index);
    }

    /**
     * Returns the number of tasks in the list.
     *
     * @return Number of tasks.
     */
    public int countTask() {
        return this.tasks.size();
    }
}
