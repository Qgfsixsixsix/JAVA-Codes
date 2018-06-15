import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

public class PersonnelManagementSystem extends JFrame {
	JTextArea attention;
	JTextField inputFieldAccount;
	JPasswordField inputFieldPassWord;
	
	public PersonnelManagementSystem(){
		
		this.setLayout(null);
		
		JPanel inform = new JPanel();
		JPanel LogWindows = new JPanel();

		// TabbedPanel control(n.);
		JTabbedPane tp = new JTabbedPane();
		
		tp.add(inform);
		tp.add(LogWindows);
		
		LogWindows.setLayout(null);
		
		tp.setTitleAt(0,"   最新通知   ");
		tp.setTitleAt(1,"   登录窗口   ");
		
		this.setContentPane(tp);
		
		attention = new JTextArea(15,45);
		inform.add(attention);
		attention.setEditable(false);
		
		attention.append("                                                         欢迎来到人事管理系统"+"\n");
		attention.append("\n");
		attention.append("  注意事项："+"\n");
		attention.append("  1.系统功能尚未完整，敬请谅解！"+"\n");
		attention.append("  2.系统的技术支持全程有Qgf提供"+"\n");
		attention.append("  3.该系统已实现管理员登陆功能，暂时还没有员工登录功能，请各位员工耐心等待...."+"\n");
		attention.append("  4.需要本系统的源代码请访问https://github.com/Qgfsixsixsix/JAVA-Codes"+"\n");
		attention.append("  5.本系统解析权归Qgf所有"+"\n");
		attention.append("  6.有事请联系QQ邮箱:1978347489@qq.com");
		
		JLabel jl1 = new JLabel("管理员账号");
		JLabel jl2 = new JLabel("密码");
		JLabel jl3 = new JLabel("欢迎使用人事管理系统");
		
		LogWindows.add(jl1);
		LogWindows.add(jl2);
		LogWindows.add(jl3);
		
		jl1.setBounds(100,85,100,25);
		jl2.setBounds(100,135,150,25);
		jl3.setBounds(180,20,200,25);
		
		JButton jt1 = new JButton("登录");
		JButton jt2 = new JButton("退出");
		
		LogWindows.add(jt1);
		LogWindows.add(jt2);
		
		jt1.setBounds(150,190,60,30);
		jt2.setBounds(300,190,60,30);
		
		inputFieldAccount = new JTextField();
		inputFieldPassWord = new JPasswordField();
		
		LogWindows.add(inputFieldAccount);
		LogWindows.add(inputFieldPassWord);
		
		inputFieldAccount.setBounds(170,80,200,30);
		inputFieldPassWord.setBounds(170,130,200,30);	
		
		//exit addActionListener;
		jt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		//log addActionListener;
		jt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String Account = inputFieldAccount.getText();
				String PassWord = inputFieldPassWord.getText();
				
				//log successfully;
				if(Account.trim().equals("1") && PassWord.trim().equals("1")){
					final JFrame dialog = new JFrame();
					JButton ok = new JButton("登录成功");
			
					dialog.add(ok);
					dialog.setBounds(100,300,20,20);
					
					dialog.setTitle("成功");
					dialog.setSize(200,150);
					dialog.setLocation(450,380);
					dialog.setVisible(true);
					dialog.setResizable(false);
					
					//ok addActionListener
					ok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							dialog.dispose();
							PersonnelManagementSystem.this.dispose();
							new Menu();
						}
					});
				}

				//Account is not empty but password is empty;
				else if (!Account.trim().equals("") && PassWord.trim().equals("")){
					final JFrame dialog = new JFrame();
					JButton emptyPassWord = new JButton("密码不能空");
				
					dialog.add(emptyPassWord);
				
					emptyPassWord.setBounds(100,300,20,20);
				
					dialog.setTitle("错误");
					dialog.setSize(200,150);
					dialog.setLocation(450,380);
					dialog.setVisible(true);
					dialog.setResizable(false);
				
					//emptyPassWord addActionListener;
					emptyPassWord.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							dialog.dispose();
						}
					});
				}

				//Account is empty but PassWord is not empty;
				else if (Account.trim().equals("") && !PassWord.trim().equals("")){
					final JFrame dialog = new JFrame();
					JButton emptyAccount = new JButton("账号为空");
				
					dialog.add(emptyAccount);
				
					emptyAccount.setBounds(100,300,20,20);
				
					dialog.setTitle("错误");
					dialog.setSize(200,150);
					dialog.setLocation(450,380);
					dialog.setVisible(true);
					dialog.setResizable(false);
				
					//emptyAccount addActionListener
					emptyAccount.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							dialog.dispose();
						}
					});
				}
				//Account and password are empty;
				else if (Account.trim().equals("") && PassWord.trim().equals("")){
					final JFrame dialog = new JFrame();
					JButton empty = new JButton("账号密码为空");
				
					dialog.add(empty);
				
					empty.setBounds(100,300,20,20);
				
					dialog.setTitle("错误");
					dialog.setSize(200,150);
					dialog.setLocation(450,380);
					dialog.setVisible(true);
					dialog.setResizable(false);
				
					//empty addActionListener
					empty.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							dialog.dispose();
						}
					});
					inputFieldAccount.setText("");
					inputFieldPassWord.setText("");
				}
				else {
					final JFrame dialog = new JFrame();
					JButton notok = new JButton("账号密码错误");
				
					dialog.add(notok);
				
					notok.setBounds(100,300,20,20);
				
					dialog.setTitle("错误");
					dialog.setSize(200,150);
					dialog.setLocation(450,380);
					dialog.setVisible(true);
					dialog.setResizable(false);
				
					//notok addActionListener
					notok.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							dialog.dispose();
						}
					});
					inputFieldAccount.setText("");
					inputFieldPassWord.setText("");
				}
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,300);
		this.setLocation(300,300);
		this.setVisible(true);
		this.setTitle("人事管理系统");
		this.setResizable(false);
		
	}
	public static void main(String[] args){
		new PersonnelManagementSystem();
	}
}
