package ku.cs.services;

import ku.cs.models.StudentList;
import ku.cs.models.Student;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class StudentListFileDatasourceTest {

    @Test
    void writeDataReadBack_sameContent() throws IOException {

        StudentList data = new StudentList();
        data.addNewStudent("6710880001", "test1", 12.5);
        data.addNewStudent("6710880002", "test2", 33.0);

        Path dir = Files.createTempDirectory("students-out");
        Path file = dir.resolve("out.csv");
        Files.createFile(file);

        StudentListFileDatasource ds = new StudentListFileDatasource(dir.toString(), "out.csv");
        ds.writeData(data);

        StudentList readBack = ds.readData();
        assertEquals(2, readBack.getStudents().size());

        Student a = readBack.findStudentById("6710880001");
        Student b = readBack.findStudentById("6710880002");

        assertEquals("test1", a.getName());
        assertEquals(12.5, a.getScore());
        assertEquals("test2", b.getName());
        assertEquals(33.0, b.getScore());
    }
}
