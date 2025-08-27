package ku.cs.services;

import static org.junit.jupiter.api.Assertions.*;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;


class StudentListHardCodeDatasourceTest {

    @Test
    void readDatasizeIsTen() {
        StudentListHardCodeDatasource ds = new StudentListHardCodeDatasource();
        StudentList list = ds.readData();
        assertEquals(10, list.getStudents().size());
    }

    @Test
    void contains_first_and_second() {
        StudentListHardCodeDatasource ds = new StudentListHardCodeDatasource();
        StudentList list = ds.readData();

        Student s1 = list.findStudentById("6710400001");
        Student s2 = list.findStudentById("6710400002");

        assertNotNull(s1);
        assertNotNull(s2);
    }


}