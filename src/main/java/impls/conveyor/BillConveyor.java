package impls.conveyor;

import interfaces.IBill;
import interfaces.IBillConveyor;

/**
 * Created by george on 1/27/17.
 */
public abstract class BillConveyor implements IBillConveyor {

    @Override
    public abstract IBill createBill();

}
