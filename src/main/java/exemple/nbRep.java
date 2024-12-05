package exemple;

public class nbRep {
    private Effet effet;
    private Scenario scenario;
    private int nbRep;

    public nbRep(Effet effet, Scenario scenario, int nbRep){
        this.effet = effet;
        this.scenario = scenario;
        this.nbRep=nbRep;
    }

    public int setRep(){
        return nbRep;
    }
}
