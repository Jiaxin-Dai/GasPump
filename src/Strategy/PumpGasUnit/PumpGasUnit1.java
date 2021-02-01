package Strategy.PumpGasUnit;

import DataStore.DataStore;

public class PumpGasUnit1 implements PumpGasUnit {
    @Override
    public void PumpGasUnit(DataStore d) {
        System.out.println("  The unit of the gas is Liter!");
    }
}
