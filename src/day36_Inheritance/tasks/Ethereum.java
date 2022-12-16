package day36_Inheritance.tasks;

public class Ethereum extends CryptoToken{
    public Ethereum(double price, int quantity, long marketCap, double volume, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
