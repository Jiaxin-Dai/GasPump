package Strategy.IncorrectPin_msg;

import DataStore.DataStore;

public class IncorrectPin_msg2 implements IncorrectPin_msg{
    @Override
    public void IncorrectPin_msg() {
        System.out.println("        !! Wrong Pin! Please Try Again !!");
    }
}
