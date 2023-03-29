package entity.gems;

public class Sapphire extends AbstractGem{

    public Sapphire(){
    }

    public Sapphire(String name, double carat,
                    double price, double clarity,
                    GemType type){
        super(name, carat, price, clarity, type);
    }
}
