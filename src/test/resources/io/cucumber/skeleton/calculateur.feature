Feature: Calculateur

  Scenario: additionne dont le résultat est 7
    Given j'additionne 3 à 4
    Then le résultat est égal à 7


  Scenario: additionne dont le résultat est 7
  Given j'additionne 3 à -8
  Then le résultat est égal à 11



    Scenario Outline: test paramétré
      # les même steps
     Given j'additionne <ope1> à <ope2>
      Then le résultat est égal à <res>

      Examples:
        | ope1  | ope2 | res |
        |    12 |   5 |   17 |
        |    20 |   -5 |   25 |