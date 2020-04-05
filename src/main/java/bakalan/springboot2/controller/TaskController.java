package bakalan.springboot2.controller;

import bakalan.springboot2.model.Task;
import bakalan.springboot2.model.TaskRequest;
import bakalan.springboot2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping(value = "tasks", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @PostMapping("new")
    public Task createTask(@RequestParam long orderId) {
        Task task = new Task(orderId, LocalDate.now(), LocalTime.now());
        return taskRepository.save(task);
    }

    @GetMapping("get")
    public List<Task> getTasks(@Valid @RequestBody TaskRequest taskRequest) {
        if (taskRequest.getOrderId() != 0) {
            return taskRepository.findTasksByDateBetweenAndOrderId(
                    taskRequest.getStartDate(), taskRequest.getEndDate(), taskRequest.getOrderId());
        } else {
            return taskRepository.findTasksByDateBetween(taskRequest.getStartDate(), taskRequest.getEndDate());
        }
    }
}
