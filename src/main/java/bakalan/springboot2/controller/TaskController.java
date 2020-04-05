package bakalan.springboot2.controller;

import bakalan.springboot2.model.Task;
import bakalan.springboot2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    //get tasks
    @GetMapping("")
    public List<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    @PostMapping("new")
    public Task createTask(@RequestParam long orderId) {
        Task task = new Task(orderId, LocalDate.now(), LocalTime.now());
        return taskRepository.save(task);
    }

    //get tasks by data interval and id
}
