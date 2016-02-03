package car;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {

	public Panel() {
		JFrame frame = new JFrame("Car store");
		frame.setLocation(300, 100);
		frame.setMinimumSize(new Dimension(800, 600));

		frame.setVisible(true);

		frame.getContentPane().add(createPanel());
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		JLabel nameLabel = new JLabel("Customer Name");
		JTextField nameText = new JTextField(10);
		panel.add(nameLabel, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		panel.add(nameText, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));

		JLabel phoneLabel = new JLabel("Phone number");
		JTextField phoneText = new JTextField(10);
		panel.add(phoneLabel, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		panel.add(phoneText, new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));

		JLabel dateLabel = new JLabel("Date of purchase");
		JTextField dateText = new JTextField(10);
		panel.add(dateLabel, new GridBagConstraints(2,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		panel.add(dateText, new GridBagConstraints(2,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		
		JLabel brandLabel = new JLabel("Car Brand");
		JTextField brandText = new JTextField(10);
		panel.add(brandLabel, new GridBagConstraints(3,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		panel.add(brandText, new GridBagConstraints(3,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));

		JLabel modelLabel = new JLabel("Car Model");
		JTextField modelText = new JTextField(10);
		panel.add(modelLabel, new GridBagConstraints(4,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		panel.add(modelText, new GridBagConstraints(4,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		
		JLabel capLabel = new JLabel("Engine Capacity");
		JTextField capText = new JTextField(10);
		panel.add(capLabel, new GridBagConstraints(5,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		panel.add(capText, new GridBagConstraints(5,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		
		JLabel colourLabel = new JLabel("Colour");
        JComboBox<String> colour = new JComboBox<String>();

        panel.add(colourLabel, new GridBagConstraints(0,2,2,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
        panel.add(colour, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,80,0,0),0,1));
        
        JButton btnBuy = new JButton("Buy");
		panel.add(btnBuy, new GridBagConstraints(6,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
		
		btnBuy.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Cool");
				
			}
		});

		return panel;
	}

}
