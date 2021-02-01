package AbstractFactory;

import Strategy.Cancel_msg.Cancel_msg;
import Strategy.Display_Menu.DisplayMenu;
import Strategy.EjectCard.EjectCard;
import Strategy.GasPumped_msg.GasPumped_msg;
import Strategy.IncorrectPin_msg.IncorrectPin_msg;
import Strategy.InitializeData.InitializeData;
import Strategy.Pay_msg.Pay_msg;
import Strategy.PrintReceipt.PrintReceipt;
import Strategy.Prompt4Pin.Prompt4Pin;
import Strategy.PumpGasUnit.PumpGasUnit;
import Strategy.Reject_msg.Reject_msg;
import Strategy.ReturnCash.ReturnCash;
import Strategy.SetInitialValues.SetInitialValues;
import Strategy.SetPrice.SetPrice;
import Strategy.SetW.SetW;
import Strategy.StoreCash.StoreCash;
import Strategy.StorePin.StorePin;
import Strategy.StorePrice.StorePrice;

public interface AbstractFactory {

    public StorePrice getStorePrice();
    public StorePin getStorePin();
    public StoreCash getStoreCash();
    public SetW getSetW();
    public SetPrice getSetPrice();
    public SetInitialValues getSetInitialValues();
    public ReturnCash getReturnCash();
    public Reject_msg getReject_msg();
    public PumpGasUnit getPumpGasUnit();
    public Prompt4Pin getPrompt4Pin();
    public PrintReceipt getPrintReceipt();
    public Pay_msg getPay_msg();
    public InitializeData getInitializeData();
    public IncorrectPin_msg getIncorrectPin_msg();
    public GasPumped_msg getGasPumped_msg();
    public EjectCard getEjectCard();
    public DisplayMenu getDisplay_Menu();
    public Cancel_msg getCancel_msg();
}
