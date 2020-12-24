
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AtelierJavaSwing {

	JFrame frame;
	JPanel panel;
	Font font1;
	Font font2;
	JLabel label1;
	JLabel label2;
	int index;
	

	public AtelierJavaSwing() {

		frame = new JFrame();
		panel = new JPanel();
		font1 = new Font("Verdana", Font.BOLD, 15);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 19);

		ArrayList<String> contenu = new ArrayList<String>();

		contenu.add("Les rats ne peuvent pas vomir, c'est pourquoi le poison à rat fonctionne");
		contenu.add("Les pommes sont plus efficaces que la caféine pour garder les gens éveillés le matin!");
		contenu.add("Si l'occasion se présente, les cerfs mâcheront de la gomme et de la marijuana.");
		contenu.add("Plus de 90% des victimes d'attaques de requins survivent.");
		contenu.add("Les femmes clignent des yeux près de deux fois plus que les hommes.");
		contenu.add("Comme les empreintes digitales, l'empreinte de la langue de chacun est différente!");
		
		
		label1 = new JLabel("Le saviez-vous?");
		label2 = new JLabel("être amoureux vous rend fainéant");

		label1.setBounds(20, 10, 100, 40);
		label2.setBounds(100, 200, 1000, 40);
		label2.setFont(font2);
		JButton button = new JButton("MONTRER UN AUTRE FAIT");
		button.setBounds(200, 400, 400, 40);
		button.setFont(font1);

		panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

		panel.setLayout(null);

		panel.add(label1);
		panel.add(label2);
		panel.add(button);

		
		
		
		

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = (int) Math.round((Math.random() * (contenu.size() - 1)));
				
				System.out.println(index);
				
				label2.setText(contenu.get(index));
				
				
				 Random loun = new Random();
			        
			        float r = loun.nextFloat();
			        float g = loun.nextFloat();
			        float b = loun.nextFloat();
			        Color randomColor = new Color(r, g, b);
			        panel.setBackground(randomColor);
			        button.setForeground(randomColor);

			}
		});
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Le saviez-vous");

		frame.setSize(700, 500);

		frame.setVisible(true);

	}

}
