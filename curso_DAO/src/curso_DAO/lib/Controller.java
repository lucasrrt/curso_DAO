package curso_DAO.lib;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Controller implements ActionListener {
	protected JFrame container;
	protected JPanel view;
	
	public Controller(JFrame container){
		this.container = container;
	}
	
	public void render(){
		System.out.println("render begin");
		container.setContentPane(view);
		container.invalidate();
		container.validate();
		System.out.println("view:" + view);
		System.out.println("container" + container);
		System.out.println("render end");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                render();
            }
        });
		
	}
	
}
