/**
 * is used for a player's set of cards. though card class represents a deck of cards.
 */

/**
 * @author maloneb97994
 *
 */
public class singleCard {
    private char suite;
    private int faceValue;
    private int numericValue;
    
	/**
	 * @param suite
	 * @param faceValue
	 */
	public singleCard(char suite, int faceValue) {
		super();
		this.suite = suite;
		this.faceValue = faceValue;
		
		//if the card is a face card, set its numerical value equal to 10
		if(faceValue > 10)
			this.numericValue = 10;
		else
			this.numericValue = faceValue;
	}

	/**
	 * @return the suite
	 */
	public char getSuite() {
		return suite;
	}

	/**
	 * @param suite the suite to set
	 */
	public void setSuite(char suite) {
		this.suite = suite;
	}

	/**
	 * @return the faceValue
	 */
	public int getFaceValue() {
		return faceValue;
	}

	/**
	 * @param faceValue the faceValue to set
	 */
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	/**
	 * @return the numericValue
	 */
	public int getNumericValue() {
		return numericValue;
	}

	/**
	 * @param numericValue the numericValue to set
	 */
	public void setNumericValue(int numericValue) {
		this.numericValue = numericValue;
	}
    
	
    
	
	
}
