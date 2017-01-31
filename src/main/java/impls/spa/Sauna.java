package impls.spa;

import interfaces.I_SPA;

/**
 * Created by george on 1/22/17.
 */
public class Sauna implements I_SPA {
    private int hours;

    public Sauna() {
    }

    public Sauna(int hours) {
        this.hours = hours;
    }

    public Integer getBill() {
        return 50*hours;
    }

    public String getInfo() {
        return "Sauna " + hours + " hours";
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
