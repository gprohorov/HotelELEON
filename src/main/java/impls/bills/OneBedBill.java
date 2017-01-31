package impls.bills;

import interfaces.IBill;
import interfaces.IChamber;
import interfaces.IKitchen;
import interfaces.I_SPA;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by george on 1/22/17.
 */
public class OneBedBill implements IBill, InitializingBean {
    @Autowired
    @Qualifier("AutoWiredChamber")
    private IChamber chamber;
    @Autowired
    @Qualifier("AutoWiredKitchen")
    private IKitchen kitchen;
    @Autowired
    @Qualifier("AutoWiredSPA")
    private I_SPA spa;

    public OneBedBill() {
    }

    public OneBedBill(IChamber chamber, IKitchen kitchen, I_SPA spa) {
        this.chamber = chamber;
        this.kitchen = kitchen;
        this.spa = spa;
    }

    public Integer getFinalBill() {
        return chamber.getBill() + kitchen.getBill() + spa.getBill();
    }

    public String getInfo() {
        return " " + chamber.getInfo() +" - "
                + chamber.getBill().toString() + "$ / "
                   + kitchen.getInfo() + "$ /"
                   + spa.getInfo() +"$  - final "
                   + this.getFinalBill() + "$";
    }

    public I_SPA getSpa() {
        return spa;
    }

    public void setSpa(I_SPA spa) {
        this.spa = spa;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Chamber  one bed " + this + " inited");
    }
}
