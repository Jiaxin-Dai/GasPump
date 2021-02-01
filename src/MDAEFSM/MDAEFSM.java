package MDAEFSM;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;
import Output.*;
import State.*;

public class MDAEFSM {

    private State currentState;
    private State sList[];

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int k;

    public MDAEFSM(AbstractFactory af, DataStore d){
        Output op = new Output(af,d);
        sList = new State[7];
        sList[0] = new Start(this,op);
        sList[1] = new S0(this,op);
        sList[2] = new S1(this,op);
        sList[3] = new S2(this,op);
        sList[4] = new S3(this,op);
        sList[5] = new S4(this,op);
        sList[6] = new S5(this,op);
        currentState = sList[0];
    }

    public void changeState(int i) {
        currentState = sList[i];
        System.out.println("  The Current State : S" + (i-1)+ " State.");
    }

    public void Activate() {
        currentState.Activate();
    }

    public void Start() {
        currentState.Start();
    }

    public void PayCredit() {
        currentState.PayCredit();
    }

    public void Reject() {
        currentState.Reject();
    }

    public void Cancel() {
        currentState.Cancel();
    }

    public void Approved() {
        currentState.Approved();
    }

    public void PayCash() {
        currentState.PayCash();
    }
    public void PayDebit() {
        currentState.PayDebit();
    }

    public void StartPump() {
        currentState.StartPump();
    }


    public void StopPump() {
        currentState.StopPump();
    }


    public void Pumping() {
        currentState.Pumping();
    }


    public void CorrectPin() {
        currentState.CorrectPin();
    }

    public void IncorrectPin(int i) {
        currentState.IncorrectPin(i);
    }

    public void SelectGas(int g) {
        currentState.SelectGas(g);
    }
}
