package hackaton.ru.controller;

import com.querydsl.core.types.Predicate;
import hackathon.ru.service.taskService.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Tag(name = "Task controller")
@RestController
@RequestMapping("${base-url}" + TaskController.TASK_CONTROLLER_PATH)
@AllArgsConstructor
public class TaskController {
    public static final String TASK_CONTROLLER_PATH = "/tasks";

    public static final String ID = "/{id}";

    private final TaskService taskService;


    @Operation(summary = "Get Task by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Task with that id was successfully found"),
            @ApiResponse(responseCode = "404", description = "Task with that id does not exist")
    })
    @GetMapping(ID)
    public Task getTaskById(@PathVariable("id") final long id) {
        return taskService.getTaskById(id);
    }

    @Operation(summary = "Get Task by filtration")
    @ApiResponse(responseCode = "200", description = "Tasks by filtration was successfully found")
    @GetMapping
    public Iterable<Task> getAllTasks(@QuerydslPredicate(root = Task.class) Predicate predicate) {
        return taskService.getAllTasks(predicate);
    }

    @Operation(summary = "Create new Task")
    @ApiResponse(responseCode = "201", description = "Task was successfully created")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Task createTask(@RequestBody @Valid final TaskDto taskDTO) {
        return taskService.createTask(taskDTO);
    }

    @Operation(summary = "Update Task by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Task with that id was successfully updated"),
            @ApiResponse(responseCode = "404", description = "Task with that id does not exist")
    })
    @PutMapping(ID)
    public Task updateTask(@PathVariable("id") final long id,
                           @RequestBody @Valid final TaskDto taskDTO) {
        return taskService.updateTask(id, taskDTO);
    }

    @Operation(summary = "Delete Task by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Task with that id was successfully deleted"),
            @ApiResponse(responseCode = "404", description = "Task with that id does not exist")
    })
    @DeleteMapping(ID)
    public void deleteTaskById(@PathVariable("id") final long id) {
        taskService.deleteTaskById(id);
    }

}
