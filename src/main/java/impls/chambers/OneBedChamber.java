package impls.chambers;

import java.util.Random;

/**
 * Created by george on 1/22/17.
 */
public class OneBedChamber extends BaseChamber {

    private final String miniBarStr = " mini Bar";
    private final String frigStr = " Frig NORD";
    private final String airConditionerStr = " Air Conditioning";
    private final String jacuzziStr = " Jacuzzi tube";

    public OneBedChamber() {

        super();
        Random random = new Random();
        this.setId(random.nextInt());
    }
    public OneBedChamber(int id) {
        super();
        this.setId(id);

    }

    public OneBedChamber(int id, int beds, Boolean miniBar, Boolean frig, Boolean airConditioner, Boolean jacuzzi) {
        super(id, beds, miniBar, frig, airConditioner, jacuzzi);
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
