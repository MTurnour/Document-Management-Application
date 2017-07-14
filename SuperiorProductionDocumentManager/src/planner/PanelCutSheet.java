package planner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * A mutable class for recording all the cutSheetObjects in a job
 * </p>
 * 
 * <p>
 * The cut sheet objects are arranged from largest to smallest WIDTH, in order to
 * encourage offcuts to be used for smaller panels
 * 
 * The cut sheet objects will allow grouping based on colour and style as well
 * </p>
 */
public class PanelCutSheet {

	/*
	 * A map that maps the cut sheet object to its quantity (number of panels to produce) 
	 */
	private HashMap<PanelObject, Integer> panelCutSheetMap;
	
	
	/*
	 * Invariant here?
	 */
	
	/**
	 *<p>
     * Creates a new instance of the class in which the map is empty
     * Reads in the relevant cut sheet map (add argument to allow selection of correct file or all files)
     * </p>
     * 
     * <p>
     * That is, all cutSheetObjects must created and then mapped in.
     * </p>
	 * @throws IOException 
	 */
	
	public PanelCutSheet() throws IOException{
		panelCutSheetMap = new HashMap<>();
		
	}
	
	//Maybe add in an alternate constructor which can take in a prior jobsheet for editing
		
	/**
	 * Returns a list of panels in (descending width order (not quite done))
	 * @return
	 */
	public Set<PanelObject> getPanels(){
		return new HashSet<>(this.panelCutSheetMap.keySet());
	}
	
	//add in a function that returns standard item lists for jobs
	
	public int getQuantity(PanelObject item){
		int copy = new Integer(panelCutSheetMap.get(item));
		return copy;
	}
	
	//make new panel object for the sheet
	//mutator method
	public void addPanel(int slatSize, int height, int width, String colour){
		PanelObject panelObject = new PanelObject(slatSize, colour, height, width);
		if(this.panelCutSheetMap.containsKey(panelObject)){
			int currentNum = this.panelCutSheetMap.get(panelObject);
			currentNum += 1;
			this.panelCutSheetMap.put(panelObject, currentNum);
		}
		else{
			this.panelCutSheetMap.put(panelObject, 1);
		}
		
	}
	
	public PanelObject addTestPanel() throws IOException{
		PanelObject panelObject = new PanelObject(65, "Surfmist", 1000, 1000); 
		return panelObject;
	}
	
	
	
	
	
	//Add in an equals method so we can sort correctly in descending order by width
	// sorting pattern is greatest width and then greatest height 
	
	//@Override
    //public String toString() {
	//	int intthing = 0;
    //    String result = ""; // the string representation
     //   for (Integer slatNum : slatDictionary.keySet() ) {
     //   	intthing +=1 ;
     //       result += slatNum + ": " + slatDictionary.get(slatNum) + LINE_SEPARATOR;
      //      //System.out.println("hey " + intthing);
      //  }
      //  return result;
  //  }
}
