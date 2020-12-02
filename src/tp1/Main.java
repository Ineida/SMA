package tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Agent agentA = new Agent("A");
        Agent agentB = new Agent("B");
        Agent agentC = new Agent("C");
        Agent agentD = new Agent("D");

        agentA.setBut(agentB);
        agentC.setBut(agentA);
        agentD.setBut(agentC);

        List<Agent> agentList = new ArrayList<>();
        agentList.add(agentA);
        agentList.add(agentB);
        agentList.add(agentC);
        agentList.add(agentD);
        Environnement environnement = new Environnement(agentList.size() -1);
        for (Agent a : agentList
             ) {
            environnement.setAgents(a,0);
        }

        int i=0;
        Agent a = agentList.get(agentList.size()-1);
        while (!environnement.satifactionGlobal() && i < 10000){
            a.perception();
            a.action();
            a = agentList.get(new Random().nextInt(agentList.size()));
            i++;
        }

        System.out.println("nombreIteration" + i);
        System.out.println(environnement.getAgents());
    }
}
