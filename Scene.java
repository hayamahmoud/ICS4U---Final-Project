/*
 * H. Mahmoud, P. Shaw, M. Noorzad 
 * Scene Class
 * Attributes: everything that is displayed on the scene (Water, IceBlock, Player, Enemy, score) and has a length and width
 * December 18, 2023
 */

package pengyfloat;

import java.awt.Graphics2D;

/**
 *
 * @author hamah5330
 */
public class Scene {
    //Declare instance variables (attributes)
    int length; 
    int width;
    int score; 
    Water w; 
    IceBlock ice []; 
    Player p; 
    Enemy e []; 
    
    /**
     * Main constructor, Scene cannot exist without a length and width
     * @param length - length of the screen as an integer
     * @param width - width of the screen as an integer
     */
    public Scene(int length, int width) {
        this.length = length; 
        this.width = width; 
    }
    
    /**
     * Secondary constructor that initializes all Scene attributes
     * @param length - length of the scene as an integer
     * @param width - width of the scene as an integer
     * @param score - users score as an integer
     * @param w - Water object
     * @param ice - Array of IceBlocks
     * @param p - Player object
     * @param e - Array of Enemies
     */
    public Scene(int length, int width, int score, Water w, IceBlock ice [], Player p, Enemy e []) {
        this(length, width); //involke main constructor
        this.score = score; 
        this.w = w; 
        this.ice = ice; 
        this.p = p;
        this.e = e; 
    }

    /**
     * Mutator method that sets the length of the scene
     * @param length - length of the scene
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Mutator method that sets the width of the scene
     * @param width - width of the scene
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Mutator method that sets the users score
     * @param score - users score as an integer
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Accessor method that gets the length of the scene
     * @return the length of the scene as an integer
     */
    public int getLength() {
        return length;
    }

    /**
     * Accessor method that gets the width of the scene
     * @return the width of the scene as an integer
     */
    public int getWidth() {
        return width;
    }

    /**
     * Accessor method that gets the users score 
     * @return the score as an integer
     */
    public int getScore() {
        return score;
    }
    
    /**
     * 
     * @param g 
     */
    public void drawScene(Graphics2D g) {
        
    }
    
    /**
     * 
     */
    public void update() {
        
    }
    
    /**
     * 
     * @param stillTime
     * @return 
     */
    public int increaseDifficulty(long stillTime) {
        return 0; 
    }
    
    /**
     * 
     * @param other
     * @return 
     */
    public boolean equals(Scene other) {
        if (length == other.getLength() && width == other.getLength()) {
            return true; 
        } else {
            return false; 
        }
    }
    
    /**
     * Method that clones the Scene Object
     * @return returns a Scene Object with the same values for the attributes
     */
    public Scene clone() {
        Scene s2 = new Scene(length,width,score,w,ice,p,e);
        return s2; 
    }

    /**
     * ToString method that returns the Scene object as a String
     * @return the Scene object as a String
     */
    public String toString() {
        return "Scene{" + "length=" + length + ", width=" + width + ", score=" + score + ", w=" + w + ", ice=" + ice + ", p=" + p + ", e=" + e + '}';
    }
    
    
    
    
    
}
