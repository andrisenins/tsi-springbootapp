package lv.tsi.springbootapp.resource;

import lv.tsi.springbootapp.model.Student;
import lv.tsi.springbootapp.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/all")
    public @ResponseBody
    List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @RequestMapping("/{id}")
    public @ResponseBody
    Optional<Student> getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/add")
    public @ResponseBody Boolean addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return true;
    }

    @RequestMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}
