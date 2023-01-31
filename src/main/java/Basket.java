import java.util.ArrayList;

public class Basket <T extends Fruit> {
    ArrayList<T> array = new ArrayList<>();

    public float getWeight(){
        float weight = 0;
        for(int i = 0; i < array.size(); i++){
            weight+=array.get(i).getWeight();
        }
        return weight;
    }

    public void add(T fruit){
        array.add(fruit);
    }

    public static int compare(Basket<? extends Fruit> basket1, Basket<? extends Fruit> basket2){
        if(basket1.getWeight() > basket2.getWeight()){
            return 1;
        }else if(basket1.getWeight() < basket2.getWeight()){
            return -1;
        }
        return 0;
    }

    public void transfer(Basket<? super T> bsk){
        for(int i = 0; i< array.size(); i++){
            bsk.add(array.get(i));
        }
        array.clear();
    }
}
