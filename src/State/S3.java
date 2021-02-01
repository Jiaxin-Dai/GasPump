package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public class S3 extends State{

    public S3(MDAEFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void IncorrectPin(int i) {
        if(m.getK() == i){
            op.IncorrectPin_msg();
            op.EjectCard();
            m.changeState(1); // to s0
        }
        else if(m.getK() <= i){
            int k = m.getK();
            op.IncorrectPin_msg();
            m.setK(++k);
            //still s3
        }
    }

    public void CorrectPin(){
        op.Display_Menu();
        op.EjectCard();
        m.changeState(5); //to s4

    }

}
