package Strategy.Cancel_msg;

public class Cancel_msg1 implements Cancel_msg{
    @Override
    public void showCancelMsg() {
        System.out.println("    You have Canceled the transaction!");
        System.out.println("\n");
    }
}
