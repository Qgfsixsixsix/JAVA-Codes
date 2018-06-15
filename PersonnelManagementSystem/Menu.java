import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
	public Menu(){
		this.setLayout(null);
		
		JPanel menu = new JPanel();
		
		//JTabbedPane control(n.)
		JTabbedPane jtp = new JTabbedPane();
		
		jtp.add(menu);
		
		menu.setLayout(null);
		
	jtp.setTitleAt(0,"系统菜单");
	
	this.setContentPane(jtp);
	
	JButton jbt1 = new JButton("员工信息查询");
	JButton jbt2 = new JButton("增加新员工");
	JButton jbt3 = new JButton("人事变动");
	JButton jbt4 = new JButton("员工信息修改");
	JButton jbt5 = new JButton("加密模块");
	JButton jbt6 = new JButton("退出系统");
	
	menu.add(jbt1);
	menu.add(jbt2);
	menu.add(jbt3);
	menu.add(jbt4);
	menu.add(jbt5);
	menu.add(jbt6);
	
	jbt1.setBounds(30,40,120,50);
	jbt2.setBounds(200,40,100,50);
	jbt3.setBounds(350,40,100,50);
	jbt4.setBounds(30,130,120,50);
	jbt5.setBounds(200,130,100,50);
	jbt6.setBounds(350,130,100,50);
	
	//jbt2 ActionListener
	jbt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Menu.this.dispose();
			new FunctionWindows();
		}
	});
	
	//jbt6 ActionListener
	jbt6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	});
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,300);
	this.setLocation(300,300);
	this.setVisible(true);
	this.setTitle("人事管理系统");
	this.setResizable(false);
	
	}
}
