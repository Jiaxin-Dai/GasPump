package Strategy.StorePrice;

import DataStore.DataStore;

public class StorePrice1 implements StorePrice{
    @Override
    public void StorePrice(DataStore d) {
        d.storePrice();
    }
}
