package Strategy.SetInitialValues;

import DataStore.DataStore;

public class SetInitialValues2 implements SetInitialValues {
    @Override
    public void SetInitialValues(DataStore d) {
        d.initial();
    }
}
