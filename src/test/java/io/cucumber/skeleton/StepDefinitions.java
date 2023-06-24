package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    private final TestContext testContext;

    public StepDefinitions(TestContext testContext)
    {
        this.testContext = testContext;
    }

    //Be extra careful with state
    // https://cucumber.io/docs/cucumber/state/?lang=java
    //State can make your steps more tightly coupled and harder to reuse.

    @Given("j'additionne {int} à {int}")
    public void additionner(int premierOperande, int deuxiemeOperande) {

       var calcul = new Calcul();
       this.testContext.resultat = calcul.additionner(premierOperande, deuxiemeOperande);
    }

    @Then("le résultat est égal à {int}")
    public void le_resultat_est(int attendu) {
        //Assertions.assertEquals("Buzz", "buzz");
        assertThat(this.testContext.resultat).isEqualTo(attendu);
    }
}
