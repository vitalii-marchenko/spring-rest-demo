package ua.marchenko.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.marchenko.springdemo.entity.Student;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        this.students = asList(
                new Student("Poorina", "Patel"),
                new Student("Mario", "Rossi"),
                new Student("Mary", "Smith"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        if ((studentId >= students.size() || studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return this.students.get(studentId);
    }
}
