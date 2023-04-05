package com.knoldus.SpringBootJDBC.course.jdbc;

import com.knoldus.SpringBootJDBC.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "AWS", "Youtube"));
        repository.insert(new Course(2, "React", "Thapa"));
        repository.insert(new Course(3, "Native", "Harry"));
        repository.insert(new Course(4, "Git", "Shiv"));
        repository.insert(new Course(5, "Sql", "Shiv"));
//        repository.delete(2);
        System.out.println(repository.findById(3));
        System.out.println(repository.findById(4));
    }
}
