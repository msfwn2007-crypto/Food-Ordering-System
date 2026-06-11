/**
 * 
 */
package gui;

import javax.swing.SwingUtilities;

/**
 * 
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(() -> {
            new RegistrationFrame();
        });

    }
}


