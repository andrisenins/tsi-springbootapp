package lv.tsi.springbootapp;

import lv.tsi.springbootapp.model.Student;
import lv.tsi.springbootapp.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    void populateDB() {
        studentRepository.save(new Student("John", "Doe"));
        studentRepository.save(new Student("Janis", "Berzins"));
        studentRepository.save(new Student("Ivan", "Sidorov"));
        studentRepository.save(new Student("Jonas", "Petraitis"));
        studentRepository.save(new Student("Matti", "Meikalainen"));
        studentRepository.save(new Student("Jan", "Kowalski"));
    }
}
