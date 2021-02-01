package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class S2 extends State{

    public S2(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Reject() {
        op.Reject_msg();
        op.EjectCard();
        m.changeState(1); //to s0
    }


    @Override
    public void Approved() {
        op.Display_Menu();
        op.EjectCard();
        m.changeState(5); //to s4
    }

}
