package com.tutorial.hello.student.Database;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.hello.student.Model.Student;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student fitrie = new Student(
                "Fitrie", 
                "fit@gmail.com", 
                LocalDate.of(2000, Month.JANUARY, 20)
            );

            Student alex = new Student(
                "alex", 
                "alex@gmail.com", 
                LocalDate.of(2000, Month.JANUARY, 20) 
            );

            repository.saveAll(
                List.of(fitrie, alex)
            );
        };
    }
}
