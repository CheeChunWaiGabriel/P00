import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 22022050
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Thursday 18-05-2023 20:06
 */

/**
 * @author 22022050
 *
 */
class HelloWorldTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
        System.out.println("This is the testcase for HelloWorld");
        String str1="This is the testcase for HelloWorld";
        String str2="This is the testcase for HelloWorld";
        assertEquals(str1, str2);

	}

}
