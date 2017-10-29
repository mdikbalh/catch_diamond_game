import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JPanel implements ActionListener{
	
	static JFrame f;
	static JButton NewButton;
	public static Timer t;
	public static int count = 0;
	public static JLabel Time;
	public static void main(String[] args) {
		
		f = new JFrame("Find Diamonds");
	    f.setVisible(true);
	    f.setSize(1160, 700);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Gameplay gameplay = new Gameplay();
	    f.getContentPane().add(gameplay);
	    gameplay.setLayout(null);
	    
	    
	    NewButton = new JButton("Start");
	    NewButton.setBounds(472, 456, 89, 23);
	    NewButton.setForeground(Color.WHITE);
	    NewButton.setBackground(Color.DARK_GRAY);
	    NewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	    gameplay.add(NewButton);
	    NewButton.addActionListener(new Main());
	     
	}
	public void actionPerformed(ActionEvent e) {
		
		JButton Exit;
		Gameplay1 gameplay1=new Gameplay1();
	    f.getContentPane().add(gameplay1);
	    f.setVisible(true);
	    NewButton.setVisible(false);
	 
		t = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count++;
				Time.setText(count+ "");
				if(count==60){
					
					Main.f.setVisible(false);
				}
			}
	    });
	    t.start();
	    
	    gameplay1.setLayout(null);
	    Exit = new JButton("Exit");
	    Exit.setForeground(new Color(255, 0, 0));
	    Exit.setBackground(new Color(176, 224, 230));
	    Exit.setBounds(21, 11, 65, 23);
	    gameplay1.add(Exit);
	    Exit.addActionListener(new Gameplay());
	    
	    Time = new JLabel("");
	    Time.setBounds(1095, 11, 30, 20);
	    Time.setForeground(new Color(255,255,255));
	    Time.setBackground(Color.DARK_GRAY);
	    Time.setFont(new Font("Arial",Font.BOLD,14));
	    Time.setOpaque(true);
	    gameplay1.add(Time);
	    
	}
}


class Gameplay extends JPanel implements ActionListener{
	
	static ImageIcon image;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		image = new ImageIcon("img/Background.jpg");
		image.paintIcon(this, g, 0, 0);
	}
		
	public void actionPerformed(ActionEvent e) {
		
		Main.f.setVisible(false);
		
	}

}

class Gameplay1 extends JPanel implements ActionListener,KeyListener{
	
	private ImageIcon image;
	public Timer t= new Timer(5,this);
	static int x=71,y=256,x1=0,y1=0;
	public static JLabel lable;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		image = new ImageIcon("img/upperpart.jpg");
		image.paintIcon(this, g, 0, -29);
		
		image=new ImageIcon("img/layersoil.jpg");
		image.paintIcon(this, g, 60, 246);
		
		image=new ImageIcon("img/diamond.png");
		image.paintIcon(this, g, 1015 , 528);
		
		image=new ImageIcon("img/clock.png");
		image.paintIcon(this, g, 1050 , 5);
		
		if(x>=965 && x<=1026 && y>=480 && y<=528){
			
			image=new ImageIcon("img/transparent.png");
			image.paintIcon(this, g, 0 , 0);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Lato",Font.BOLD,50));
			g.drawString("C O N G R A T S!", 380, 340);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Lato",Font.PLAIN,30));
			g.drawString("click SPACE to restart", 420, 380);
			x1 = 0;
			y1 = 0;
			Main.t.stop();
			Main.count=0;
			
		}
		
		if(x>=496 && x<=613 && y>=343 && y<=454){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 550, 400);
			
