package zura.tikaradze.dynamodb.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import org.springframework.stereotype.Repository;
import zura.tikaradze.dynamodb.demo.model.Student;

import java.util.List;

@Repository
public class StudentDDBRepository implements StudentRepository {


    final DynamoDBMapper mapper;

    public StudentDDBRepository(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Student> students() {
        return mapper.scan(Student.class, new DynamoDBScanExpression());
    }

    @Override
    public void addStudent(Student student) {
        mapper.save(student);
        System.out.println("Saved!");
    }
}
