package DataStore;

public class DS1 implements DataStore{
    public int total;
    public int tmp_a = 0; //tmp price
    public int tmp_c = 0; // tmp cash
    public int price;
    public int cash;
    public int w; //cash flag, cash:0 ,otherwise:1
    public int L; //the num has been pumped

    @Override
    public void initial() {
        L = 0;
        total = 0;
    }

    @Override
    public void storePrice() {
        this.price = tmp_a;
    }

    public Object getTotal(){
        total = price * L;
        return total;
    }

    @Override
    public void setW(int w) {
        //w = 1 : credit
        //w = 0 : cash
        this.w = w;
    }
    @Override
    public int getW() {
        return w;
    }

    public void setCash() {
        this.cash = tmp_c;
    }


    public int getCash() {
        return cash;
    }

    @Override
    public Object getPrice(){
        return price;
    }


    @Override
    public float getCount() {
        return this.getL();
    }

   //the machine to set the gas count has been pumped
    public void setL(float l) { this.L = (int)l;}
    public int getL() {
        return L;
    }



    // for gp1 : useless
    @Override
    public void setPrice(int g) {
        // do nothing
    }
    @Override
    public void setPin() {
    }
    @Override
    public String getKind() {
        return "Gas";
    }

}
