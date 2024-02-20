package Teacher;

public class TeacherTest {
    public static void main(String[] args){
        Teacher SrinivasTeacher = new Teacher();
       TeacherSchool teacherSchool = new TeacherSchool();

        SrinivasTeacher.name = "Srinivas";
        SrinivasTeacher.mobileNo = "9948241921";
        SrinivasTeacher.dateOfBirth = "1/1/75";
        TeacherTest teacherTest = new TeacherTest();
        System.out.println(SrinivasTeacher.name+ " -"+teacherSchool.SchoolName);

    }




}
