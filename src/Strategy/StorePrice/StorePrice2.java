package Strategy.StorePrice;

import DataStore.DataStore;

public class StorePrice2 implements StorePrice{
    @Override
    public void StorePrice(DataStore d) {
        d.storePrice();
    }
}
