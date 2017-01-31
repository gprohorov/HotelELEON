package impls.spa;

import interfaces.I_SPA;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by george on 1/22/17.
 */
@Component
public class EmptyBill implements I_SPA {

   public EmptyBill() {
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public I_SPA nothing(){
       return new EmptyBill();
    }

    public Integer getBill() {
        return 0;
    }

    public String getInfo() {
        return " SPA  - nothing " + this.getBill();
    }
}
