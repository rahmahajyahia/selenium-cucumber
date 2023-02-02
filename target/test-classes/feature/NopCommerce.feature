@nopCommerce
Feature: Je souhaite tester l'authentification
   En tant que utilisateur Je souhaite tester l'authentification

  Scenario: Je souhaite tester l'authentification
    Given je me connecte sur l'application
    When je saisis l'email
    When je saisis le mot de pass
    Then je clique sur le bouton login
