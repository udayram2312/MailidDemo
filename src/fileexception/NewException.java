package fileexception;

import java.io.FileInputStream;

public class NewException {
    public static void main(String[] args) {



    String name = null;
    String company = "neoteric";
    System.out.println(name);
    System.out.println(company);
    try {
        System.out.println(name.toUpperCase());
    }catch(Exception e){
        System.out.println("Exception occured" + e.getMessage());
    }finally{
        System.out.println("from finally block");
    }

    }
}
