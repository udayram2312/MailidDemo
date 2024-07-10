package cricket;

public class Test {
    public static void main(String[] args) {
        Batsman batsman = new Batsman();

        batsman.bat = "100";
        batsman.glouses = "nb";
        batsman.helmet = "india";
        System.out.println(batsman.bat+batsman.glouses+batsman.helmet);

        Bowler bowler = new Bowler();
        bowler.name = "starc";
        bowler.bowlType = "fast";
        bowler.wickets = 7;
        System.out.println(bowler.name+bowler.bowlType+bowler.wickets);


        }




    }

