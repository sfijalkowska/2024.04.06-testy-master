package pl.camp.it.testy;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Odpalił się konstruktor !!!");
    }

    @BeforeClass
    public static void przygotowanie() {
        System.out.println("Przygotowanie do testów");
    }

    @AfterClass
    public static void zakonczenie() {
        System.out.println("Koniec testów !!");
    }

    @Before
    public void przygotowaniePrzedKazdymTestem() {
        System.out.println("Przygotowanie do testu !!!");
    }

    @After
    public void sprzataniePoKazdymTescie() {
        System.out.println("Sprzatanie po teście !!!!");
    }

    @Test
    public void twoPositivesTest() {
        //????
        int a = 5;
        int b = 2;
        int expectedResult = 7;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
        //Assert.assertEquals(1, calculator.getOperations());
        //System.out.println("Przebieg: " + calculator.getOperations());
    }

    @Test(expected = IllegalArgumentException.class)
    public void outOfIntTest() {
        //???
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        calculator.add(a, b);
        //Assert.assertEquals(1, calculator.getOperations());
        //System.out.println("Przebieg: " + calculator.getOperations());
    }

    @Test
    public void diffTest() {
        //???
        int a = 5;
        int b = 3;
        int expectedResult = 2;

        int result = calculator.diff(a, b);

        Assert.assertEquals(expectedResult, result);
        //Assert.assertEquals(1, calculator.getOperations());
        //System.out.println("Przebieg: " + calculator.getOperations());
    }

    @Test
    public void multiplyTest() {
        int a = 3;
        int b = 5;
        int expectedResult = 15;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTwoPositiveTest() {
        int a = 6;
        int b = 2;
        double expectedResult = 3.0;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.000001);
    }

    @Test
    public void dividePointerResultTest() {
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZero() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }

    @Test
    public void divideTwoNegative() {
        int a = -4;
        int b = -2;

        double result = calculator.divide(a, b);

        if(result < 0) {
            Assert.fail();
        }
    }

    @Test
    public void divideNegativeAndPositive() {
        int a = -4;
        int b = 2;

        double result = calculator.divide(a, b);

        if(result > 0) {
            Assert.fail();
        }
    }

    @Test
    public void divideZero() {
        int a = 0;
        int b = 2;
        double expectedResult = 0.0;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.0001);
    }
}
