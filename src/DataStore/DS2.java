package DataStore;

public class DS2 implements DataStore{

    public float total;
    public float tmp_a = 0;   //tmp regular price
    public float tmp_b = 0;  //tmp super price
    public float tmp_c = 0;   //tmp diesel price
    public String tmp_p = "";  //tmp pin

    public String kind = "";
    public float pRegular;
    public float pSuper;
    public float pDiesel;
    public float price;
    public String pin;
    public int G;  //the gas has been pumped


    @Override
    public void initial() {
        G = 0;
        total = 0;
    }

    @Override
    public void storePrice() {
        pRegular = tmp_a;
        pSuper = tmp_b;
        pDiesel = tmp_c;
    }

    @Override
    public Object getTotal() {
        total = price * G;
        return total;
    }


    @Override
    public void setPrice(int g) {
        if(g == 0){
            price = 0;
        }
        else if(g == 1){//regular
            price = pRegular;
            kind = " Regular ";
        }
        else if(g == 2){ //super
            price = pSuper;
            kind = " Super ";
        }
        else if(g == 3){//diesel
            price = pDiesel;
            kind = " Diesel ";
        }
    }

    @Override
    public Object getPrice(){
        return price;
    }

    @Override
    public void setPin() {
        pin = tmp_p;
    }

    @Override
    public float getCount() {
        return getG();
    }

    //the machine to set the gas count has been pumped
    public void setG(float g) { this.G = (int)g;}
    public int getG() {
        return G;
    }


    public String getKind(){
        return kind;
    }
    public String getPin() {
        return pin;
    }


    //for GP2 useless
    @Override
    public void setW(int w) {
        //do nothing
    }
    @Override
    public int getW() {
        return 1;
    }
    @Override
    public int getCash() {
        return 0;
    }
    @Override
    public void setCash() { }
}
