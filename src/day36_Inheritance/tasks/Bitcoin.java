package day36_Inheritance.tasks;


public class Bitcoin extends CryptoToken {
    public Bitcoin(double price, int quantity, long marketCap, double volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