			if(x>=502 && x<=605 && y>= 351 && y<=449){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;	
			}
		}
		
		if(x>=646 && x<=763 && y>=256 && y<=310){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 700, 256);
			
			if(x>=652 && x<=755 && y>= 256 && y<=305){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;	
			}
			
		}

		if(x>=71 && x<=131 && y>=294 && y<=407){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 68, 350);
			
			if(x>=71 && x<=123 && y>= 302 && y<=401){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}

		if(x>=968 && x<=1026 && y>=343 && y<=457){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 1024, 400);
			
			if(x>=974 && x<=1026 && y>= 351 && y<=450){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}	
	
		if(x>=443 && x<=563 && y>=470 && y<=528){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 500, 527);
			
			if(x>=450 && x<=555 && y>= 478 && y<=528){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}
		
		if(x>=243 && x<=364 && y>=392 && y<=503){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 300, 447);
			
			if(x>=250 && x<=356 && y>= 398 && y<=497){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}

		if(x>=362 && x<=488 & y>=263 && y<=376){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 420, 320);
			
			if(x>=369 && x<=475 && y>= 271 && y<=370){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}
		
		if(x>=643 && x<=766 & y>=363 && y<=476){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 700, 420);
			
			if(x>=650 && x<=757 && y>= 371 && y<=469){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}

		if(x>=196 && x<=313 & y>=256 && y<=310){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 250, 256);
			
			if(x>=202 && x<=305 && y>= 256 && y<=305){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}

		if(x>=46 && x<=163 & y>=453 && y<=564){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 100, 510);
			
			if(x>=52 && x<=155 && y>= 461 && y<=559){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}

		if(x>=846 && x<=963 & y>=253 && y<=364){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 900, 310);
			
			if(x>=852 && x<=955 && y>= 261 && y<=359){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}
		
		if(x>=796 && x<=913 & y>=443 && y<=528){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 850, 500);
			
			if(x>=802 && x<=905 && y>= 451 && y<=528){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				x1 = 0;
				y1 = 0;
				Main.t.stop();
				Main.count=0;
			}
			
		}
		
		if(x>=845 && x<=966 && y>=342 && y<=455){
			
			image=new ImageIcon("img/bomb.png");
			image.paintIcon(this, g, 902, 400);
			if(x>=855 && x<=955 && y>=350 && y<=450){
				
				image=new ImageIcon("img/transparent.png");
				image.paintIcon(this, g, 0 , 0);
				x1 = 0;
				y1 = 0;
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.BOLD,65));
				g.drawString("G a m e o v e r", 360, 340);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Lato",Font.PLAIN,30));
				g.drawString("click SPACE to restart", 420, 380);
				Main.t.stop();
				Main.count=0;
			}
		}
		
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 50, 50);
		
	}
	
	
	public Gameplay1(){
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(x < 71){
			
			x1 = 0;
			x = 71;
		}
		
		if(x > 1026){
			
			x1 = 0;
			x = 1026;
		}
		
		if(y < 256){
			
			y1 = 0;
			y = 256;
		}
		
		if(y > 528){
			
			y1 = 0;
			y = 528;
		}
		
		x = x + x1;
		y = y + y1;
		repaint();
		
	}

	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			
			x=71;
			y=256;
			Main.count=0;
			Main.t.start();
			Main.f.setTitle("Find Diamond");
			repaint();
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
			
			x1 = 0;
			y1 = -1;
			Main.t.start();
			Main.f.setTitle("click Esc to pause");
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
			
			x1 = 0;
			y1 = 1;
			Main.t.start();
			Main.f.setTitle("click Esc to pause");
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){
			
			x1 = -1;
			y1 = 0;
			Main.t.start();
			Main.f.setTitle("click Esc to pause");
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){
			
			x1 = 1;
			y1 = 0;
			Main.t.start();
			Main.f.setTitle("click Esc to pause");
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			
			Main.t.stop();
			Main.f.setTitle("click ENTER to continue");
			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			
			Main.t.start();
			Main.f.setTitle("click Esc to pause");
			
		}
		
	}

	public void keyReleased(KeyEvent e) {
		
		x1 = 0;
		y1 = 0;
		
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
}