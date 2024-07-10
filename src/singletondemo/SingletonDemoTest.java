package singletondemo;

public class SingletonDemoTest {
    public static void main(String[] args) {

        System.out.println( " from main ");
        DBConnection dbConnection = DBConnection . getInstance();
        System.out.println(dbConnection.count);
        dbConnection.count = 20;
        System.out.println(dbConnection.count);
        DBConnection dbConnection1 =  DBConnection .getInstance();
        System.out.println( dbConnection.count);
        dbConnection.count = 50;
        System.out.println(dbConnection.count);
        DBConnection dbConnection2 =  DBConnection .getInstance();
        System.out.println( dbConnection.count);
        dbConnection.count = 80;
        System.out.println(dbConnection.count);
        DBConnection dbConnection3 =  DBConnection .getInstance();
        System.out.println( dbConnection.count);
        }

    }

