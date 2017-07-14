package planner.test;

import planner.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Testing for the implementation of the Panel Object Class
 * 
 * @author Matthew
 *
 */

public class PanelObjectTest {

	
	
	/**
     * Test the construction of a typical panel object
     */
    @Test
    public void testTypicalPanelObject(){
    	//panel parameter
    	int testSlat = 65;
    	String testColour = "Surfmist";
    	int testHeight = 1000;
    	int testWidth = 1000;
    	
    	//the panel under test;
    	PanelObject testPanel = new PanelObject(testSlat, testColour, testHeight, testWidth);
    	
    	//check the slat of the panel
    	Assert.assertEquals(testSlat, testPanel.getSlatSize());
    	//check the colour of the panel
    	Assert.assertEquals(testColour, testPanel.getSlatColour());
    	//check height of the panel
    	Assert.assertEquals(testHeight, testPanel.getHeight());
    	//check the width of the panel
    	Assert.assertEquals(testWidth, testPanel.getWidth());
    }
	
	
}
