package Strategy.PumpGasUnit;

import DataStore.DataStore;

public class PumpGasUnit2 implements PumpGasUnit {
    @Override
    public void PumpGasUnit(DataStore d) {
        System.out.println("  The unit of the gas is Gallon!");
        System.out.println("  Your choice is : " + d.getKind() + "gas");
    }
}
