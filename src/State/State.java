package State;

import MDAEFSM.MDAEFSM;
import Output.Output;

public abstract class State {

    MDAEFSM m;
    Output op;
    public State(MDAEFSM m, Output op){
        this.m = m;
        this.op = op;
    }
    public void Activate(){};

    public void Start(){};

    public void PayCredit(){};

    public void Reject(){};

    public void Cancel(){};

    public void Approved(){};

    public void PayCash(){};

    public void PayDebit(){};

    public void StartPump(){};

    public void StopPump(){};

    public void Pumping(){};

    public void CorrectPin(){};

    public void IncorrectPin(int i){};

    public void SelectGas(int g){};
}
