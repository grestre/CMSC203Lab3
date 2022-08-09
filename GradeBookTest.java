import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook gradebook1; 
	GradeBook gradebook2; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	//Step 3
	@BeforeEach
	void setUp() throws Exception {
		gradebook1 = new GradeBook (5);
		gradebook2 = new GradeBook (5);
		gradebook1.addScore(80.0);
		gradebook1.addScore(92.0);
		gradebook1.addScore(83.0);
		
		gradebook2.addScore(73.0);
		gradebook2.addScore(84.0); 
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null; 
		gradebook2 = null; 
	}

	//Step 4 Test methods
	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		assertTrue((gradebook1.toString()).equals("80.0 92.0 83.0 "));
		assertTrue((gradebook2.toString()).equals("73.0 84.0 "));
	}

	@Test
	void testSum() {
	
		assertEquals(255, gradebook1.sum(), 0.1); 
		assertEquals(157, gradebook2.sum(), 0.1); 
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		assertEquals(80,gradebook1.minimum(), 0.1); 
		assertEquals(73,gradebook2.minimum(), 0.1); 
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		assertEquals(175, gradebook1.finalScore(),0.1); 
		assertEquals(84, gradebook2.finalScore(),0.1); 
	}
}
