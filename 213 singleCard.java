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
    private int numbericValue;
    
	/**
	 * @param suite
	 * @param faceValue
	 */
	public singleCard(char suite, int faceValue) {
		super();
		this.suite = suite;
		this.faceValue = faceValue;
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
	 * @return the numbericValue
	 */
	public int getNumbericValue() {
		return numbericValue;
	}

	/**
	 * @param numbericValue the numbericValue to set
	 */
	public void setNumbericValue(int numbericValue) {
		this.numbericValue = numbericValue;
	}
    
	
    
	
	
}
