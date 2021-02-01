package Strategy.StorePin;

import DataStore.DataStore;

public class StorePin2 implements StorePin{

    @Override
    public void StorePin(DataStore d) {
        d.setPin();
    }
}
