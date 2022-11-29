
package com.mycompany.snake_game;

/**
 *
 * @author Saurabh Thakur
 */
import javax.swing.JFrame;

public class Game_Frame extends JFrame {

    Game_Frame() {

        this.add(new Game_Panel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}