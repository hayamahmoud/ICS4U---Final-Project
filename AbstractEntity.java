/*
 * H. Mahmoud, P. Shaw, M. Noorzad 
 * Abstract Entity Class
 * December 15, 2023
 */
package pengyfloat;

import java.awt.Graphics2D;

/**
 *
 * @author hamah5330
 */
public class AbstractEntity {
    
    //Declare instance variables (attributes)
    protected int xPos; 
    protected int yPos; 
    
    /**
     * Main constructor that initializes x and y positions of an entity (entity cannot exist without an x and y position)
     * @param xPos - x position of the entity 
     * @param yPos - y position of the entity 
     */
    public AbstractEntity(int xPos, int yPos) {
        this.xPos = xPos; 
        this.yPos = yPos; 
    }
    
    /**
     * Mutator method that sets the x position of the entity
     * @param xLoc - x position of entity
     */
    public void setXPos(int xLoc) {
        this.xPos = xLoc; 
    }
    
    /**
     * Mutator method that sets the y position of the entity
     * @param yLoc - y position of entity
     */
    public void setYPos(int yLoc) {
        this.yPos = yLoc; 
    }

    /**
     * Accessor method that gets the x position of the entity
     * @return - the x position of the entity an integer
    */
    public int getxPos() {
        return xPos;
    }

    /**
     * Accessor method that gets the y position of the entity
     * @return - the y position of the entity an integer
     */
    public int getyPos() {
        return yPos;
    }
    
    /**
     * Method that instantiates Graphics2D and will be overwridden in subclasses
     * @param g - Graphics2D object
     */
    public void draw(Graphics2D g) {
        Graphics2D g2d = (Graphics2D) g; 
    }
    
    /**
     * Equals method to check if two entities have the same xPos and yPos
     * @param other - entity that is being compared 
     * @return true if positions are equal
     */
    public boolean equals(AbstractEntity other) {
        //Check if x and y positions are equal
        if (xPos == other.getxPos() && yPos == other.getyPos()) {
            return true; //return true if equal
        } else {
            return false; // return false if not equal
        }
    }
    
    /**
     * Clone method that creates an identical AbstractEntity object
     * @return AbstractEntity clone object
     */
    public AbstractEntity clone() {
        AbstractEntity a2 = new AbstractEntity(xPos,yPos); //instantiate new AbstractEntity object with the same attributes 
        return a2; //return the clone object
    }

    /**
     * ToString method to convert the AbstractEnitity object to a String
     * @return AbstractEntity object as a String
     */
    public String toString() {
        return "AbstractEntity{" + "xPos=" + xPos + ", yPos=" + yPos + '}';
    }
    
    
    
    
    
}
