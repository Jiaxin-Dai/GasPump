package Strategy.GasPumped_msg;
import DataStore.*;

public class GasPumped_msg1 implements GasPumped_msg{
    @Override
    public void GasPumped_msg(DataStore d) {
        System.out.println("  Gas Pumped: "+ d.getCount() +" Liters");
        System.out.println();
    }
}
