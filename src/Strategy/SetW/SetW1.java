package Strategy.SetW;

import DataStore.DataStore;

public class SetW1 implements SetW {
    @Override
    public void SetW(DataStore d, int w) {
        d.setW(w);
    }
}
