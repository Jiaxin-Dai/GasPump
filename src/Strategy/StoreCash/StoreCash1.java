package Strategy.StoreCash;

import DataStore.DataStore;

public class StoreCash1 implements StoreCash{
    @Override
    public void StoreCash(DataStore d) {
        d.setCash();
    }
}
