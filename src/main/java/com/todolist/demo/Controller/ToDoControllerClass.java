package com.todolist.demo.Controller;

import com.todolist.demo.ModelLayer.ToDoModelList;
import com.todolist.demo.Repository.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToDoControllerClass
{

    ToDoRepository toDoRepository;


    @GetMapping("/todohomepage")
    public String homePageMode(Model model)
    {
        model.addAttribute("welcometodo", "Welcome to the home page" );

        return "todohomepage";
    }

    @GetMapping("/addtask")
    public String addTask(Model model)
    {
        model.addAttribute("addtasksPage", new ToDoModelList());
        return "addtask";
    }

    @PostMapping("/addtask")
    public String PostTasks(@ModelAttribute("newtask") ToDoModelList modelist)
    {

        toDoRepository.save(modelist);
        return  "taskconfirmation";

    }

    @GetMapping("/displayalltasks")
    public String displayBooks(Model model)
    {

        Iterable<ToDoModelList> EmployeeList =   toDoRepository.findAll();



        model.addAttribute("tasksz", EmployeeList);


        return "displayalltasks";
    }


}
