package tp1;

public class Agent {
    private Environnement environnement;
    private Boolean satisfait = false;
    private Agent blocDessous;
    private Agent but;
    private boolean libre;
    private String name;
    private boolean estPousse = false;

    public Agent(String name) {
        this.name = name;
    }

    public Environnement getEnvironnement() {
        return environnement;
    }

    public void setEnvironnement(Environnement environnement) {
        this.environnement = environnement;
    }

    public Agent() {
    }

    public Agent getBut() {
        return but;
    }

    public void setBut(Agent but) {
        this.but = but;
    }

    public void action(){
        if(!satisfait)
            if (libre)
                environnement.deplace(this);
            else
                estPousse = true;
    }

    public  void perception(){
        this.blocDessous = environnement.getAgentEnDessous(this);
        this.libre = environnement.estLibre(this);
        this.satisfait = this.blocDessous == this.but;
    }

    public Boolean getSatisfait() {
        return satisfait;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "satisfait=" + satisfait +
                ", name='" + name + '\'' +
                '}';
    }
}
