package com.matheusbprogramador.todolist.todo.repository;

import com.matheusbprogramador.todolist.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
