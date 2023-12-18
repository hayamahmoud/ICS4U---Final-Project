/*
Pengy Float Game
December 18, 2023
Water class to determine location, length, height, etc
 */
package pengyfloat;

import java.awt.Graphics2D;

public class Water extends AbstractEntity {

    private int length;//private length of water
    private int height;//private height of water

    /**
     * First constructor for water class
     * @param xPos x position
     * @param yPos y position
     * @param length length of water
     * @param height  height of water
     */
    public Water(int xPos, int yPos, int length, int height) {
        super(xPos, yPos);
        this.length = length;
        this.height = height;
    }

    /**
     * invoke draw method from super class
     * @param g graphics 2d
     */
    public void draw(Graphics2D g) {
        super.draw(g);
    }

    /**
     * accesor for water length 
     * @return  length
     */
    public int getLength() {
        return length;
    }

    /**
     * mutator for water length
     * @param l length
     */
    public void setLength(int l) {
        this.length = l;
    }

    /**
     * acessor for water height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * mutator for water height 
     * @param h height
     */
    public void setHeight(int h) {
        this.height = h;
    }

    /**
     * equals method for water class
     * @param other water
     * @return other water
     */
    public boolean equals(Water other) {
        //Check if height and length are equal
        if ((this.height == other.height) && (this.length == other.length)) {
            return true; //return true if equal
        } else {
            return false; // return false if not equal
        }
    }

    /**
     * water clone method to clone water
     *
     * @return cloned water
     */
    public Water clone() {
        Water w2 = new Water(xPos, yPos, length, height); //instantiate new Water object with the same attributes 
        return w2; //return the clone object
    }

    /**
     * to string for water class with height, length, x and y positions
     * @return 
     */
    @Override
    public String toString() {
        return "Water{" + "length=" + length + ", height=" + height + "xPos: " + xPos + " yPos: " + yPos;
    }
    
    

}
