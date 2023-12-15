/*
Pengy Float
12/15/2023
Enemy subclass to track their position and location
 */
package pengyfloat;

import java.awt.Graphics2D;

public class Enemy extends AbstractEntity {

    private String characterType;//characteristic of an emeny what type of enemy 

    /**
     * first constructor for enemy
     * @param xPos x position
     * @param yPos  y position
     */
    public Enemy(int xPos, int yPos) {
        super(xPos, yPos);
    }

    /**
     * second constructor for enemy
     * @param xPos x position
     * @param yPos y position
     * @param cType character type
     */
    public Enemy(int xPos, int yPos, String cType) {
        this(xPos, yPos);
        this.characterType = cType;
    }

    /**
     * draw method to draw enemy character
     * @param g  graphics 2d
     */
    public void draw(Graphics2D g) {
        this.draw(g);
    }

    /**
     * accessor for character type
     * @return  character type
     */
    public String getType() {
        return characterType;
    }

    /**
     * mutator for character type
     * @param cType character type
     */
    public void setType(String cType) {
        this.characterType = cType;
    }

    /**
     * equals method to compare enemy characteristic
     * @param other other enemy
     * @return true or false
     */
    public boolean equals(Enemy other) {
        //Check if character type is equal
        if (characterType == other.getType()) {
            return true; //return true if equal
        } else {
            return false; // return false if not equal
        }
    }

    /**
     * enemy clone method to clone enemy
     * @return cloned enemy
     */
    public Enemy clone() {
        Enemy e2 = new Enemy(xPos, yPos); //instantiate new Enemy object with the same attributes 
        return e2; //return the clone object
    }

    /**
     * to string method with character type and x and y position
     * @return 
     */
    @Override
    public String toString() {
        return "Enemy{" + "characterType=" + characterType + '}' + "x position: " + xPos + " y position: " + yPos;
    }

}
