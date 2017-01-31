package impls.kitchen;

import interfaces.IKitchen;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by george on 1/22/17.
 */
@Component
public class LunchAsComponent implements IKitchen {
    public LunchAsComponent() {
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public IKitchen lunchA(){
        return new LunchAsComponent();
    }

    public Integer getBill() {
        return 102;
    }

    public String getInfo() {
        return "Lunch " + this.getBill();
    }
}
