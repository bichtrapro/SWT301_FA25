import Example.Calcalator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calcalator cal = new Calcalator();
    @Test
    void testAdd(){
        assertEquals(5, cal.add(2,3), "Addition 2+3 =5 ");
    }
    @Test
    @DisplayName("TC1: Kiểm tra chia 2 số nguyên")
    void testDivide(){
        assertEquals(2,cal.divide(6,3),"Test Divide 6/3=2");
    }
    @Test
    @DisplayName("TC2: Kiểm tra chia kết quả float")
    void testDivide2(){
        assertEquals(3.5,cal.divide(7,2),"Test Divide 7/3=2");
    }
    @ParameterizedTest(name = "Test multiply TC {index} => {0} * {1} =>{2}")
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
void testMultiplyFromFile(int a, int b, int expected){
        assertEquals(expected, cal.multiply(a,b), "KQ " +a + "*"+ b + "= "+expected);

}
    @Test
    void testAdd2(){

    }
}
