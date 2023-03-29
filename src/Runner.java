import entity.gems.*;
import entity.jewerly.Necklace;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        Diamond diamond = new Diamond("Diamond", 100, 1000, 100, GemType.NATURAL);
        Sapphire sapphire = new Sapphire("Sapphire", 110, 1100, 110, GemType.NATURAL);
        Rubin rubin = new Rubin("Rubin", 120, 1200, 120, GemType.NATURAL);
        List<AbstractGem> gems = new ArrayList<>();
        gems.add(diamond);
        gems.add(sapphire);
        gems.add(sapphire);
        gems.add(rubin);
        Necklace necklace = new Necklace(gems);

        System.out.println("Price of necklace: " + necklace.getPrice());
        System.out.println("Weight of necklace: " + necklace.getCarats() + " carats.");
        System.out.println("What gems has clarity between 115 and 125: ");
        List<AbstractGem> gemsClarity = necklace.findGemsByClarity(110, 125);
        for (int i = 0 ; i < gemsClarity.size(); i++){
            System.out.println(gemsClarity.get(i).getName());
        }
    }
}
