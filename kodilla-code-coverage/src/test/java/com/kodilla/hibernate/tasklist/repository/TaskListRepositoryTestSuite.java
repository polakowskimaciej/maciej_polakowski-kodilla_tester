package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;
    private static final String LISTNAME = "Test: Do Hibernate Homework";
    private static final String DESCRIPTION = "Here we go";

    @BeforeEach
    void setTaskListRepository() {
        taskListRepository.deleteAll();
    }

    @Test
    void testFindByListName() {
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);
        //Then
        Assertions.assertEquals(1, readTaskList.size());
        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);
    }

}