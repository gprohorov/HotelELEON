package impls.chambers;

import interfaces.IChamber;

/**
 * Created by george on 1/22/17.
 */
public abstract class BaseChamber implements IChamber{
    private int id;
    private int beds;
    private Boolean miniBar;
    private Boolean frig;
    private Boolean airConditioner;
    private Boolean jacuzzi;

    public BaseChamber(int id, int beds, Boolean miniBar, Boolean frig, Boolean airConditioner, Boolean jacuzzi) {
        this.id = id;
        this.beds = beds;
        this.miniBar = miniBar;
        this.frig = frig;
        this.airConditioner = airConditioner;
        this.jacuzzi = jacuzzi;
    }

    public BaseChamber(int beds) {
        this.beds = beds;
    }

    public BaseChamber() {
        this.id =0;

        this.beds =1;
        this.miniBar = true;
        this.frig = true;
        this.airConditioner = true;
        this.jacuzzi = true;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public void setMiniBar(Boolean miniBar) {
        this.miniBar = miniBar;
    }

    public boolean isFrig() {
        return frig;
    }

    public void setFrig(Boolean frig) {
        this.frig = frig;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(Boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }


}
