package calculator;

import calculator.business.Translator;
import calculator.business.TranslatorImpl;
import calculator.entities.Language;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    facade Facade = new facade();

    Translator translator;
    Language from;
    Language to;

    @BeforeMethod
    public void setUp() throws Exception {
        translator = new TranslatorImpl();
        from = new Language("EN", "English");
        to = new Language("ES", "Spanish");
    }

    @Test(invocationCount = 100, threadPoolSize = 5)
    public void testTranslateDummy() throws Exception {
        String response = translator.translate(from, to, "Hello World");
        Assert.assertEquals(response, "Hola Mundo");
    }

    //Suma general
    @Test(invocationCount = 100, threadPoolSize = 5)
    public void testSuma1() throws Exception {
        double response = Facade.doSuma(1,2);
        double expected = 3.0;
        Assert.assertEquals(response,expected);

    }

    //Suma con el maximo double
    @Test(invocationCount = 100, threadPoolSize = 5)
    public void testSuma2() throws Exception {
        double response = Facade.doSuma(1,2);
        double expected = Byte.MAX_VALUE + 1;
        Assert.assertEquals(response,expected);

    }

    //Suma con el minimo double
    @Test(invocationCount = 100, threadPoolSize = 5)
    public void testSuma3() throws Exception {
        double response = Facade.doSuma(1,2);
        double expected = Byte.MIN_VALUE - 1;
        Assert.assertEquals(response,expected);

    }

}
