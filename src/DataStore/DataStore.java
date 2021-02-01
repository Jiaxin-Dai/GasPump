package DataStore;

public interface DataStore {

    public void initial();
    public void storePrice();

    public Object getTotal();

    public void setW(int w);
    public int getW();

    public void setPrice(int g);
    public Object getPrice();

    public void setPin();
    public float getCount();

    public void setCash();
    public int getCash();
    public String getKind();

}
