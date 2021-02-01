package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class S5 extends State{


    public S5(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void StopPump() {
        op.PrintReceipt();
        m.changeState(1); //to s0

    }

    @Override
    public void Pumping() {
        op.PumpGasUnit();
        op.GasPumped_msg();
        //still s5
    }

}
