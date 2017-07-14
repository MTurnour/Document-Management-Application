package planner;


import java.util.TreeMap;

/**
 * <p>
 * An immutable class representing a pairing of slat numbers to panel heights
 * </p>
 * 
 * <p>
 * The generator requires a slat width, spacing and Lead In Lead Out (LILO).
 * The slat number cannot be smaller than 3 in the dictionary.
 * </p>
 */

public class PanelDictionaryGenerator {

	//private Map of the slats to heights
	private TreeMap<Integer, Integer> panelHeights;
	//the slat width
	private Integer slatWidth;
	//the spacing
	private Integer spacing;
	//The lilo
	private Integer lilo;
	
	
	/**
	 * <p>
	 * Creates a new instance of the class with the desired array attributes
	 * </p>
	 * 
	 * <p>
	 * This method requires a slat width, spacing and LILO all in mm
	 * </p>
	 */
	public PanelDictionaryGenerator(Integer slatWidth, Integer spacing, Integer lilo){
		this.slatWidth = slatWidth;
		this.spacing = spacing;
		this.lilo = lilo;
		
		this.panelHeights = generatePanelHeights();
	}
	
	private TreeMap<Integer, Integer> generatePanelHeights(){
		TreeMap<Integer, Integer> slatMap = new TreeMap<Integer, Integer>();
		for(int i = 3; i < 99; i++){
			int height = (i*this.slatWidth) + ((i - 1)*this.spacing + (2*this.lilo));
			slatMap.put(i, height);
		}
		return slatMap;
	}
	//return the map allowing us to use values for cut sheet
	public TreeMap<Integer, Integer> displayPanelHeights(){
		TreeMap<Integer, Integer> copy = new TreeMap<Integer, Integer>(this.panelHeights);
		return copy;
	}
	
	//allows referencing the spacing for gui future display
	public Integer getSpacing(){
		int copy = new Integer(this.spacing);
		return copy;
	}
	//allows referencing the slat selection for future gui display
	public Integer slatWidth(){
		int copy = new Integer(this.slatWidth);
		return copy;
	}
	//allows referencing the lilo for future gui display
	public Integer lilo(){
		int copy = new Integer(this.lilo);
		return copy;
	}
	
}
