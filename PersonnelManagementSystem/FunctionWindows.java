import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class FunctionWindows extends JFrame{
	
	JTextField employeeNumber;
	JTextField passWord;
	JTextField authority;
	JTextField name;
	JTextField sex;
	JTextField birthday;
	JTextField subordinateDepartment;
	JTextField job;
	JTextField educationalLevel;
	JTextField personnelSkills;
	JTextField postalAddress;
	JTextField contactNumber;
	JTextField email;
	JTextField currentState;
	JTextField remarks;
	
	public FunctionWindows(){

		//define foul JPanels;
		JPanel addEmployees = new JPanel();
//		JPanel personnelChange = new JPanel();
//		JPanel queryModificationOfEmployeesInformation = new JPanel();
//		JPanel Encryption = new JPanel();

		//set layout is null;
		addEmployees.setLayout(null);
//		personnelChange.setLayout(null);
//		queryModificationOfEmployeesInformation.setLayout(null);
//		Encryption.setLayout(null);
		
		//TabbedPanel control(n.);
		JTabbedPane tp = new JTabbedPane();

		tp.add(addEmployees);
//		tp.add(personnelChange);
//		tp.add(queryModificationOfEmployeesInformation);
//		tp.add(Encryption);

		tp.setTitleAt(0,"    增加新员工    ");

		this.setContentPane(tp);
		
/*
 * 55-190 belong to addEmployees; 		
 */
		JLabel label = new JLabel("添加新员工各类信息：(*为必填)");
		JLabel label1 = new JLabel("员工号");
		JLabel label2 = new JLabel("密码");
		JLabel label3 = new JLabel("权限");
		JLabel label4 = new JLabel("姓名");
		JLabel label5 = new JLabel("性别");
		JLabel label6 = new JLabel("生日");
		JLabel label7 = new JLabel("所在部门");
		JLabel label8 = new JLabel("职务");
		JLabel label9 = new JLabel("受教育程度");
		JLabel label10 = new JLabel("专业技能");
		JLabel label11 = new JLabel("家庭地址");
		JLabel label12 = new JLabel("联系电话");
		JLabel label13 = new JLabel("电子邮箱");
		JLabel label14 = new JLabel("当前状态");
		JLabel label15 = new JLabel("备注");
		JLabel label16 = new JLabel("*");
		JLabel label17 = new JLabel("*");
		//JLabel label18 = new JLabel("*");
		JLabel label19 = new JLabel("*");
		JLabel label20 = new JLabel("*");
		JLabel label21 = new JLabel("*");
		JLabel label22 = new JLabel("*");
		JLabel label23 = new JLabel("*");
		JLabel label24 = new JLabel("*");
		JLabel label25 = new JLabel("*");
		JLabel label26 = new JLabel("*");
		JLabel label27 = new JLabel("*");
		JLabel label28 = new JLabel("*");
		JLabel label29 = new JLabel("*");
		//JLabel label30 = new JLabel("*");
		
		addEmployees.add(label);
		addEmployees.add(label1);
		addEmployees.add(label2);
		addEmployees.add(label3);
		addEmployees.add(label4);
		addEmployees.add(label5);
		addEmployees.add(label6);
		addEmployees.add(label7);
		addEmployees.add(label8);
		addEmployees.add(label9);
		addEmployees.add(label10);
		addEmployees.add(label11);
		addEmployees.add(label12);
		addEmployees.add(label13);
		addEmployees.add(label14);
		addEmployees.add(label15);
		addEmployees.add(label16);
		addEmployees.add(label17);
		//addEmployees.add(label18);
		addEmployees.add(label19);
		addEmployees.add(label20);
		addEmployees.add(label21);
		addEmployees.add(label22);
		addEmployees.add(label23);
		addEmployees.add(label24);
		addEmployees.add(label25);
		addEmployees.add(label26);
		addEmployees.add(label27);
		addEmployees.add(label28);
		addEmployees.add(label29);
		//addEmployees.add(label30);
		
		//set labels location in addEmployees JPanel;
		label.setBounds(20,20,200,20);
		label1.setBounds(20,70,50,20);
		label2.setBounds(20,120,50,20);
		label3.setBounds(20,170,50,20);
		label4.setBounds(20,220,50,20);
		label5.setBounds(20,270,50,20);
		label6.setBounds(20,320,50,20);
		label7.setBounds(20,370,70,20);
		label8.setBounds(425,20,70,20);
		label9.setBounds(425,70,70,20);
		label10.setBounds(425,120,70,20);
		label11.setBounds(425,170,70,20);
		label12.setBounds(425,220,70,20);
		label13.setBounds(425,270,70,20);
		label14.setBounds(425,320,70,20);
		label15.setBounds(425,370,70,20);
		
		//set * is red;
		label16.setForeground(Color.RED);
		label17.setForeground(Color.RED);
		//label18.setForeground(Color.RED);
		label19.setForeground(Color.RED);
		label20.setForeground(Color.RED);
		label21.setForeground(Color.RED);
		label22.setForeground(Color.RED);
		label23.setForeground(Color.RED);
		label24.setForeground(Color.RED);
		label25.setForeground(Color.RED);
		label26.setForeground(Color.RED);
		label27.setForeground(Color.RED);
		label28.setForeground(Color.RED);
		label29.setForeground(Color.RED);
		//label30.setForeground(Color.RED);
		
		employeeNumber = new JTextField();
		passWord = new JTextField();
		authority = new JTextField();
		name = new JTextField();
		sex = new JTextField();
		birthday = new JTextField();
		subordinateDepartment = new JTextField();
		job = new JTextField();
		educationalLevel = new JTextField();
		personnelSkills = new JTextField();
		postalAddress = new JTextField();
		contactNumber = new JTextField();
		email = new JTextField();
		currentState = new JTextField();
		remarks = new JTextField();
		
		addEmployees.add(employeeNumber);
		addEmployees.add(passWord);
		addEmployees.add(authority);
		addEmployees.add(name);
		addEmployees.add(sex);
		addEmployees.add(birthday);
		addEmployees.add(subordinateDepartment);
		addEmployees.add(job);
		addEmployees.add(educationalLevel);
		addEmployees.add(personnelSkills);
		addEmployees.add(postalAddress);
		addEmployees.add(contactNumber);
		addEmployees.add(email);
		addEmployees.add(currentState);
		addEmployees.add(remarks);
		
		employeeNumber.setBounds(100,70,200,20);
		label16.setBounds(310,75,10,10);
		passWord.setBounds(100,120,200,20);
		label17.setBounds(310,125,10,10);
		authority.setBounds(100,170,200,20);
		//label18.setBounds(310,175,10,10);
		name.setBounds(100,220,200,20);
		label19.setBounds(310,225,10,10);
		sex.setBounds(100,270,200,20);
		label20.setBounds(310,275,10,10);
		birthday.setBounds(100,320,200,20);
		label21.setBounds(310,325,10,10);
		subordinateDepartment.setBounds(100,370,200,20);
		label22.setBounds(310,375,10,10);
		job.setBounds(525,20,200,20);
		label23.setBounds(735,25,10,10);
		educationalLevel.setBounds(525,70,200,20);
		label24.setBounds(735,75,10,10);
		personnelSkills.setBounds(525,120,200,20);
		label25.setBounds(735,125,10,10);
		postalAddress.setBounds(525,170,200,20);
		label26.setBounds(735,175,10,10);
		contactNumber.setBounds(525,220,200,20);
		label27.setBounds(735,225,10,10);
		email.setBounds(525,270,200,20);
		label28.setBounds(735,275,10,10);
		currentState.setBounds(525,320,200,20);
		label29.setBounds(735,325,10,10);
		remarks.setBounds(525,370,200,20);
		//label30.setBounds(735,375,10,10);
		
		JButton jb1 = new JButton("确定");
		JButton jb2 = new JButton("退出系统");
		JButton jb3 = new JButton("返回菜单");
		
		addEmployees.add(jb1);
		addEmployees.add(jb2);
		addEmployees.add(jb3);
		
		jb1.setBounds(100,430,150,40);
		jb2.setBounds(600,430,150,40);
		jb3.setBounds(350,430,150,40);

		//jb1 addActionListener
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				employeeNumber.setText("");
				passWord.setText("");
				authority.setText("");
				name.setText(""); 
				sex.setText("");
				birthday.setText(""); 
				subordinateDepartment.setText(""); 
				job.setText("");
				educationalLevel.setText("");
				personnelSkills.setText("");
				postalAddress.setText("");
				contactNumber.setText("");
				email.setText("");
				currentState.setText("");
				remarks.setText("");
			}
		});
		
		//jb2 addActionListener
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FunctionWindows.this.dispose();
				new Menu();
			}
		});
		
//		JButton jb3 = new JButton("员工信息查询");
//		JButton jb4 = new JButton("员工信息修改");
//		
//		queryModificationOfEmployeesInformation.add(jb3);
//		queryModificationOfEmployeesInformation.add(jb4);
//		
//		jb3.setBounds(50,50,150,60);
//		jb4.setBounds(50,150,150,60);
//		
//		jb3.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				
//			}
//		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,550);
		this.setLocation(250,200);
		this.setVisible(true);
		this.setTitle("人事管理系统（管理员身份）");
		this.setResizable(false);
	}
}
