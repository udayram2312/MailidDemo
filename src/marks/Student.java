package marks;
public class Student {
     public  String name;
     public String fatherName;
     public Marks marks;

     @Override
     public String toString() {
          return "Student{" +
                  "name='" + name + '\'' +
                  ", fatherName='" + fatherName + '\'' +
                  ", marks=" + marks +
                  ", result='" + result + '\'' +
                  '}';
     }

     public String result;


}