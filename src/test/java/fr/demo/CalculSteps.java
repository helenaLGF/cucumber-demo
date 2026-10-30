
package fr.demo;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculSteps {

    private int valeur;
    private int resultat;

    @Soit("une valeur égale à {int}")
    public void une_valeur_egale_a(int valeur) {
        this.valeur = valeur;
    }

    @Quand("je multiplie cette valeur par {int}")
    public void je_multiplie_cette_valeur_par(int multiplicateur) {
        resultat = valeur * multiplicateur;
    }

    @Alors("le résultat doit être égal à {int}")
    public void le_resultat_doit_etre_egal_a(int attendu) {
        assertEquals(attendu, resultat);
    }
}
