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
public class MassageAsComponent implements I_SPA {

    public MassageAsComponent() {
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public I_SPA massage(){
        return new MassageAsComponent();
    }

    public Integer getBill() {
        return 200;
    }

    public String getInfo() {
        return " Thai massage - 17$ ";
    }
}
