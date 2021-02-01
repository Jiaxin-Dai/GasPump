package GasPump;

import AbstractFactory.*;
import DataStore.DS2;
import MDAEFSM.MDAEFSM;

public class GasPump_2 {
    DS2 d;
    MDAEFSM m;
    AbstractFactory af;

    public GasPump_2(){
        d = new DS2();
        af = new GasPumpFactory2();
        m = new MDAEFSM(af,d);  //pass gasPumpFactory2 and DS2 to MDAEFSM
    }
    public void Activate(float a,float b,float c) {
        if( (a>0) && (b>0) && (c>0)){
            d.tmp_a = a;
            d.tmp_b = b;
            d.tmp_c = c;
            m.Activate();
        }
    }

    public void Start() {
        m.Start();
    }

    public void PayCredit() {
        m.PayCredit();
    }
    public void PayDebit(String p) {
        d.tmp_p = p;
        m.PayDebit();
    }
    public void Reject() {
        m.Reject();
    }

    public void Cancel() {
        m.Cancel();
    }

    public void Approved() {
        m.Approved();
    }
    public void Pin(String x) {
        if( x.equals(d.getPin()) ){ //the enter string matches correct pin
            m.CorrectPin();
        }
        else
            m.IncorrectPin(3);  //max wrong attempts = 3
    }
    public void Diesel() {
        m.SelectGas(3);
    }
    public void Regular() {
        m.SelectGas(1);
    }
    public void Super() {
        m.SelectGas(2);
    }
    public void StartPump() {
        m.StartPump();
    }
    
    public void PumpGallon() {
        m.Pumping();
    }
    public void StopPump() {
        m.StopPump();
    }


    public void FullTank() {
        m.StopPump();
    }
}
