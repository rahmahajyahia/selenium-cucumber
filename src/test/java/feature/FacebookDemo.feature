@facebookdemo
Feature: je souhaite accéder a mon compte facebook
  entant que utilisateur je souhaite accéder a mon compte facebook

  @tag1
  Scenario: je souhaite accéder a mon compte facebook
    Given je me connecte sur url
    When je saisi l'adresse e-mail
    When je saisi le mot de passe
    Then j'accéde à mon compte facebook
