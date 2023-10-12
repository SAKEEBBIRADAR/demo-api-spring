package com.example.demo.config;

import com.example.demo.repository.StudentRepository;
import com.example.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static javax.xml.datatype.DatatypeConstants.NOVEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sakeeb = new Student(
                    "Sakeeb",
                    "sakeebbiradaronlyone@gmail.com",
                    LocalDate.of(1997, NOVEMBER,11)
            );

            Student madhu = new Student(
                    "Aman",
                    "aman.1999@gmail.com",
                    LocalDate.of(1999, NOVEMBER,11)
            );

            repository.saveAll(
                    List.of(sakeeb,madhu)
            );
        };
    }
}
