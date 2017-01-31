package impls.checking;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by george on 1/26/17.
 */
public class CheckFree implements InitializingBean{

    private boolean freePresent;

    public CheckFree(boolean freePresent) {
        this.freePresent = freePresent;
    }
    public CheckFree() {
        this.check();
    }
    public void check(){
        System.out.println(" Free impls.chambers are present -" + freePresent);
    }

    public boolean isFreePresent() {
        return freePresent;
    }

    public void setFreePresent(boolean freePresent) {
        this.freePresent = freePresent;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(" impls.spa.checking bean " + this);
    }
}
