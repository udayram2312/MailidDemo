package electiondemo;

public class ElectionService {

    public State getState(){

        State tg = new State();
        tg.stateName = "TG";

        Constancy[]  constancies = new Constancy[2];
        Constancy constancy = new Constancy();
        tg.constancies = constancies;

        constancy.constancyName = "hyd";
        constancy.noOfVoters = 2500000;
        constancy.type = "MP";
        constancy.state = tg;
        constancies[0] = constancy;
        return tg;



    }
}
