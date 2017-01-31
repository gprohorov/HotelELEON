package impls.kitchen;

import interfaces.IKitchen;

/**
 * Created by george on 1/22/17.
 */
public class Breakfast implements IKitchen {
    public Breakfast() {
    }

    public Integer getBill() {
        return 80;
    }

    public String getInfo() {
        return "Breakfast " + this.getBill();
    }
}
