package impls.kitchen;

import interfaces.IKitchen;

/**
 * Created by george on 1/22/17.
 */
public class Empty implements IKitchen {

    public Integer getBill() {
        return 0;
    }

    public String getInfo() {
        return " impls.kitchen bill is empty";
    }
}
