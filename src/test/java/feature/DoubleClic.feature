@doubleclic
Feature: Je souhaite effectuer l'action double clique
  
  En tant que utilisateur je souhaite effectuer l'action double clique

  Scenario: Je souhaite effectuer l'action double clique
    Given Je me connecte sur l'application double clic
    When J'effectue le double clique
    Then Je ferme le navigateur
