package impls.spa;

import interfaces.I_SPA;

/**
 * Created by george on 1/22/17.
 */
public class Abonement implements I_SPA {
    public Abonement() {
    }

    public Integer getBill() {
        return 200;
    }

    public String getInfo() {
        return " spa full service - 200$ ";
    }
}
