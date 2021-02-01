package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class S0 extends State{

    public S0(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Start() {
        op.Pay_msg();
        op.InitializeData();
        op.SetW(1);
        m.changeState(2);  //to S1
    }


}
