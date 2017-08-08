package com.todolist.demo.Repository;

import com.todolist.demo.ModelLayer.ToDoModelList;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository  extends CrudRepository<ToDoModelList,Long> {
}
