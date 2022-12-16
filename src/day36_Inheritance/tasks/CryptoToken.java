package day36_Inheritance.tasks;

public class CryptoToken {
    public double price;
    public int quantity;
    public long marketCap;
    public double volume;
    public long circulatingSupply;
    public boolean isMineable;

    public CryptoToken(double price, int quantity, long marketCap, double volume, long circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

    public double totalPrice(){
        return price * quantity;
    }
}
