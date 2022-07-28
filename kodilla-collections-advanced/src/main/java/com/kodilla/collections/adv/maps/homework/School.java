package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentNumberInClass = new ArrayList<>();

    public School(String schoolName, List<Integer> studentNumberInClass) {
        this.schoolName = schoolName;
        this.studentNumberInClass = studentNumberInClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudentNumberInClass() {
        return studentNumberInClass;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentNumberInClass=" + studentNumberInClass +
                '}';
    }

    public int getSum() {

        int sum = 0;
        for (int studentNumberInOneClass : studentNumberInClass)
            sum += studentNumberInOneClass;
        return sum;
    }
}
