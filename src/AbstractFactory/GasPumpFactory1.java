package AbstractFactory;

import Strategy.Cancel_msg.Cancel_msg;
import Strategy.Cancel_msg.Cancel_msg1;
import Strategy.Display_Menu.DisplayMenu;
import Strategy.Display_Menu.DisplayMenu1;
import Strategy.EjectCard.EjectCard;
import Strategy.EjectCard.EjectCard1;
import Strategy.GasPumped_msg.GasPumped_msg;
import Strategy.GasPumped_msg.GasPumped_msg1;
import Strategy.IncorrectPin_msg.IncorrectPin_msg;
import Strategy.IncorrectPin_msg.IncorrectPin_msg1;
import Strategy.InitializeData.InitializeData;
import Strategy.InitializeData.InitializeData1;
import Strategy.Pay_msg.Pay_msg;
import Strategy.Pay_msg.Pay_msg1;
import Strategy.PrintReceipt.PrintReceipt;
import Strategy.PrintReceipt.PrintReceipt1;
import Strategy.Prompt4Pin.Prompt4Pin;
import Strategy.Prompt4Pin.Prompt4Pin1;
import Strategy.PumpGasUnit.PumpGasUnit;
import Strategy.PumpGasUnit.PumpGasUnit1;
import Strategy.Reject_msg.Reject_msg;
import Strategy.Reject_msg.Reject_msg1;
import Strategy.ReturnCash.ReturnCash;
import Strategy.ReturnCash.ReturnCash1;
import Strategy.SetInitialValues.SetInitialValues;
import Strategy.SetInitialValues.SetInitialValues1;
import Strategy.SetPrice.SetPrice;
import Strategy.SetPrice.SetPrice1;
import Strategy.SetW.SetW;
import Strategy.SetW.SetW1;
import Strategy.StoreCash.StoreCash;
import Strategy.StoreCash.StoreCash1;
import Strategy.StorePin.StorePin;
import Strategy.StorePin.StorePin1;
import Strategy.StorePrice.StorePrice;
import Strategy.StorePrice.StorePrice1;

public class GasPumpFactory1 implements AbstractFactory{

    @Override
    public StorePrice getStorePrice() {
        return new StorePrice1();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash1();
    }

    @Override
    public SetW getSetW() {
        return new SetW1();
    }


    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues1();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash1();
    }

    @Override
    public Reject_msg getReject_msg() {
        return new Reject_msg1();
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit1();
    }


    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1();
    }

    @Override
    public Pay_msg getPay_msg() {
        return new Pay_msg1();
    }



    @Override
    public GasPumped_msg getGasPumped_msg() {
        return new GasPumped_msg1();
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard1();
    }

    @Override
    public DisplayMenu getDisplay_Menu() {
        return new DisplayMenu1();
    }

    @Override
    public Cancel_msg getCancel_msg() {
        return new Cancel_msg1();
    }


    /* ///////////  no need ///////////////// */



    @Override
    public StorePin getStorePin() {
        return new StorePin1();
    }
    @Override
    public Prompt4Pin getPrompt4Pin() {
        return new Prompt4Pin1();
    }
    @Override
    public SetPrice getSetPrice() {
        return new SetPrice1();
    }
    @Override
    public InitializeData getInitializeData() {
        return new InitializeData1();
    }
    @Override
    public IncorrectPin_msg getIncorrectPin_msg() {
        return new IncorrectPin_msg1();
    }
}
