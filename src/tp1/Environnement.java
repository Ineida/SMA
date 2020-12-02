package tp1;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Environnement {

    private int numbreBloc;
    private int numbreAgent;
    private Agent[][] agents;

    public Environnement(int numbreBloc, int numbreAgent) {
        this.numbreBloc = numbreBloc;
        this.numbreAgent = numbreAgent;
        this.agents = new Agent[numbreBloc][numbreAgent];
    }


    public List<Pair<Integer, Integer>> placeDisponible(){
        List<Pair<Integer, Integer>>  placeDisponible = new ArrayList<>();
        for (int i = 0; i < numbreAgent; i++) {
            for (int j = 0; j < numbreBloc; j++) {
                if (agents[i][j] == null){
                    Pair<Integer, Integer> place = new Pair(i, j);

                    placeDisponible.add(place);
                }
            }
        }
        return placeDisponible;
    }
}
