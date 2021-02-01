import GasPump.*;

import java.util.Scanner;

public class driver {

    public static Scanner sc = new Scanner(System.in);
    static int in = '1';


    public static void main(String[] args) {


        System.out.println("    ------------------------------------------------------");
        System.out.println("                CS586 - Final Project - 2020 ");
        System.out.println("                     -- Gas Pump System --");
        System.out.println("        Select the Pump System:");
        System.out.println("        999. Quit");
        System.out.println("        1. Pump1");
        System.out.println("        2. Pump2");
        System.out.println("    ------------------------------------------------------");
        System.out.print("         Enter the value:");
        in = sc.nextInt();

        do{
            switch (in) {
                case 999: {
                    System.out.println("             See you next time!");
                    break;
                }

                case 1: {
                    //enter Gas Pump 1
                    Gas1();
                    break;

                }
                case 2: {
                    //enter Gas Pump 2
                    Gas2();
                    break;
                }
            }
        }while(in!=999);



    }

    public static void Gas1() {
        GasPump_1 gp1 = new GasPump_1();
        // -----------Menu--------
        System.out.println("    ----------------------------------------------------");
        System.out.println("    |                      GasPump-1                    |");
        System.out.println("    |              MENU of Operations                   |");
        System.out.println("    |      0. Activate(int)                             |");
        System.out.println("    |      1. Start()                                   |");
        System.out.println("    |      2. PayCredit                                 |");
        System.out.println("    |      3. PayCash(int)                              |");
        System.out.println("    |      4. Reject()                                  |");
        System.out.println("    |      5. Approved()                                |");
        System.out.println("    |      6. Cancel()                                  |");
        System.out.println("    |      7. StartPump()                               |");
        System.out.println("    |      8. PumpLiter()                               |");
        System.out.println("    |      9. StopPump()                                |");
        System.out.println("    |      999. Quit the program                        |");
        System.out.println("    |      Please make a note of these operations       |");
        System.out.println("    ----------------------------------------------------");
        System.out.print("\n \n");

        do{
            System.out.println("    ----------------------------------------------------------------------");
            System.out.println("    |     GasPump-1 Execution                                             |");
            // ----------  select   -----------
            System.out.println("    |  0-Activate       1-Start          2-PayCredit           3-PayCash  | ");
            System.out.println("    |  4-Reject         5-Approved       6-Cancel                         |");
            System.out.println("    |  7-StartPump      8-PumpLiter      9-StopPump                       |");
            System.out.println("    |  999-quit                                                           |");
            System.out.println("    ----------------------------------------------------------------------");
            System.out.print("\n");
            System.out.print("  Select Operation: ");
            in = sc.nextInt();
            switch (in) {
                case 999: {
                    System.out.println("\n");
                    System.out.println("             See you next time!");
                    break;
                }
                case 0: { //Activate()
                    System.out.print("  Operation:  Activate(int a)");
                    System.out.println("\n");
                    System.out.print("  Enter value of the parameter a:");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                }

                case 1: { //Start
                    System.out.println("\n");
                    System.out.print("  Operation:  Start()");
                    System.out.println("\n");
                    gp1.Start();
                    break;
                }

                case 2: { //PayCredit
                    System.out.println("\n");
                    System.out.print("  Operation:  PayCredit()");
                    System.out.println("\n");
                    gp1.PayCredit();
                    break;
                }

                case 3: { //PayCash
                    System.out.println("\n");
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.println("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.println("\n");
                    int c = sc.nextInt();
                    gp1.PayCash(c);
                    break;
                }
                case 4: { //Reject
                    System.out.println("\n");
                    System.out.print("  Operation:  Reject()");
                    System.out.println("\n");
                    gp1.Reject();
                    break;
                }


                case 5: { //Approved
                    System.out.println("\n");
                    System.out.print("  Operation:  Approved()");
                    System.out.println("\n");
                    gp1.Approved();
                    break;
                }

                case 6: { //Cancel
                    System.out.println("\n");
                    System.out.print("  Operation:  Cancel()");
                    System.out.println("\n");
                    gp1.Cancel();
                    break;
                }


                case 7: { //StartPump
                    System.out.println("\n");
                    System.out.print("  Operation:  StartPump()");
                    System.out.println("\n");
                    gp1.StartPump();
                    break;
                }


                case 8: { //PumpLiter
                    System.out.println("\n");
                    System.out.print("  Operation:  PumpLiter()");
                    System.out.println("\n");
                    gp1.PumpLiter();
                    break;
                }

                case 9: { //StopPump
                    System.out.println("\n");
                    System.out.print("  Operation:  StopPump()");
                    System.out.println("\n");
                    gp1.StopPump();
                    break;
                }
            }

        }while(in != 999);
    }
    public static void Gas2(){
        GasPump_2 gp2 = new GasPump_2();

        System.out.println("      ----------------------------------------------------");
        System.out.println("      |                    GasPump-2                      |");
        System.out.println("      |            MENU of Operations                     |");
        System.out.println("      |    0. Activate(float,float,float)                 |");
        System.out.println("      |    1. Start()                                     |");
        System.out.println("      |    2. PayCredit                                   |");
        System.out.println("      |    3. PayDebit(String)                            |");
        System.out.println("      |    4. Reject()                                    |");
        System.out.println("      |    5. Cancel()                                    |");
        System.out.println("      |    6. Approved()                                  |");
        System.out.println("      |    7. Pin(String)                                 |");
        System.out.println("      |    8. diesel()                                    |");
        System.out.println("      |    9. Regular()                                   |");
        System.out.println("      |    10. Super()                                    |");
        System.out.println("      |    11. StartPump()                                |");
        System.out.println("      |    12. PumpGallon()                               |");
        System.out.println("      |    13. StopPump()                                 |");
        System.out.println("      |    14. FullTank()                                 |");
        System.out.println("      |    999. Quit the program                          |");
        System.out.println("      |    Please make a note of these operations         |");
        System.out.println("      ----------------------------------------------------");
        System.out.print("\n \n");

        do{
            System.out.println("    ----------------------------------------------------------------------");
            System.out.println("    |       GasPump-2 Execution                                           |");
            System.out.println("    |  0-Activate     1-Start        2-PayCredit    3-PayDebit            |");
            System.out.println("    |  4-Reject       5-Cancel       6-Approved     7-Pin                 |");
            System.out.println("    |  8-diesel       9-Regular      10-Super                             |");
            System.out.println("    |  11-StartPump   12-PumpGallon  13-StopPump    14-FullTank           |");
            System.out.println("    |  999-quit                                                           |");
            System.out.println("    ----------------------------------------------------------------------");
            System.out.print("  Select Operation: ");
            in = sc.nextInt();
            switch (in) {
                case 999: {
                    System.out.println("\n");
                    System.out.println("             See you next time!");
                    break;
                }
                case 0: { //Activate()
                    System.out.println("\n");
                    System.out.print("  Operation:  Activate(float a, float b, float c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    float a = sc.nextFloat();
                    System.out.print("  Enter value of the parameter b:");
                    float b = sc.nextFloat();
                    System.out.print("  Enter value of the parameter c:");
                    float c = sc.nextFloat();
                    System.out.print("\n");
                    gp2.Activate(a, b, c);
                    break;
                }

                case 1: { //Start
                    System.out.println("\n");
                    System.out.print("  Operation:  Start()");
                    System.out.println("\n");
                    gp2.Start();
                    break;
                }

                case 2: { //PayCredit
                    System.out.println("\n");
                    System.out.print("  Operation:  PayCredit()");
                    System.out.println("\n");
                    gp2.PayCredit();
                    break;
                }

                case 3: { //PayDebit
                    System.out.println("\n");
                    System.out.print("  Operation:  PayDebit()");
                    System.out.println("\n");
                    System.out.print("  Enter your Debit pin code:");
                    String pin = sc.next();
                    System.out.println("\n");
                    gp2.PayDebit(pin);
                    break;
                }

                case 4: { //Reject
                    System.out.println("\n");
                    System.out.print("  Operation:  Reject()");
                    System.out.println("\n");
                    gp2.Reject();
                    break;
                }
                case '5': { //Cancel
                    System.out.println("\n");
                    System.out.print("  Operation:  Cancel()");
                    System.out.println("\n");
                    gp2.Cancel();
                    break;
                }

                case 6: { //Approved
                    System.out.println("\n");
                    System.out.print("  Operation:  Approved()");
                    System.out.println("\n");
                    gp2.Approved();
                    break;
                }
                case 7: { //Pin
                    System.out.println("\n");
                    System.out.print("  Operation:  Pin()");
                    System.out.println("\n");
                    System.out.print("  Please Enter your pin to check:");
                    String p = sc.next();
                    gp2.Pin(p);
                    break;
                }
                case 8: { //Diesel
                    System.out.println("\n");
                    System.out.print("  Operation:  Diesel()");
                    System.out.println("\n");
                    gp2.Diesel();
                    break;
                }
                case 9: { //Regular
                    System.out.println("\n");
                    System.out.print("  Operation:  Regular()");
                    System.out.println("\n");
                    gp2.Regular();
                    break;
                }
                case 10: { //Super
                    System.out.println("\n");
                    System.out.print("  Operation:  Super()");
                    System.out.println("\n");
                    gp2.Super();
                    break;
                }
                case 11: { //StartPump
                    System.out.println("\n");
                    System.out.print("  Operation:  StartPump()");
                    System.out.println("\n");
                    gp2.StartPump();
                    break;
                }


                case 12: { //PumpGallon
                    System.out.println("\n");
                    System.out.print("  Operation:  PumpGallon()");
                    System.out.println("\n");
                    gp2.PumpGallon();
                    break;
                }

                case 13: { //StopPump
                    System.out.println("\n");
                    System.out.print("  Operation:  StopPump()");
                    System.out.println("\n");
                    gp2.StopPump();
                    break;
                }
                case 14: { //FullTank
                    System.out.println("\n");
                    System.out.print("  Operation:  FullTank()");
                    System.out.println("\n");
                    gp2.FullTank();
                    break;
                }
            }
            // endswitch

        }while(in != 999);

    }
}