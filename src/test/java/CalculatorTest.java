import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    @BeforeClass
    public static void classInit() {
        System.out.println("Before all tests");
    }

    @Before
    public void init() {
        System.out.println("Before each method");
    }

    @Test
    public void sum() {
        int result = Calculator.sum(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void sub() {
        int result = Calculator.sub(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void mul() {
        int result = Calculator.mul(4, 5);
        assertEquals(20, result);
    }

    @Test
    public void mulWithZero() {
        int result = Calculator.mul(0, 5);
        assertEquals(0, result);
    }

    @Test(timeout = 1000L)
    public void div() throws InterruptedException {
        double result = Calculator.div(21.0, 3.0);
        assertEquals(7.0, result, 0.0);
        Thread.sleep(500);
    }

    @Test(expected = ArithmeticException.class)
    @Ignore
    public void divForZero() {
        Calculator.div(3.0, 0.0);
    }

    @After
    public void afterEach() {
        System.out.println("After each method");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After all tests");
    }
}