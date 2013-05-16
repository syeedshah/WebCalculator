package webcalculator.web;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith (Suite.class)
@Suite.SuiteClasses(value={
		CalculatorControllerTest.class,
		HomeControllerTest.class
		//PersonTest.class,
		//MyLibraryTest.class,
		//BookTest.class
		
})

public class AllTests {
	

}
