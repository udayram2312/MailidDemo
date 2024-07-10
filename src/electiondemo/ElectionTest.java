package electiondemo;

public class ElectionTest {

    public static void main(String[] args) {
        ElectionService electionService = new ElectionService();
       State state=electionService.getState();


        System.out.println(state.constancies[0] .noOfVoters);
        System.out.println(state.constancies[0] .constancyName);
        System.out.println(state.constancies[0] .type);



    }
}
