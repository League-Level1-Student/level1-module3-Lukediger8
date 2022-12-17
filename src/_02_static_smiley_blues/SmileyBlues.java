package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
		JFrame frank = new JFrame();
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		frank.setVisible(true);
		// 3. Make a new JPanel
		JPanel Paul = new JPanel();
		// 4. Add your panel to your frame
		frank.add(Paul);
		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!

		// 5. Make three Smiley objects and add them to your panel
		Smiley grim = new Smiley();
		Paul.add(grim);
		Smiley sad = new Smiley();
		Paul.add(sad);
		Smiley mad = new Smiley();
		Paul.add(mad);
		Smiley cool = new Smiley();
		Paul.add(cool);
		Smiley rage = new Smiley();
		Paul.add(rage);
		Smiley funny =  new Smiley();
		Paul.add(funny);
		// 6. Pack your frame

		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}
