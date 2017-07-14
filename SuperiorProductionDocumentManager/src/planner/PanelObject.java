package planner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class PanelObject {
	
	// Correct line separator for executing machine (used in toString method)
    private final static String LINE_SEPARATOR = System.getProperty(
            "line.separator");

		//The slat size used
		private int slatSize;
		//The border colour
		private String borderColour;
		//The slat Colour;
		private String slatColour;
		//The panel Height
		private Integer panelHeight;
		//The panel Width
		private int panelWidth;
		// number of slats
		private int numSlats;
		// slat spacing
		private int slatSpace;
		
		public PanelObject(int slatSize, String colour, int height, int width){
			
			this.slatSize = slatSize;
			this.slatColour = colour;
			this.borderColour = colour;
			this.slatSpace = 15; //15mm default
			this.panelHeight = height;
			this.panelWidth = width;
			
		}
		
		public int getSlatSize(){
			return this.slatSize;
		}
		
		public String getBorderColour(){
			return this.borderColour;
		}
		
		public String getSlatColour(){
			return this.slatColour;
		}
		
		
		public int getHeight(){
			return this.panelHeight;
		}
		
		public int getWidth(){
			return this.panelWidth;
		}
		
		public int getNumSlats(){
			return this.numSlats;
		}
		
		public int getSlatSpace(){
			return this.slatSpace;
		}
		
		
		private void changeColour(String colour){
			this.borderColour = colour;
			this.slatColour = colour;
		}
		
		private void changeColour(String borderColour, String slatColour){
			this.borderColour = borderColour;
			this.slatColour = slatColour;		
		
		}
		
		//write a to string method to return the panels in the desired format
		@Override
	    public String toString() {
			String result = ""; // the string representation
	        result +="Panel:  " + slatSize + " slat: " + slatColour + ", "
			+ slatSpace + "mm Spacing " + "@ " + panelHeight + "x" + panelWidth
			+ "mm" + LINE_SEPARATOR;
	            //System.out.println("hey " + intthing);
	        return result;
	    }
		
		// to compare panels and thuis sort them in a list easier
		//public boolean equals(Object object){
			//if(!(object instanceof PanelObject)){
			//return false;
			//}
			//PanelObject p = (PanelObject) object;
			//if this.colour.equals(p.getColour)
			//if this.numSlat.equals(p.getNumSlats
			//if this.height.equals(p.getHeight)
			//if this.width.equals(p.getWidth)
			//if this.spacing.equals(p.getSpacing)
			//return true else false
		//}
		// to generate the relevant hashcodes for better sorting
		//public int hashCode(){
		//	return 0;
		//}
}
