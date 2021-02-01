package Strategy.SetInitialValues;

import DataStore.DataStore;

public class SetInitialValues1 implements SetInitialValues {
    @Override
    public void SetInitialValues(DataStore d) {
        d.initial();
    }
}
