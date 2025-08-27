package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("67xxxxxxxxx","test");
    }


    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 40.1 คะแนน")
    void testAddScore(){
        //Student s = new Student("67xxxxxxxx","test");
        s.addScore(40.1);
        assertEquals(40.1, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        //Student s = new Student("67xxxxxxxx","test");
        s.addScore(90);
        assertEquals("A", s.grade());
    }

}