public class Main {
    public static void main(String[] args) {
        Basket<Fruit> fruits = new Basket<>();
        Basket<Apple> apples = new Basket<>();
        Basket<Orange> oranges = new Basket<>();
        for(int i = 0; i < 100; i++){
            if(i % 2 ==0){
                fruits.add(new Apple());
            }else{
                fruits.add(new Orange());
            }
        }
        for(int i = 0; i < 50; i++){
            apples.add(new Apple());
        }

        for(int i = 0; i < 50; i++){
            oranges.add(new Orange());
        }

        apples.transfer(fruits);
        oranges.transfer(fruits);
        System.out.println(Basket.compare(apples,oranges));
        System.out.println(fruits.getWeight());
    }
}