package udp;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Presentation extends JFrame{
	public Presentation() {
		setVisible(true);
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JCheckBox alphaCheckBox = new JCheckBox("Alpha");
		JCheckBox betaCheckBox = new JCheckBox("Beta");
		JCheckBox gammaCheckBox = new JCheckBox("Gamma");
		JCheckBox deltaCheckBox = new JCheckBox("Delta");
		JCheckBox thetaCheckBox = new JCheckBox("Theta");
		
		alphaCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					
				} else {
					
				}
			}
		});
		
		
	}

}
