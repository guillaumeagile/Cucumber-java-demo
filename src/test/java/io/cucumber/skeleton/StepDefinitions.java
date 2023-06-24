package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    int resultat;

    @Given("j'additionne {int} à {int}")
    public void additionner(int premierOperande, int deuxiemeOperande) {

       var calcul = new Calcul();
       resultat = calcul.additionner(premierOperande, deuxiemeOperande);
    }

    @Then("le résultat est égal à {int}")
    public void le_resultat_est(int attendu) {
        //Assertions.assertEquals("Buzz", "buzz");
        assertThat(resultat).isEqualTo(attendu);
    }
}
