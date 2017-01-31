package impls.bills;

import interfaces.IBill;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by george on 1/22/17.
 */
public class LuxuryBill implements IBill, InitializingBean {

    public LuxuryBill() {
    }

    public Integer getFinalBill() {
        return 1000;
    }

    public String getInfo() {
        return "Luxury service : " + this.getFinalBill();
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Chamber  Lux " + this + " inited");
    }
}
