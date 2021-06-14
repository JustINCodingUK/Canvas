
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Main extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
    
	static String h;
    static Point p1;
    static Point p2;
    static Color color1;
    static int thick;
    static Color cout;
    static Color cfill;
    
	private static final long serialVersionUID = 1L;
	
	
	public static void main(String[] args) throws Exception {  
		 
	
		JButton b = new JButton("Color");
        JButton rect = new JButton("Rectangle");
        JButton r1  =new JButton("On");
        JButton r2 = new JButton("Off");
        JButton size = new JButton("Thickness");
        JButton c = new JButton("Circle");
        JButton c1 = new JButton("On");
        JButton c2 = new JButton("Off");
        JButton line = new JButton("Line");
        JButton l1 = new JButton("On");
        JButton l2 = new JButton("Off");
        JButton fill = new JButton("Fill");
        JButton f1 = new JButton("On");
        JButton f2 = new JButton("Off");
        
        
        
        b.setBounds(370,20,100,20);
		r1.setBounds(130,60,50,20);   
        r2.setBounds(180,60,55,20);    
        size.setBounds(500,20,100,20);
        c.setBounds(20,90,100,20);
        c1.setBounds(130,90,50,20);
        c2.setBounds(180,90,55,20);
        line.setBounds(20,120,100,20);
        l1.setBounds(130,120,50,20);
        l2.setBounds(180,120,55,20);
        fill.setBounds(250,20,100,20);
        f1.setBounds(250,45,50,20);
        f2.setBounds(300,45,55,20);
        
        l2.setEnabled(false);
        c2.setEnabled(false);
        r2.setEnabled(false);
        line.setEnabled(false);
        rect.setEnabled(false);
        c.setEnabled(false);
        fill.setEnabled(false);
        
		    JFrame f = new JFrame("Canvas");
            f2.setEnabled(false);
            
		    rect.setBounds(20,60,100,20);
		  
		    r1.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent f) {
		    		rect.setEnabled(true);
		    		r2.setEnabled(true);
		    		r1.setEnabled(false);
		    	}
		    });
		    
		    r2.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent f) {
		    		rect.setEnabled(false);
		    		r2.setEnabled(false);
		    		r1.setEnabled(true);
		    	}
		    });
		    
		    c1.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent f) {
		    		c.setEnabled(true);
		    		c2.setEnabled(true);
		    		c1.setEnabled(false);
		    	}
		    });
		    
		    c2.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent f) {
		    		c.setEnabled(false);
		    		c2.setEnabled(false);
		    		c1.setEnabled(true);
		    	}
		    });
		    
		    l1.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent f) {
		    		line.setEnabled(true);
		    		l2.setEnabled(true);
		    		l1.setEnabled(false);
		    	}
		    });
		    
		    l2.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent f) {
		    		line.setEnabled(false);
		    		l2.setEnabled(false);
		    		l1.setEnabled(true);
		    	}
		    });
		    
		    f1.addActionListener(new ActionListener() {
 		    	public void actionPerformed(ActionEvent g) {
 		    	  fill.setEnabled(true);
 		    	  f1.setEnabled(false);
 		    	  f2.setEnabled(true);
 		    		
 		    		
 		    	}
 		    });
 		    
 		    f2.addActionListener(new ActionListener() {
 		    	public void actionPerformed(ActionEvent g) {
 		    		fill.setEnabled(false);
 		    		f1.setEnabled(true);
 		    		f2.setEnabled(false);
 		    	}
 		    });
		    
		    fill.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent h) {
		    		JFrame q = new JFrame("Fill Properties");
		    		JPanel e = new JPanel();
		    		JButton fillc = new JButton("Fill Color");
		    		JButton fillo = new JButton("Outline Color");
		    		fillo.setBounds(80,90,120,20);
		    		fillc.setBounds(80,50,120,20);
		    		e.add(fillo);
		    		e.add(fillc);
		    		e.setLayout(null);
		    		
		    	    
		    	    fillc.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent y) {
		    	    	  cfill = JColorChooser.showDialog(fillc, "Fill Color", Color.BLACK);	
		    	    	}
		    	    });
		    	    
		    	    
		    	    fillo.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent f) {
		    	    		cout = JColorChooser.showDialog(fillo, "Outline Color", Color.BLACK);
		    	    	}
		    	    });
		    	    
		    	    q.setLocationRelativeTo(null);
		    		q.setSize(300,300);
		    		q.setVisible(true);
		    		q.add(e);
		    		
		    	}
		    });
		    
		   
		    
            b.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		 color1 = JColorChooser.showDialog(b, "Properties", Color.RED);
            		
            			
            		}
            	
            });
            
            size.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		JFrame error = new JFrame("Error");
            		JButton ok =  new JButton("OK");
    				JPanel j = new JPanel();
    				JLabel l = new JLabel();
            		JFrame set = new JFrame("Thickness");
            		JPanel gh = new JPanel();
            		gh.setLayout(null);
            		JButton En = new JButton("Enter");
            		JTextField fo = new JTextField();
            		fo.setText(h);
            		set.setSize(400,200);
            		En.setBounds(200,70,70,20);
            		fo.setBounds(180,30,100,20);
            		
            		En.addActionListener(new ActionListener() {
            			public void actionPerformed(ActionEvent f) {
            			     h = fo.getText();
            				thick = Integer.valueOf(h);
            				if(thick<51) {
            				set.dispose();
            			}else {
            				error.add(j);
            				j.add(l);
            				j.setLayout(null);
            				error.setSize(300,150);
            				l.setText("Size should be less than 50");
            				l.setBounds(70,10,300,40);
            				error.setLocationRelativeTo(null);
            				j.add(ok);
            				ok.setBounds(100,70,70,20);
            				ok.addActionListener(new ActionListener() {
            					public void actionPerformed(ActionEvent w) {
            						error.dispose();
            					}
            				});
            				error.setVisible(true);
            			}
            			
            			}	
            		});
            		
            		
            		
            		gh.add(En);
            		gh.add(fo);
            		set.add(gh);
            		set.setVisible(true);
            		set.setLocationRelativeTo(null);
            		
            	}
            });
		    JPanel p = new JPanel() {
        
				{
					 setLayout(null);
            	addMouseListener(new MouseAdapter() {
                 	public void mousePressed(MouseEvent e) {
                 		p1=e.getPoint();
                 		xList.add(p1.x); 		
                 		yList.add(p1.y);			
     				}
            	 });
            
                 addMouseMotionListener(new MouseMotionAdapter() {
     				
     				
     				public void mouseMoved(MouseEvent e) {
     				
     				}
     				
     				
     				public void mouseDragged(MouseEvent e) {
     					p2=e.getPoint();
     				    xList.add(p2.x);
     				    yList.add(p2.y);
     					repaint();
     				   
     					
     				}
     			});
            	
                 
            	}
            	
				public void paint(Graphics g) {
					Graphics2D g2 = (Graphics2D) g;
					super.paint(g2);
				    
					if(p1!=null) {
        				if(fill.isEnabled()==false) {
						g2.setStroke(new BasicStroke(thick));
        				g2.setColor(color1);
        				
        				if(line.isEnabled()) {
        				g2.drawLine(p1.x, p1.y, p2.x, p2.y);
        				      				
        				
        				}
        					
        				if(rect.isEnabled()) {
        					g2.drawRect(p1.x,p1.y,p2.x-p1.x,p2.y-p1.y);
        					
        				}
        				
        				if(c.isEnabled()) {
        					g2.drawOval(p1.x,p1.y,p2.x-p1.x,p2.y-p1.y);
        				
        				}
        				}
        			
        				if(fill.isEnabled()) {
        			    g2.setStroke(new BasicStroke(thick));
          				
          				
          				if(line.isEnabled()) {
          				g2.drawLine(p1.x, p1.y, p2.x, p2.y);
          				      				
          				
          				}
          					
          				if(rect.isEnabled()) {
          					g2.setColor(cout);
          					g2.drawRect(p1.x, p1.y, p2.x-p1.x, p2.y-p1.y);
          					Rectangle r = new Rectangle(p1.x+thick/2, p1.y+thick/2, (p2.x-p1.x)-thick, (p2.y-p1.y)-thick);
          					g2.setColor(cfill);
          					g2.fill(r);
          					
          				}
          				
          				if(c.isEnabled()) {
          					g2.setColor(cout);
          					g2.drawOval(p1.x, p1.y, p2.x-p1.x, p2.y-p1.y);
          					g2.setColor(cfill);
          					g2.fillOval(p1.x+thick/2,p1.y+thick/2,(p2.x-p1.x)-thick,(p2.y-p1.y)-thick);
          				
          				}
        				}
        			}
					
            }
				
			
				
				
		    };
            
            
                 
            	
            JColorChooser ch = new JColorChooser();
           p.add(line);
           p.add(l1);
           p.add(l2);
            p.add(fill);
            p.add(c);
           p.add(c1);
           p.add(c2);
            p.add(r1);
           p.add(r2);
             p.add(rect);
            f.setSize(800,600);
            p.add(b);
            f.add(p);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            p.add(size);
            p.add(f1);
            p.add(f2);
		 
		    
}
	
	


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	
 

}
