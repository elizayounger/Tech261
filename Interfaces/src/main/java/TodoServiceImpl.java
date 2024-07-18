// Java Program to Illustrate TodoServiceImpl File

// Importing required classes
import java.util.ArrayList;
import java.util.List;

// Main class
public class TodoServiceImpl {

    // Creating a reference of TodoService interface
    private TodoService todoService;

    // Constructor
    public TodoServiceImpl(TodoService todoService)
    {
        // This keyword refers to same instance itself
        this.todoService = todoService;
    }

    // Method
    // Filtering the string
    public List<String> retrieveTodosRelatedToJava(String user)
    {
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);

        for (String todo : todos) {
            // Filtering the string that contains "Java"
            // keyword
            if (todo.contains("Java")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
