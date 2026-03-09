package com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "LifeLeft")
public class LifeLeftService {
    private static final Integer ESPERANCE_VIE_HOMMES = 79;
    private static final Integer ESPERANCE_VIE_FEMMES = 85;

    @WebMethod
    public String anneeRestantesAVivre(String prenom, String sexe, Integer anneeNaissance) {
        int ev = sexe.equals("homme") ? ESPERANCE_VIE_HOMMES : ESPERANCE_VIE_FEMMES;
        int reste = ev - (Year.now().getValue() - anneeNaissance);
        return "Bonjour " + prenom + ", il vous reste " + reste + " ans à vivre, profitez-en au maximum !";
    }
}
