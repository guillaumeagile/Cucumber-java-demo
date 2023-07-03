Feature: Calculateur

  Scenario: additionne 2 et 4
    Given j'additionne 2 à 4
    Then le résultat est égal à 6





    #Scenario Outline: test paramétré
      # les même steps
     # Given j'additionne <ope1> à <ope2>
     # Then le résultat est égal à <res>

  #    Examples:
   #     | ope1  | ope2 | res |
   #     |    12 |   5 |   17 |
   #     |    20 |   5 |   25 |