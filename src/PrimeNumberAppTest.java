import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberAppTest {

	@BeforeEach
	void setUp() throws Exception {
	}


	@Test
	public void test1() {
		int expected = 2;
		int actual = PrimeNumberApp.findPrime(1);
		
		assertEquals(expected, actual);
	}
	
	public void test2() {
		int expected = 3;
		int actual = PrimeNumberApp.findPrime(2);
		
		assertEquals(expected, actual);
	}
	
	public void test10() {
		int expected = 29;
		int actual = PrimeNumberApp.findPrime(10);
		
		assertEquals(expected, actual);
	}

	
}
