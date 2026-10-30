# Cucumber Demo

Projet de démonstration de tests automatisés avec **Cucumber**, pilotés depuis **Squash TM** et exécutés via **OpenTestFactory** sur un agent Windows.

## Objectif

Valider le fonctionnement de la chaîne d'automatisation :

`Squash TM → OpenTestFactory → Agent Windows → Cucumber`

## Technologies

- Cucumber 5+
- Squash TM 15.0.2
- OpenTestFactory Orchestrator 6.3.0
- Agent Windows
- Git

## Scénario de démonstration

Un scénario simple de multiplication permet de vérifier l'exécution des étapes Cucumber :

```gherkin
# language: fr

Fonctionnalité: Vérifier un calcul simple

  Scénario: Multiplier une valeur par trois
    Soit une valeur égale à 2
    Quand je multiplie cette valeur par 3
    Alors le résultat doit être égal à 6
```

## Exécution

Le scénario est déclenché depuis Squash TM.

L'Orchestrator distribue le job à l'agent Windows, qui exécute les tests Cucumber et transmet les résultats à Squash TM.

Tags d'exécution :

- `windows`
- `cucumber5`

## Résultats

Les résultats sont disponibles sous deux formes :

- Rapport XML Cucumber : détail des scénarios et des étapes.
- Test Execution Summary Report : synthèse globale de l'exécution.

## Statut

<ins>Chaîne d'exécution validée.</ins>

Dernier test de démonstration : 1 scénario exécuté, 1 réussi, 0 échec.
