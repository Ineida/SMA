SMA:
cas 1:
trafic de véhicule sur l'autoroute
SMA: L'ensemble des agents représentant les véhicules qui partagent un environnement commun (autoroute) qui interagissent entre eux via l'environnement (perception/action, par signaux)
dont l'objectif est de circuler en respectant les règles de sécurité, eviter les congestions...

Agent: représente les véhicules. ils sont cognitif avec un processus de décision par raisonnement logique
      - Preception : inter distance, voies, véhicule avant et arrière, vitesse, signaux(limitation de vitesse ...) ...
      - action: changement de vitesse, changer de voie, clignotant
      - règle:

Environnement: Autoroute à 3 voies, signalétique/trafic

Interaction: deux agents(véhicule) qui interagissent par signaux (perception/action).
  -situation d'interaction général: objectif compatible, ressources suffisante, compétence suffisante -> indépendant
  -situation de changement de voie: objectif compatible, ressouces insuffisante, compétence suffisante -> coordination par signalétique/ encombrement

Organisation: organisation normative (code de la route) + potentiellement des organisations emergentes du fait de la dynamique du trafic

cas 2 :

SMA: L'ensemble des agents représentant les véhicules qui partagent un environnement commun (croisement avec un feu tricolor) qui interagissent entre eux via l'environnement (perception/action, par signaux)
dont l'objectif est de circuler en respectant les règles de sécurité.

Agent: représente les véhicules. ils sont cognitif avec un processus de décision par réseau de neuronnes
      - Preception : inter distance, véhicule avant et arrière, vitesse, signaux(limitation de vitesse, feu tricolor ...) ...
      - action: changement de vitesse, changer de voie, clignotant
      - règle: faire apprendre le réseau (input: perception output: actions de l'agents)

Environnement: croisement avec un feu tricolor

Interaction: deux agents(véhicule) qui interagissent par signaux (perception/action).
  -situation d'interaction général un seule voie: objectif compatible, ressources suffisante, compétence suffisante ->  Indépendance
  -situation d'interaction plusieur voies: objectif compatible, ressources insuffisante(en cas de changement de direction), compétence suffisante ->  encombrement/ coordination par signalétique


Organisation: organisation normative (code de la route) + potentiellement des organisations emergentes du fait de la dynamique du trafic si croisement complexe (intersections a plusieurs voies)

cas 3:

SMA: L'ensemble des agents représentant les véhicules qui partagent un environnement commun (croisement avec un agents de circulation) qui interagissent entre eux (perception/action, par signaux)
dont l'objectif est de circuler en respectant les règles de sécurité.

Agent: représente les véhicules. ils sont cognitif avec un processus de décision par réseau de neuronnes
      - Preception : inter distance, véhicule avant et arrière, vitesse, signaux(limitation de vitesse, indication de l'agent de circulation ...) ...
      - action: changement de vitesse, changer de voie, clignotant
      - règle: faire apprendre le réseau (input: perception output: actions de l'agents)

      agent de circulation:
        -perception : état du trafic
        -action: donner l'ordre d'arret, d'avancer ...
Environnement: croisement

Interaction: deux agents(véhicule) qui interagissent par signaux (perception/action).
  -situation d'interaction général: objectif compatible, ressources suffisante, compétence suffisante ->  Indépendance

            entre un véhicule et un agent de circulation.
  - situation d'interaction : objectif compatible, ressources suffisantes, compétence suffisante -> indépendance


Organisation: organisation normative (code de la route)+ organisation hiérarchique: agent donne les ordres + potentiellement des organisations emergentes du fait de la dynamique du trafic si croisement complexe (intersections a plusieurs voies)
