package impls.kitchen;

import interfaces.IKitchen;

/**
 * Created by george on 1/22/17.
 */
public class FullPansion implements IKitchen {

    public FullPansion() {
    }

    public Integer getBill() {
        return 500;
    }

    public String getInfo() {
        return " Breakfast, launch, dinner are included- 500$";
    }
}
