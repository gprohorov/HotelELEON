package interfaces;

/**
 * Created by george on 1/22/17.
 */
public interface IChamber {
    enum WINDOW  {SOUTH, NORTH,WEST,EAST}
    public Integer getBill();
    public String getInfo();

}
