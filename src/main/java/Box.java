import java.util.List;

public class Box <T extends Number & Comparable<T>>{

    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg(){
        double result = 0;
        for(T element : array){
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

    public static void method(List<? extends Number> numbers){

    }

    public static <Y> Y getFirstElement(List<Y> list){
        return list.get(0);
    }

    public static <U> void transfer(List<? extends U> src, List<? super U> dst){
        dst.addAll(src);
        src.clear();
    }

//  ? означает, что может прилететь коробка параметризованная любым типом
    public int compare(Box<?> another){
        if(avg() > another.avg()){
            return 1;
        }else if(avg() == another.avg()){
            return 0;
        }else{
            return -1;
        }
    }
}
