package com.ignacioleon.sms;

import com.ignacioleon.sms.entity.Student;
import com.ignacioleon.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        //already inserted to the database
    /*   Student student1 = new Student("Ignacio", "Leon", "ifleon57@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Viviana","Jarpa","vitij@hotmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Ignacia", "Leon","nachita@gmail.com");
        studentRepository.save(student3); */
    }

}
