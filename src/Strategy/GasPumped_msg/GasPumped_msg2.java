package Strategy.GasPumped_msg;

import DataStore.DataStore;

public class GasPumped_msg2 implements GasPumped_msg{
    @Override
    public void GasPumped_msg(DataStore d) {
        System.out.println("  Gas Pumped: "+ d.getCount() +" Gallons");
        System.out.println();
    }
}
