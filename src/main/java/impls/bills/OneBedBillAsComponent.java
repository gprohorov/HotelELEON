package impls.bills;

import interfaces.IBill;
import interfaces.IChamber;
import interfaces.IKitchen;
import interfaces.I_SPA;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by george on 1/22/17.
 */
@Configuration
@ComponentScan(basePackages = "impls")
public class OneBedBillAsComponent implements IBill, InitializingBean {

/*    @Autowired
    @Qualifier(value ="chamberViaA" )*/
    private IChamber chamber;
    @Autowired
    @Qualifier(value ="lunchA" )
    private IKitchen kitchen;
    @Autowired
    @Qualifier(value ="nothing")
    private I_SPA spa;

    public OneBedBillAsComponent() {
    }

    public OneBedBillAsComponent(IChamber chamber, IKitchen kitchen, I_SPA spa) {
        this.chamber = chamber;
        this.kitchen = kitchen;
        this.spa = spa;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public OneBedBillAsComponent billA(){
        return new OneBedBillAsComponent();
    }


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public OneBedBillAsComponent billA2(){
        return new OneBedBillAsComponent( );
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
