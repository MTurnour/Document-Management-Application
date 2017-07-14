package planner.test;

import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import planner.PanelDictionaryGenerator;

/**
 * Basic tests for the {@link Traffic} implementation class.
 * 
 * A more extensive test suite will be performed for assessment of your code,
 * but this should get you started writing your own unit tests.
 */

public class PanelDictionaryGeneratorTest {
	
	//range of values for the slats
	private int[] slatSizes;
	//range of values for the spacings
	private int[] spacings;
	//range of values for the lilos
	private int[] lilos;
	
	//set up the expected inputs for the dictionary creation
	 @Before
	 public void setUp() {
		 //the different slats to be used
		 slatSizes = new int[3];
		 slatSizes[0] = 50;
		 slatSizes[1] = 65;
		 slatSizes[2] = 70;
		 
		 //the spacings being used to test (3 standard 2 abnormal)
		 spacings = new int[5];
		 spacings[0] = 10;
		 spacings[1] = 15;
		 spacings[2] = 20;
		 spacings[3] = 22;
		 spacings[4] = 27;
		 
		 //the lilos being used to test (2 standard 1 abnormal)
		 lilos = new int[3];
		 lilos[0] = 5;
		 lilos[1] = 10;
		 lilos[2] = 12;		 
	 }
	 
	 @Test
	 public void testKnownGeneration(){
		 //Test the generation of a deictionary using generic panel values
		 PanelDictionaryGenerator testDictionary = new PanelDictionaryGenerator(
				 slatSizes[1], spacings[2], lilos[1]);
		 //this should create an aray for a 65x16 slat, 20mm space, 10lilo panel
		 TreeMap<Integer, Integer> testTreeMap = testDictionary.displayPanelHeights();
		 System.out.println("testTreeMap 10 slats");
		 System.out.println(testTreeMap.get(10));
	 }
}
