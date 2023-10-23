import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reverseInPlacetest(){
    int[] input1 = {1, 2, 3};

    int[] reversed = {3, 2, 1};

    ArrayExamples.reverseInPlace(input1);
    
    assertArrayEquals(reversed, input1);
  }

  @Test
  public void reversedTest(){
    int[] input1 = {1, 2, 3};

    int[] reversed = {3, 2, 1};

    assertArrayEquals(reversed, ArrayExamples.reversed(input1));
  }
}
