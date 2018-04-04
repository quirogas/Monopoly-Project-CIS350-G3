package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;


public class GameView extends JFrame {

	private JFrame frame;
	private GamePanel gamePanel;
	private SidePanel sidePanel;
	private BottomPanel bottomPanel;

	private GridBagConstraints c;
	private PlayerToken p;


	public GameView(){
		frame = new JFrame("Monopoly");
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setUndecorated(true);

		gamePanel = new GamePanel();
		sidePanel = new SidePanel();
		bottomPanel = new BottomPanel(gamePanel);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;

		c.anchor = c.NORTHWEST;

		frame.add(gamePanel, c);

		c.gridx = 1;
		c.gridy = 0;
		c.gridheight = 2;
		c.gridwidth = 1;
		c.weighty = 2;
		c.weightx = 1;
		frame.add(sidePanel, c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridheight = 1;
		c.gridwidth = 1;
		frame.add(bottomPanel, c);
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}