package Strategy.ReturnCash;

import DataStore.DataStore;

public class ReturnCash1 implements ReturnCash{
    @Override
    public void ReturnCash(DataStore d) {
        System.out.println("    You got the return cash: $" + (d.getCash()) );
    }
}
