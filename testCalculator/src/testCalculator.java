import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alberto on 23/10/14.
 */
public class testCalculator {

    @Test
    public void sumShouldReturnFour(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(3, 1), 4);
    }

    @Test
    public void sumShouldReturnFive(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(3, 2), 5);
    }





}
