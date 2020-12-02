package tp1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Agent agentA = new Agent("A");
        Agent agentB = new Agent("B");
        Agent agentC = new Agent("C");
        Agent agentD = new Agent("D");

        agentA.setBut(agentB);
        agentC.setBut(agentA);
        agentD.setBut(agentC);

        Environnement environnement = new Environnement(5);
        environnement.setAgents(agentA, 0);
        environnement.setAgents(agentB,0);
        environnement.setAgents(agentC,0);
        environnement.setAgents(agentD,0);


        List<Agent> agentList = new ArrayList<>();
        agentList.add(agentA);
        agentList.add(agentB);
        agentList.add(agentC);
        agentList.add(agentD);
        int i=0;

        while (!environnement.satifactionGlobal() && i<1000){
            for (Agent a: agentList
                 ) {
                a.perception();
                a.action();
            }
            i++;
        }

        System.out.println("nombreIteration" + i);
        System.out.println(environnement.getAgents());
    }
}
