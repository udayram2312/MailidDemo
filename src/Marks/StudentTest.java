package Marks;

public class StudentTest {
    public boolean isPassed(Subject subject){
        System.out.println((" from isPassed" + subject.name));
        return subject.marks>= 35;
    }

    public boolean isPassedInHindi(Subject subject){
        System.out.println(" from isPassedInHindi" + subject.name);
        return subject.marks>=21;
    }



    Student getResult(Student inPutStudent) {


        if (isPassed(inPutStudent.marks.englishSubject)) {
            inPutStudent.marks.englishSubject.result = "Pass";
        } else {
            inPutStudent.marks.englishSubject.result = "Fail";

        }

        if (isPassed(inPutStudent.marks.teluguSubject)) {
            inPutStudent.marks.teluguSubject.result = "Pass";
        } else {
            inPutStudent.marks.teluguSubject.result = "Fail";

        }
        if (isPassed(inPutStudent.marks.hindiSubject)) {
            inPutStudent.marks.hindiSubject.result = "Pass";
        } else {
            inPutStudent.marks.hindiSubject.result = "Fail";

        }
        if (isPassed(inPutStudent.marks.mathsSubject)) {
            inPutStudent.marks.mathsSubject.result = "Pass";
        } else {
            inPutStudent.marks.mathsSubject.result = "Fail";

        }
        if (isPassed(inPutStudent.marks.scienceSubject)) {
            inPutStudent.marks.scienceSubject.result = "Pass";
        } else {
            inPutStudent.marks.scienceSubject.result = "Fail";

        }
        if (isPassed(inPutStudent.marks.socialSubject)) {
            inPutStudent.marks.socialSubject.result = "Pass";
        } else {
            inPutStudent.marks.socialSubject.result = "Fail";
        }
        if (inPutStudent.marks.teluguSubject.result.equals("Pass")
                && inPutStudent.marks.hindiSubject.result.equals("Pass")
                && inPutStudent.marks.englishSubject.result.equals("Pass")
                && inPutStudent.marks.mathsSubject.result.equals("Pass")
                && inPutStudent.marks.scienceSubject.result.equals("Pass")
                && inPutStudent.marks.socialSubject.result.equals("Pass"))
        {
            inPutStudent.result = "Pass";
        } else {
            inPutStudent.result = "Fail";
        }
        return  inPutStudent;
    }




    public  static void main(String[] args){
        Subject telugu = new Subject();
         telugu.marks = 20;
         telugu.name = "telugu";

        Subject hindi = new Subject();
        hindi.marks = 95;
        hindi.name = "hindi";

        Subject english = new Subject();
        english.marks = 95;
        english.name = "english";

        Subject maths = new Subject();
        maths.marks = 85;
        maths.name = "maths";

        Subject science = new Subject();
        science.marks = 95;
        science.name = "science";

        Subject social = new Subject();
        social.marks = 95;
        social.name = "social";

        Marks m = new Marks();
        m.teluguSubject = telugu;
        m.hindiSubject = hindi;
        m.englishSubject = english;
        m.mathsSubject = maths;
        m.scienceSubject = science;
        m.socialSubject = social;

        Student s = new Student();
         s.name = "uday";
         s.marks = m;


        StudentTest studentTest = new StudentTest();
        Student latestStudent = studentTest.getResult(s);
        System.out.println(latestStudent);









    }
}
