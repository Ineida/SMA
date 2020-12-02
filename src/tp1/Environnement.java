package tp1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Environnement {

    private int numbreBloc;
    private List<List<Agent>> agents;

    public Environnement(int numbreBloc) {
        this.numbreBloc = numbreBloc;
        this.agents = new ArrayList<>();

        for (int i = 0; i < numbreBloc; i++) {
            agents.add(new ArrayList<>());
        }
    }

    public int getNumbreBloc() {
        return numbreBloc;
    }

    public  boolean estLibre(Agent agent){
        List<Agent> agentList = agents.get(bloc(agent));
       if(agentList.contains(agent)){
           if (agentList.indexOf(agent) == agentList.size() -1)
               return  true;
       }
        return  false;
    }

    public  int bloc(Agent agent){
        for (int i = 0; i < numbreBloc; i++) {
            List<Agent> agentList = agents.get(i);
            if(agentList.contains(agent))
                return i;
        }
        return 0;
    }

    public void deplace(Agent agent){
        List<Agent> agentList = agents.get(bloc(agent));
        agentList.remove(agent);
        int place = new Random().nextInt(getNumbreBloc());
        agents.get(place).add(agent);
    }
}
