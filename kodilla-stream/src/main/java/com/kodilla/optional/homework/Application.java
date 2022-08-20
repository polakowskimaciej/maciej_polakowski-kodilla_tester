package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Teacher One");
        Teacher teacher2 = new Teacher("Teacher Two");
        Teacher teacher3 = new Teacher("Teacher Three");
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        students.add(0, new Student("Kasia", teacher1));
        students.add(1, new Student("Olga", null));
        students.add(2, new Student("Igorek", teacher2));
        students.add(3, new Student("Mafia", null));
        students.add(4, new Student("Maciej", teacher3));
        // co muszę opakować?

        //przy pomocy pętli for-each wyświetl pary uczeń-nauczyciel
        //Wykorzystaj klasę Optional do tego, aby obsłużyć sytuacje, w których teacher == null.
        //Wówczas w miejscu danych nauczyciela wyświetl tekst "<undefined>".
        for (Student student : students)
            //opakuj każdego teachera
        {
            //Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            System.out.println(student.getName() + " " + student.getTeacher().orElse(new Teacher("<undefined>")).getName());
        }
            //sprawdź czy student.getteacher jest nullem
            // jeśli jest null to wyświetl "undef"


    }
}
