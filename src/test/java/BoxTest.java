import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox(){
        Box<String,Integer,Float> box1 = new Box<>("String",2,3.5f);
        Box<String,Integer,Float> box2 = new Box<>("String",5,6.5f);
        float result = (box1.getB() + box1.getC() + box2.getB() + box2.getC());
        assertEquals(17,result,0.0001);
    }

}