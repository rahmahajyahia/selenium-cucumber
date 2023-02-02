@login
Feature: Je souhaite tester l'authentification
  
  En tant que utilisateur je souhaite m'authentifier sur l'application

  Scenario: Je souhaite tester l'authentification
    Given Je me connecte sur l'application
    When Je saisis le username
    When Je saisis le password
    When Je clique sur le bouton login
    Then Je me redirige vers la page home
