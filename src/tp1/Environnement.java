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

    public void setAgents(Agent agent, int numbreBloc) {
        this.agents.get(numbreBloc).add(agent);
        agent.setEnvironnement(this);
    }

    public int getNumbreBloc() {
        return numbreBloc;
    }

    public  boolean estLibre(Agent agent){
        List<Agent> agentList = agents.get(bloc(agent));
       if(agentList.contains(agent)){
           if (agentList.indexOf(agent) == agentList.size() -1)
               return true;
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

    public Agent getAgentEnDessous(Agent agent){
        int place = bloc(agent);
        int index = agents.get(place).indexOf(agent);
        if (index ==0) return  null;
        return agents.get(place).get(index);
    }

    public void deplace(Agent agent){
        List<Agent> agentList = agents.get(bloc(agent));
        agentList.remove(agent);
        int place = new Random().nextInt(getNumbreBloc());
        agents.get(place).add(agent);
    }

    public  boolean satifactionGlobal(){
        for (List<Agent> agentList: agents) {
            for ( Agent agent: agentList) {
                if (!agent.getSatisfait())
                    return false;
            }
        }
        return true;
    }

    public List<List<Agent>> getAgents() {
        return agents;
    }
}
