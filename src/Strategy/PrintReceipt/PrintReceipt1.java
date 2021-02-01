package Strategy.PrintReceipt;

import DataStore.DataStore;

public class PrintReceipt1 implements PrintReceipt{
    @Override
    public void PrintReceipt(DataStore d) {
        System.out.println("    Print your Receipt : ");
        System.out.println("    Total : $" + d.getTotal());
    }
}
