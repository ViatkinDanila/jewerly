package entity.gems;

public class Diamond extends AbstractGem{

    public Diamond(String name, double carat,
                   double price, double clarity,
                   GemType type){
       super(name, carat, price, clarity, type);
    }
}
