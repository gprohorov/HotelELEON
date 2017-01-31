package main;

import impls.bills.OneBedBillAsComponent;
import interfaces.IBill;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import impls.bills.LuxuryBill;
// import interfaces.IBill;

//import interfaces.IBill;

/**
 * Created by george on 1/22/17.
 */
public class Start{
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("all_context.xml");

    //    IBill lux = (LuxuryBill) context.getBean("Lux");
     //   System.out.println(lux.getInfo());
//--------------------------------------------------------------
     //   IBill oneBed = (OneBedBill) context.getBean("OneBed");
      //  System.out.println(oneBed.getInfo());
     //   BillsList list = (BillsList) context.getBean("Pool");
     //   list.showBills();
 //-----------------------------------------------------
 /*       BillConveyor conveyor = (BillConveyor) context.getBean("BillConveyor");
        IBill b1 = (OneBedBill) conveyor.createBill();
        System.out.println(b1.getInfo());
*/
 /*
        IBill lux = (LuxuryBill) context.getBean("Lux");
        System.out.println(lux.getInfo());

   */

        IBill wired = (OneBedBillAsComponent) context.getBean("billA");
        System.out.println(wired.getInfo());




    }
}
