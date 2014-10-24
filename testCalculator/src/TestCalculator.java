import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alberto on 23/10/14.
 */
public class TestCalculator {

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

    @Test
    public void subtructShouldReturnOne(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtruct(3, 2), 1);
    }

    @Test
    public void subtructShouldReturnThree(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtruct(5, 2), 3);
    }

    @Test
    public void divideShouldReturnFour(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(8, 2));
    }

}
