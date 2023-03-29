package entity.jewerly;

import entity.gems.AbstractGem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Necklace {

    private List<AbstractGem> gems;

    public Necklace(List<AbstractGem> gems){
        this.gems = gems;
    }

    public List<AbstractGem> getGems(){
        return gems;
    }

    public void addGem(AbstractGem gem){
        this.gems.add(gem);
    }

    public void addGems(List<AbstractGem> gems){
        this.gems.addAll(gems);
    }

    public double getCarats(){
        double carats = 0;
        for (int i = 0; i < gems.size();i++){
            carats += gems.get(i).getCarat();
        }
        return carats;
    }

    public double getPrice(){
        double price = 0;
        for (int i = 0; i < gems.size(); i++){
            price += gems.get(i).getPrice();
        }

        return price;
    }

    public List<AbstractGem> sortGemsByPrice(){
        List<AbstractGem> sortedGems = new ArrayList<>(gems);
        double min = Double.MAX_VALUE;
        AbstractGem gem;
        for (int i = 0; i < sortedGems.size() - 1; i++){
            for (int j = i + 1; j < sortedGems.size(); j++){
                if (sortedGems.get(i).getPrice() > sortedGems.get(j).getPrice()){
                    gem = sortedGems.get(i);
                    sortedGems.set(i, sortedGems.get(j));
                    sortedGems.set(j, gem);
                }
            }
        }
        return sortedGems;
    }

    public List<AbstractGem> findGemsByClarity(double minClarity, double maxClarity){
        List<AbstractGem> resultGems = new ArrayList<>();
        for (int i = 0 ; i < gems.size(); i++){
            AbstractGem gem = gems.get(i);
            if (gem.getClarity() >= minClarity && gem.getClarity() <= maxClarity){
                resultGems.add(gem);
            }
        }
        return resultGems;
    }
}
