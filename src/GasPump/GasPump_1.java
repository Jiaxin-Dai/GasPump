package GasPump;

import AbstractFactory.*;
import DataStore.*;
import MDAEFSM.MDAEFSM;

public class GasPump_1 {

    DS1 d;
    MDAEFSM m;
    AbstractFactory af;
    public GasPump_1(){
        d = new DS1();
        af = new GasPumpFactory1();
        m = new MDAEFSM(af,d);  //pass gasPumpFactory1 and DS1 to MDAEFSM

    }

    public void Activate(int a) {
        if(a > 0){
            d.tmp_a = a;
            m.Activate();
        }
    }

    public void Start() {
        m.Start();
    }

    public void PayCredit() {
        m.PayCredit();
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

    public void PayCash(int c) {
        if(c>0){
            d.tmp_c = c;
            m.PayCash();
        }

    }

    public void StartPump() {
        m.StartPump();
    }

    public void PumpLiter() {
        if(d.getW() == 1){  //not cash
            m.Pumping();
        }
        else if(d.getCash() < (int)d.getPrice() * (d.getL() + 1)  && d.getCash() > 0){
            // cash not enough to continue pumping
            m.StopPump();
        }else{  //cash
            m.Pumping();
        }

    }

    public void StopPump() {
        m.StopPump();
    }
}
