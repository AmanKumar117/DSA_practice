import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class GuiDemo2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtSpecifyOthers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiDemo2 frame = new GuiDemo2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public GuiDemo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(64, 76, 47, 19);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 76, 170, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Job Application Form");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(157, 10, 218, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAddess = new JLabel("Addess :");
		lblAddess.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddess.setBounds(64, 124, 47, 19);
		contentPane.add(lblAddess);
		
		JLabel lblMobileNo = new JLabel("Mobile No. :");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMobileNo.setBounds(64, 170, 68, 19);
		contentPane.add(lblMobileNo);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(64, 218, 47, 19);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 125, 170, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 171, 170, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 219, 170, 19);
		contentPane.add(textField_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(121, 265, 68, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(214, 265, 68, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Others");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(311, 265, 68, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGender.setBounds(64, 265, 47, 19);
		contentPane.add(lblGender);
		
		JLabel lblLanguages = new JLabel("Languages :");
		lblLanguages.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLanguages.setBounds(64, 309, 68, 19);
		contentPane.add(lblLanguages);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1st preference", "English", "Hindi", "German", "French", "Others"}));
		comboBox.setBounds(136, 309, 87, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2nd preference", "English", "Hindi", "German", "French", "Others"}));
		comboBox_1.setBounds(233, 309, 86, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblAgreeToTerm = new JLabel("Agree to term and conditions:");
		lblAgreeToTerm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAgreeToTerm.setBounds(64, 393, 170, 19);
		contentPane.add(lblAgreeToTerm);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I Agree");
		chckbxNewCheckBox.setBounds(233, 393, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(null, "Thank you for applying!!");
					try {
						String g;
						if(rdbtnNewRadioButton.isSelected()) {
							g = "Male";
						}
						else if(rdbtnNewRadioButton_1.isSelected()) {
							g = "Female";
						}
						else {
							g = "Other";
						}
						String l1 = comboBox.getSelectedItem().toString();
						String l2 = comboBox_1.getSelectedItem().toString();
						String lf = l1+" "+l2+" "+txtSpecifyOthers.getText();
						connection(g,lf);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 	catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Please check box next to 'Agree to terms and conditions'!");
				}
			}
		});
		btnNewButton.setBounds(329, 420, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				txtSpecifyOthers.setText("");
				buttonGroup.clearSelection();
				chckbxNewCheckBox.setSelected(false);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
			}
		});
		btnClear.setBounds(227, 420, 85, 21);
		contentPane.add(btnClear);
		
		JLabel lblResumeLink = new JLabel("Resume Link: ");
		lblResumeLink.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResumeLink.setBounds(64, 354, 74, 19);
		contentPane.add(lblResumeLink);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(142, 355, 170, 19);
		contentPane.add(textField_4);
		
		txtSpecifyOthers = new JTextField();
		txtSpecifyOthers.setText("Specify Others..");
		txtSpecifyOthers.setColumns(10);
		txtSpecifyOthers.setBounds(329, 310, 96, 19);
		contentPane.add(txtSpecifyOthers);
		
		JLabel lblNewLabel_2 = new JLabel("All fields are mandatory to fill");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNewLabel_2.setBounds(144, 53, 168, 13);
		contentPane.add(lblNewLabel_2);
		
	}
	public void connection(String g, String lf) throws SQLException, ClassNotFoundException {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String conn_string = "jdbc:mysql://localhost/jobapp?"+"user=root&password=Mysql123";
            conn = DriverManager.getConnection(conn_string);
            stmt = conn.createStatement();
            String finalString = "insert into applicant_info(name, address, mobile_no, email, gender, language, resume_link) values('"+textField.getText()+"','"+textField_1.getText()+"','"+Integer.parseInt(textField_2.getText())+"','"+textField_3.getText()+"','"+g+"','"+lf+"','"+textField_4.getText()+"');";
            stmt.executeUpdate(finalString);
            rs = stmt.executeQuery("SELECT * FROM applicant_info");
            if (rs != null) 
            while ( rs.next() ) 
            {
                System.out.println(""+rs.getInt(1)+" -- "+rs.getString(2)+" -- "+rs.getString(3)+" -- "+rs.getInt(4)+" -- "+rs.getString(5)+" -- "+rs.getString(6)+" -- "+rs.getString(7)+" -- "+rs.getString(8));
            }
        }
        catch(SQLException ex){
            System.out.println("SQLException: "+ex.getMessage());
            System.out.println("SQLState: "+ex.getSQLState());
            System.out.println("VendorError: "+ex.getErrorCode());
        }
        finally{
            if(rs != null && stmt != null){
                rs.close();
                stmt.close();
                rs = null;
                stmt = null;
            }
            conn.close();
        }
	}
}