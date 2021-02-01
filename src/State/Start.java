package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class Start extends State {

    public Start(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Activate() {
        op.StorePrice();
        m.changeState(1); //to S0
    }

}
