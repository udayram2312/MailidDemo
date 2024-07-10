package studentdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args){

        Student student = new Student();
        student.name = "uday";
        student.rollNo = "23";
        student.subjects = new ArrayList<>();

        Subject subject1 = new Subject();
        subject1.subjectName = "telugu";
        subject1.marks = "90";

        Subject subject2 = new Subject();
        subject2.subjectName = "hindi";
        subject2.marks = "80";

        Subject subject3 = new Subject();
        subject3.subjectName = "english";
        subject3.marks = "90";

        Subject subject4 = new Subject();
        subject4.subjectName = "maths";
        subject4.marks = "85";

        Subject subject5 = new Subject();
        subject5.subjectName = "science";
        subject5.marks = "75";

        Subject subject6 = new Subject();
        subject6.subjectName = "social";
        subject6.marks = "90";

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);
        subjectList.add(subject3);
        subjectList.add(subject4);
        subjectList.add(subject5);
        subjectList.add(subject6);
    }
}
