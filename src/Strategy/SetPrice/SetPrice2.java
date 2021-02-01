package Strategy.SetPrice;

import DataStore.DataStore;

public class SetPrice2 implements SetPrice {
    @Override
    public void SetPrice(DataStore d, int g) {
        d.setPrice(g);
    }
}
