package tp1;


import java.util.List;
import java.util.Random;

public class Agent {
    private Environnement environnement;
    private Perception perception;
    private Regles regles;
    private List<Integer> placesDisponible;
    private Boolean satisfait;

    public void Action(){
        if (estLibre())
            deplacer();
    }

    public  void deplacer(){
        environnement.deplace(this);
    }

    public  boolean estLibre(){
        return environnement.estLibre(this);
    }

}
