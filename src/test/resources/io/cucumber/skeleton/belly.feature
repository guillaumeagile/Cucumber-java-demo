Feature: Calculateur

  Scenario: additionne 2 et 4
    Given j'additionne 2 à 4
    Then le résultat est égal à 6


  Scenario: additionne 0 et 100
    Given j'additionne 0 à 100
    Then le résultat est égal à 100


  Scenario: additionne 0 et 100
    Given j'additionne 0 à -100
    Then le résultat est égal à 100
