package entity.gems;

public class AbstractGem {

    private String name;
    private double carat;
    private double price;
    private double clarity;
    private GemType type;

    public AbstractGem(){
    }

    public AbstractGem(String name, double carat,
                       double price, double clarity,
                       GemType type) {
        this.name = name;
        this.carat = carat;
        this.price = price;
        this.clarity = clarity;
        this.type = type;
    }

    public void setCarat(double carat){
        this.carat = carat;
    }

    public double getCarat(){
        return carat;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClarity() {
        return clarity;
    }

    public void setClarity(double clarity) {
        this.clarity = clarity;
    }

    public GemType getType() {
        return type;
    }

    public void setType(GemType type) {
        this.type = type;
    }
}
