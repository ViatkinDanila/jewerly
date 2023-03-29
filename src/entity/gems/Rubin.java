package entity.gems;

public class Rubin extends AbstractGem{

    public Rubin(){
    }

    public Rubin(String name, double carat,
                 double price, double clarity,
                 GemType type){
        super(name, carat, price, clarity, type);
    }
}
