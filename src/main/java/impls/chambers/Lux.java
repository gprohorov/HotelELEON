package impls.chambers;

import interfaces.IChamber;

/**
 * Created by george on 1/22/17.
 */

public class Lux implements IChamber {

    public Lux() {

    }

    public Integer getBill() {
        return 1000;
    }

    public String getInfo() {
        return " Luxury service : all-incluzive, " +
                 WINDOW.values()[3];
    }
}
