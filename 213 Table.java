/**
 * Dealer
 * 	Player array list
 * 
 */

/**
 * @author maloneb97994
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Table {
	String dealerName;
	List<player> players;
	
	public Table () {		
		this.dealerName = dealerName;
		this.players = new ArrayList<>();
	}

	/**
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}

	/**
	 * @param dealerName the dealerName to set
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	
	/**
     * @return the players
     */
    public List<player> getPlayers() {
        return players;
    }
    
    /**
     * Add a player to the table
     * @param player the player to add
     */
    public void addPlayer(player player) {
        this.players.add(player);
    }
	@Override
	public String toString() {
		return "Table [dealerName=" + dealerName + ", players=" + players + "]";
    }
	
	
	//Dealer Functions
	
}
