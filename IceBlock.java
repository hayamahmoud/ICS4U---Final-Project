/*
 * H. Mahmoud, P. Shaw, M. Noorzad 
 * IceBlock Subclass to AbstractEntity Class
 * Attributes: Enity attributes(x and y positions) and has a width and length
 * December 18, 2023
 */

package pengyfloat;

import java.awt.Graphics2D;

/**
 *
 * @author hamah5330
 */
public class IceBlock extends AbstractEntity{
    //Declare instance variables (attributes)
    int width; 
    int length; 
    
    /**
     * Main constructor, an IceBlock cannot exist without an x and y position and a length and width
     * @param xPos - x position of the entity
     * @param yPos - y position of the entity
     * @param l - the length of the IceBlock
     * @param w - the width of the IceBlock
     */
    public IceBlock(int xPos, int yPos, int l, int w) {
        super(xPos,yPos); //call main constructor in super class
        this.width = w;
        this.length = l; 
    }
    
    /**
     * Mutator method that sets the length of the IceBlock
     * @param l - the length of the IceBlock as an integer
     */
    public void setLength(int l) {
        this.length = l; 
    }
    
    /**
     * Accessor method that gets the length of the IceBlock
     * @return the length of the IceBlock as an integer
     */
    public int getLength() {
        return length;
    }

    /**
     * Accessor method that gets the width of the IceBlock
     * @return the width of the IceBlock as an integer
     */
    public int getWidth() {
        return width;
    }

    /**
     * Mutator method that sets the width of the IceBlock
     * @param width - the width of the IceBlock as an Integer
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * 
     * @param g 
     */
    public void draw(Graphics2D g) {
        super.draw(g); 
    }
    
    /**
     * Method that compares the x and y positions and length and widths of IceBlocks to see if they are the same object
     * @param other - the IceBlock that is being compared
     * @return true if same attributes and false if different
     */
    public boolean equals(IceBlock other) {
        if (xPos == other.getxPos() && yPos == other.getyPos() && length == other.getLength() && width == other.getWidth()) {
            return true; 
        } else {
            return false; 
        }
    }
    
    /**
     * Method that clones an IceBlock object with the same attributes
     * @return the IceBlock clone
     */
    public IceBlock clone() {
        IceBlock b2 = new IceBlock(xPos, yPos, length, width); //instantiate a new IceBlock class with the same attributes
        return b2; //return clone 
    }
 
    /**
     * ToString method that returns the IceBlock object as a String
     * @return the IceBlock object as a String
     */
    public String toString() {
        return "IceBlock{" + "width=" + width + ", length=" + length + '}';
    }
    
    

    
    
}
