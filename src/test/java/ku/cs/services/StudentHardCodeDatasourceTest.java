package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testFirst() {
        StudentList list = new StudentHardCodeDatasource().readData();
        Student st = list.findStudentById("6710400001");
        assertEquals("First", st.getName());
    }

    @Test
    void testSecond() {
        StudentList list = new StudentHardCodeDatasource().readData();
        Student st = list.findStudentById("6710400002");
        assertEquals("Second", st.getName());
    }

    @Test
    void testThird() {
        StudentList list = new StudentHardCodeDatasource().readData();
        Student st = list.findStudentById("6710400003");
        assertEquals("Third", st.getName());
    }

    @Test
    void testFourth() {
        StudentList list = new StudentHardCodeDatasource().readData();
        Student st = list.findStudentById("6710400004");
        assertEquals("Fourth", st.getName());
    }

}