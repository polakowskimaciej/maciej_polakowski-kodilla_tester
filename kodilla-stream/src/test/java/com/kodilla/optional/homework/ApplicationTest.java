package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    //co ja mogę przetestować?
    //ile studentów nie ma nauczyciela?
    //czy lista uczniów się zgadza
    //czy lista nauczycieli się zgadza?
    @Test
    void testAddStudent() {
        List<Student> students = new ArrayList<>();
        students.add(0, new Student("Kasia", null));
        assertEquals(1,students.size());
    }
    @Test
    void testAddTeacher() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Teacher One");
        Teacher teacher2 = new Teacher("Teacher Two");
        Teacher teacher3 = new Teacher("Teacher Three");
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        assertEquals(3,teachers.size());
    }

        //given
        //when


    }