package lv.tsi.springbootapp.model.repository;

import lv.tsi.springbootapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student findByName(String name);

    public Student specialFind();
}
