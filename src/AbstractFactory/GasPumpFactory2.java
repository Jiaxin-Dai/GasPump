package AbstractFactory;

import Strategy.Cancel_msg.Cancel_msg;
import Strategy.Cancel_msg.Cancel_msg1;
import Strategy.Display_Menu.DisplayMenu;
import Strategy.Display_Menu.DisplayMenu2;
import Strategy.EjectCard.EjectCard;
import Strategy.EjectCard.EjectCard1;
import Strategy.GasPumped_msg.GasPumped_msg;
import Strategy.GasPumped_msg.GasPumped_msg2;
import Strategy.IncorrectPin_msg.IncorrectPin_msg;
import Strategy.IncorrectPin_msg.IncorrectPin_msg2;
import Strategy.InitializeData.InitializeData;
import Strategy.InitializeData.InitializeData2;
import Strategy.Pay_msg.Pay_msg;
import Strategy.Pay_msg.Pay_msg2;
import Strategy.PrintReceipt.PrintReceipt;
import Strategy.PrintReceipt.PrintReceipt2;
import Strategy.Prompt4Pin.Prompt4Pin;
import Strategy.Prompt4Pin.Prompt4Pin2;
import Strategy.PumpGasUnit.PumpGasUnit;
import Strategy.PumpGasUnit.PumpGasUnit2;
import Strategy.Reject_msg.Reject_msg;
import Strategy.Reject_msg.Reject_msg1;
import Strategy.ReturnCash.ReturnCash;
import Strategy.ReturnCash.ReturnCash2;
import Strategy.SetInitialValues.SetInitialValues;
import Strategy.SetInitialValues.SetInitialValues2;
import Strategy.SetPrice.SetPrice;
import Strategy.SetPrice.SetPrice2;
import Strategy.SetW.SetW;
import Strategy.SetW.SetW2;
import Strategy.StoreCash.StoreCash;
import Strategy.StoreCash.StoreCash2;
import Strategy.StorePin.StorePin;
import Strategy.StorePin.StorePin2;
import Strategy.StorePrice.StorePrice;
import Strategy.StorePrice.StorePrice2;

public class GasPumpFactory2 implements AbstractFactory {
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice2();
    }
    @Override
    public StorePin getStorePin() {
        return new StorePin2();
    }



    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2();
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues2();
    }


    @Override
    public Reject_msg getReject_msg() {
        return new Reject_msg1();
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit2();
    }

    @Override
    public Prompt4Pin getPrompt4Pin() {
        return new Prompt4Pin2();
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2();
    }

    @Override
    public Pay_msg getPay_msg() {
        return new Pay_msg2();
    }

    @Override
    public InitializeData getInitializeData() {
        return new InitializeData2();
    }

    @Override
    public IncorrectPin_msg getIncorrectPin_msg() {
        return new IncorrectPin_msg2();
    }

    @Override
    public GasPumped_msg getGasPumped_msg() {
        return new GasPumped_msg2();
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard1();
    }

    @Override
    public DisplayMenu getDisplay_Menu() {
        return new DisplayMenu2();
    }

    @Override
    public Cancel_msg getCancel_msg() {
        return new Cancel_msg1();
    }

    /* ///////////  no need ///////////////// */
    @Override
    public StoreCash getStoreCash() {
        return new StoreCash2() ;
    }
    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash2();
    }

    @Override
    public SetW getSetW() {
        return new SetW2();
    }
}
