package planner.test;

import org.junit.Before;
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
}
