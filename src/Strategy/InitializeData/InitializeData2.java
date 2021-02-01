package Strategy.InitializeData;

import DataStore.DataStore;

public class InitializeData2 implements InitializeData {
    @Override
    public void InitializeData(DataStore d) {
        d.setPrice(0);
    }
}
