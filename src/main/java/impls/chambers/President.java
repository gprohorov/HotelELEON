package impls.chambers;

import interfaces.IChamber;

/**
 * Created by george on 1/22/17.
 */

public class President implements IChamber {

    public President() {
    }

    public Integer getBill() {
        return 1000;
    }

    public String getInfo() {
        return " Luxury service : all-incluzive";
    }
}