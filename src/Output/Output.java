package Output;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;

public class Output {

    AbstractFactory af;
    DataStore d;

    public Output(AbstractFactory af, DataStore d){
        this.af = af;
        this.d = d;
    }
    public void StorePrice(){
        af.getStorePrice().StorePrice(d);
    }
    public void StorePin(){
        af.getStorePin().StorePin(d);
    }
    public void StoreCash() {
        af.getStoreCash().StoreCash(d);
    }
    public void SetW(int w){
        af.getSetW().SetW(d,w);
    }
    public void SetPrice(int g){
        af.getSetPrice().SetPrice(d,g);
    }
    public void SetInitialValues(){
        af.getSetInitialValues().SetInitialValues(d);
    }
    public void ReturnCash(){
        af.getReturnCash().ReturnCash(d);
    }
    public void Reject_msg(){
        af.getReject_msg().Reject_msg();
    }
    public void PumpGasUnit(){
        af.getPumpGasUnit().PumpGasUnit(d);
    }
    public void Prompt4Pin(){
        af.getPrompt4Pin().Prompt4Pin();
    }
    public void PrintReceipt(){
        af.getPrintReceipt().PrintReceipt(d);
    }
    public void Pay_msg(){
        af.getPay_msg().Pay_msg();
    }
    public void InitializeData(){
        af.getInitializeData().InitializeData(d);
    }
    public void IncorrectPin_msg(){
        af.getIncorrectPin_msg().IncorrectPin_msg();
    }
    public void GasPumped_msg(){
        af.getGasPumped_msg().GasPumped_msg(d);
    }
    public void EjectCard(){
        af.getEjectCard().EjectCard();
    }
    public void Display_Menu(){
        af.getDisplay_Menu().DisplayMenu();
    }
    public void Cancel_msg(){
        af.getCancel_msg().showCancelMsg();
    }
}
