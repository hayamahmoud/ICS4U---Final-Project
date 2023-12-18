/*
 * H. Mahmoud, P. Shaw, M. Noorzad 
 * Player Subclass to AbstractEntity Class
 * Attributes: Enity attributes(x and y positions) and has a character name
 * December 15, 2023
 */

package pengyfloat;

import java.awt.Graphics2D;

/**
 *
 * @author hamah5330
 */
public class Player extends AbstractEntity {
    
    //Declare instance variables (attributes)
    String characterName; 
    
    /**
     * Main constructor, entity cannot exist with an x and y position
     * @param xPos - x position of the entity
     * @param yPos - y position of the entity
     */
    public Player(int xPos, int yPos) {
        super(xPos, yPos); //invoke super class main constructor 
    }
    
    /**
     * Secondary constructor that initiates the character name
     * @param xPos - x position of the entity as an integer
     * @param yPos - y position of the entity as an integer
     * @param cName - character name of the player as a String
     */
    public Player(int xPos, int yPos, String cName) {
        super(xPos, yPos); //Invoke main contructor from super class
        this.characterName = cName; 
    }
    
    /**
     * Method that draws the player
     * @param g 
     */
    public void draw(Graphics2D g) {
        super.draw(g);
    }
    
    /**
     * Accessor method that gets the name of the player
     * @return the name of the player as a String
     */
    public String getName() {
        return this.characterName; 
    }
    
    /**
     * Mutator method that sets the name of the player
     * @param n - the name of the player as a String
     */
    public void setName(String n) {
        this.characterName = n; 
    }
    
    /**
     * Equals method that compares two players to see if they have the same name (same player)
     * @param other - player that is being compared
     * @return true if same name and false if not the same
     */
    public boolean equals(Player other) {
        //Check if the Players have the same names
        if (this.characterName.equals(other.getName())) {
            return true; //return true if they have the same character names
        } else {
            return false; //return false if they DON"T have the same character names
        }
    }
    
    /**
     * Method that clones a Player object
     * @return the cloned Player object
     */
    public Player clone() {
        Player p2 = new Player(xPos,yPos,characterName); //Instantiate new player with same attributes as the current player (clone)
        return p2; //return the cloned Player 
    }

    /**
     * ToString method that returns the Player object as a String
     * @return Player object as a String
     */
    public String toString() {
        return "Player{" + "characterName=" + characterName + '}';
    }
   
    
    
}
