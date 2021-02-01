package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class S1 extends State{

    public S1(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void PayCredit() {
        m.changeState(3); //to s2
    }

    @Override
    public void PayCash() {
        op.StoreCash();
        op.Display_Menu();
        op.SetW(0);
        m.changeState(5);  //to s4
    }

    @Override
    public void PayDebit() {
        op.Prompt4Pin();
        op.StorePin();
        m.setK(0);
        m.changeState(4); //to s3
    }

}
