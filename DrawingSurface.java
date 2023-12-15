/*
 *  ICS4U Final Project - Pengy Float
 *  Maddy N. Pragya S. Haya M.
 *   Dec 2023
 *  A class which allows drawing, because it extends JPanel, by way of the Graphics2D class
 */
package pengyfloat;
// IMPORTS:

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawingSurface extends JPanel implements MouseListener, Runnable {

    private Image mainMenu; //Main Menu image
    private Image startGameBtn; //Button to start game
    private Image instructionsBtn; //Button to display Instructions

    private Thread animator;

    private final int DELAY = 25;
    public int x, y;

    public int gameState = 0; //Defaultly set to 0 so the main menu is shown when program starts
//^^ DIFFERENT STATES THE GAME CAN BE IN: ^^
    //  0 = Main menu
    //  1 = Instructions
    //  2 = Game credits
    //  3 = In game
    //  4 = End screen

    public DrawingSurface() {
        //attach the mouse listener to the panel and give it "focus"
        this.addMouseListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }

    /**
     * Does the actual drawing of scenes
     *
     * @param g - the Graphics object to draw with
     */
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        mainMenu = new ImageIcon("mainMenu.png").getImage();
        startGameBtn = new ImageIcon("startGameBtn.png").getImage();

        //What state is the game currently in? 
        if (gameState == 0) { //In menu:
            //Add the background
            g2d.drawImage(mainMenu, 0, 0, null);
            //Add the buttons that are displayed in the main menu:
            g2d.drawImage(startGameBtn, 100, 264, null); // < Start game button
            
        } else if (gameState == 1) { //Instructions:

        } else if (gameState == 2) { //Game Credits:

        } else if (gameState == 3) { //In game:

        } else if (gameState == 4) { //End Screen:

        }

    }

    /**
     * Overrides paintComponent in JPanel class so that we can do our own custom
     * painting
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        doDrawing(g); //invoke our custom drawing method
    }

    //this method is called after the JPanel is added to the JFrame
    //we can perform start up tasks here
    @Override
    public void addNotify() {
        super.addNotify();
        animator = new Thread(this);
        animator.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//While the user is on the main menu,
        while (gameState == 0) { //and they clicked the button to start game:
            if (e.getX() >= startGameBtn.) {
//Game state becomes 3 (In game)
                gameState = 3;
            } else if () { //Or, if the user clicked the instructions button:
//Game state becomes 2 (Instructions)
                gameState = 2;

            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    //This method will animate the human sprite, updating the frame for all the movement
    public void run() {

        long beforeTime, timeDiff, sleep;
        //get the current time
        beforeTime = System.currentTimeMillis();

        while (true) { //this loop runs once ever 25 ms (the DELAY)

            //redraws the screen (calling the paint component method)
            repaint();

            //calculate how much time has passed since the last call
            //this allows smooth updates and our human will move at a constant speed (as opposed to being dependent on processor availability)
            timeDiff = System.currentTimeMillis() - beforeTime;

            //calculate how much time to wait before the next call
            sleep = DELAY - timeDiff;

            //always wait at least 2 ms
            if (sleep < 0) {
                sleep = 2;
            }

            //try to actually wait
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                //threads can be interrupted from other threads
                JOptionPane.showMessageDialog(this, "Thread interrupted: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            //get the new current time
            beforeTime = System.currentTimeMillis();
        }
    }

}
