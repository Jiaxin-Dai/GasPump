package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class S4 extends State{

    public S4(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Cancel() {
        op.Cancel_msg();
        op.ReturnCash();
        m.changeState(1); //to s0
    }

    @Override
    public void StartPump() {
        op.SetInitialValues();
        m.changeState(6); //to s5
    }

    @Override
    public void SelectGas(int g) {
        op.SetPrice(g);
        //still s4
    }
}
