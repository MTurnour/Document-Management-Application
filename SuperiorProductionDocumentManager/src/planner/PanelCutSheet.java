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
	
	public PanelCutSheet(){
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
		if(panelCutSheetMap.get(item) == null){
			return 0;
		}
		else{
			int copy = new Integer(panelCutSheetMap.get(item));
			return copy;
		}
		
	}
	
	//make new panel object for the sheet
	//mutator method
	public void addPanel(int slatSize, int height, int width, String colour){
		PanelObject panelObject = new PanelObject(slatSize, colour, height, width);
		if(this.panelCutSheetMap.containsKey(panelObject)){
			int currentNum = this.panelCutSheetMap.get(panelObject);
			currentNum += 1;
			this.panelCutSheetMap.put(panelObject, currentNum);
			System.out.println("Panel number incremeneted");
		}
		else{
			this.panelCutSheetMap.put(panelObject, 1);
			System.out.println("New Panel Added");
		}
		
	}
	
	//alternate add version (add by adding panel object)
	public void addPanel(PanelObject panel){
		if(this.panelCutSheetMap.containsKey(panel)){
			int currentNum = this.panelCutSheetMap.get(panel);
			currentNum += 1;
			this.panelCutSheetMap.put(panel, currentNum);
			System.out.println("Panel number incremeneted");
		}
		else{
			this.panelCutSheetMap.put(panel, 1);
			System.out.println("New Panel Added");
		}
	}
	//remvoe the panel object if the dictionary contains the object otherwise return a 
	//message stating the action was attempted but had no effect
	public void removePanel(PanelObject panel){
		if(this.panelCutSheetMap.containsKey(panel)){
			//if more than 1 panel qty, reduce by 1
			if(this.panelCutSheetMap.get(panel) > 1){
				int currentNum = this.panelCutSheetMap.get(panel);
				currentNum -= 1;
				this.panelCutSheetMap.put(panel, currentNum);
				System.out.println("Panel Qty Decremented");
			}
			//if only one panel qty, remove panel
			else if(this.panelCutSheetMap.get(panel) == 1){
				this.panelCutSheetMap.remove(panel);
				System.out.println("The panel has been removed");
			}
			//if 0 panel qty, throw console message
		}else{
			System.out.println("No such panel within the cut sheet to remove");
		}
	}
	
		
	
	//Add in a sorting method to return the list as a correct treemap? possibly just an equals method will do this
	
	//write a too string method to return the panel list
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
