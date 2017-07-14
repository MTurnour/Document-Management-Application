package planner.test;

import org.junit.Before;

import planner.PanelCutSheet;
import planner.PanelObject;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


public class PanelCutSheetTest {

	private PanelObject[] panels;
	
	
	/**
     * This method is run by JUnit before each test to initialise instance
     * variables of the panels for testing
     */
    @Before
    public void setUp() {
    	// panel objects
    	panels = new PanelObject[6];
    	panels[0] = new PanelObject(65, "Surfmist", 1000, 500);
    	panels[1] = new PanelObject(50, "NightSky", 1000, 1000);
    	panels[2] = new PanelObject(70, "Deep Ocean", 2000, 2000);
    	panels[3] = new PanelObject(65, "Classic Creame", 1000, 1000);
    	panels[4] = new PanelObject(50, "Rando", 1000, 1500); //test colour selection
    	panels[5] = new PanelObject(70, "Woodland Grey", 6100, 6001); //test max bounds
    	    	
    }
    @Test
    public void addRemovePanelTest(){
    	//create the test cut sheet
    	PanelCutSheet testCutSheet = new PanelCutSheet();
    	//add a panel object
    	testCutSheet.addPanel(panels[0]);
    	//asset that the list only contains one object
    	Assert.assertEquals(1, testCutSheet.getPanels().size());
    	//check quantity
    	System.out.println(testCutSheet.getQuantity(panels[0]));
    	//add a second panel of the same tyope and check quantity
    	testCutSheet.addPanel(panels[0]);
    	System.out.println(testCutSheet.getQuantity(panels[0]));
    	//remove the object from the list
    	testCutSheet.removePanel(panels[0]);
    	System.out.println(testCutSheet.getQuantity(panels[0]));
    	testCutSheet.removePanel(panels[0]);
    	//assert that the object ahs been removed
    	System.out.println(testCutSheet.getQuantity(panels[0]));
    	
    }
    //test that the appropriate exceptions are thrown?
    
    //test that the equals method 
    
}
