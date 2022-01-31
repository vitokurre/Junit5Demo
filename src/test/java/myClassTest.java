import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import sun.awt.AWTAccessor;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class myClassTest {

    myClass testObjekt;


    @BeforeEach
    public void beforeEach() {
        System.out.print("beforeEach: Detta händer INNAN varje test i denna klass");
        // testObjekt = new myClass();   kan istället skapa objekten här
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll: Detta händer innan alla test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach: Detta händer efter varje test i denna klass");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll: Detta är sista saken som körs innan test-runen avslutas");
    }


    @Test

    public void checkReturnStringLengthTest(TestInfo testInfo) {

        System.out.println("Starting testcace" +   testInfo.getDisplayName());

        testObjekt = new myClass();     //arrange fixa alla variabler för testet
        String myString = "Mars";
        int expected = 4;


        int actual = testObjekt.returnStringLenght(myString);  // Act, kallar på våra metoder.


        assertEquals(expected, actual);             // Assert. Jämnför resultat.
        System.out.println("Concluded testcase: " + testInfo.getDisplayName());

    }

    @Test

    public void checkReturnMathMaxTest(TestInfo testInfo) {
        System.out.println("Starting testcace" +   testInfo.getDisplayName());
        testObjekt = new myClass();
        int myIntMaxC = 11;
        int myIntMaxD = 15;

        int expected = 15;

        int actual = testObjekt.returnMathMax(myIntMaxC, myIntMaxD);

        assertEquals(expected, actual);
        System.out.println("Concluded testcase: " + testInfo.getDisplayName());
    }

    @Test

    public void checkReturnMathMinTest() {
        testObjekt = new myClass();
        int myIntMinE = 32;
        int myIntMinF = 5;

        int expected = 5;

        int actual = testObjekt.returnMathMin(myIntMinE, myIntMinF);

        assertEquals(expected, actual);
    }

    @Test

    public void checkIfReturnedTrue() {

        testObjekt = new myClass();
        String myString = "";


        boolean actual = testObjekt.checkIfStringIsEmpty(myString);

        assertTrue(actual);
    }

    @Test

    public void checkIfReturnedFalse() {

        testObjekt = new myClass();
        String myString = "ok";


        boolean actual = testObjekt.checkIfStringIsEmpty(myString);

        assertFalse(actual);
    }

    @Test

    public void checkIfStringReturnsTrue() {

        testObjekt = new myClass();
        String mystring = "";

        boolean actual = Boolean.parseBoolean(testObjekt.checkIfNameIsMarcus());


        //testObjekt.checkIfNameIsMarcus(mystring);

        assertFalse(actual);

    }

    @Test

    public void checkIfStringContainsTest() {
        testObjekt = new myClass();
        String myString = "Hello World";
        boolean expected = true;

        boolean actual = testObjekt.checkIfStringContaisn(myString);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource (ints = {-3, 5, 6, 10})
    public void checkNegativeValue(int intput){
        testObjekt = new myClass();

        int actual = testObjekt.negatvie(intput);

        assertFalse(testObjekt.negatvie(intput)>0);


    }


}