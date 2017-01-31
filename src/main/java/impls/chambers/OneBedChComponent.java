package impls.chambers;

import interfaces.IChamber;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by george on 1/22/17.
 */
@Component
public class OneBedChComponent extends BaseChamber {

    private final String miniBarStr = " mini Bar";
    private final String frigStr = " Frig Ariston";
    private final String airConditionerStr = " Air Conditioning";
    private final String jacuzziStr = " Jacuzzi tube";

    public OneBedChComponent() {

        super();
        Random random = new Random();
        this.setId(random.nextInt());
    }
    public OneBedChComponent(int id) {
        super();
        this.setId(id);
    }


    public OneBedChComponent(int id,
                             int beds,
                             Boolean miniBar,
                             Boolean frig,
                             Boolean airConditioner,
                             Boolean jacuzzi)
    {
        super(id, beds, miniBar, frig, airConditioner, jacuzzi);
    }

    @Bean
    @Qualifier("test")
    public IChamber chamberViaA(){
        return new OneBedChamber(4,
                1,
                false,
                false,
                false,
                false);
    }


    public Integer getBill() {
        int sum=100 + (isMiniBar()          ? 10: 0)
                + (isFrig()             ? 20: 0)
                + (isAirConditioner()   ? 30: 0)
                + (isJacuzzi()          ? 40: 0)
                ;

        return sum;
    }

    public String getInfo() {
        return "One bed chamber / "
                + (isMiniBar()          ? miniBarStr: "") + "/"
                + (isFrig()             ? frigStr: "") + "/"
                + (isAirConditioner()   ? airConditionerStr: "") + "/"
                + (isJacuzzi()          ? jacuzziStr: "");
    }
}
