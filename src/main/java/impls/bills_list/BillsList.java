package impls.bills_list;


import interfaces.IBill;
import interfaces.IBillsList;

import java.util.Collection;

/**
 * Created by george on 1/26/17.
 */

public class BillsList implements IBillsList{

   private Collection<IBill> billsList;

    public BillsList() {
    }

    public void setBillsList(Collection<IBill> billsList) {
        this.billsList = billsList;
    }


    public void showBills(){
        for (IBill bill: billsList){
              System.out.println("----- bill---------");
              System.out.println(bill.getInfo());
        }
    }

    public Collection<IBill> getBillsList() {
        return this.billsList;
    }
}

