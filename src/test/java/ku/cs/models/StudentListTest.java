package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void addNewStudent() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000001", "test");
        Student s = sl.findStudentById("671000001");
        assertEquals("test", s.getName());
    }

    @Test
    void addNewStudentWithScore() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000010", "scoreUser", 20);
        Student s = sl.findStudentById("671000010");
        assertEquals(20.0, s.getScore());
    }


    @Test
    void findStudentById() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000001", "test1");
        sl.addNewStudent("671000002", "test2");
        sl.addNewStudent("671000003", "test3");
        Student s = sl.findStudentById("671000002");
        assertEquals("test2", s.getName());
    }

    @Test
    void filterByName() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000001", "test1");
        sl.addNewStudent("671000002", "test2");
        sl.addNewStudent("671000003", "test3");
        StudentList filtered = sl.filterByName("test");
        assertEquals(3, filtered.getStudents().size());
    }

    @Test
    void giveScoreToId() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000001", "test1");
        sl.giveScoreToId("671000001", 20);
        Student s = sl.findStudentById("671000001");
        assertEquals(20.0, s.getScore());
    }


    @Test
    void viewGradeOfId() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000001", "test1");
        sl.giveScoreToId("671000001", 85);
        assertEquals("A", sl.viewGradeOfId("671000001"));
    }


    @Test
    void getStudentsSize() {
        StudentList sl = new StudentList();
        sl.addNewStudent("671000001", "A");
        sl.addNewStudent("671000002", "B");
        sl.addNewStudent("671000003", "C");
        assertEquals(3, sl.getStudents().size());
    }
}