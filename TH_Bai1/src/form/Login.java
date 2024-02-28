package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JPasswordField txtMatKhau;

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("ĐĂNG NHẬP QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(21, 50, 127, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(21, 86, 81, 25);
		contentPane.add(lblMtKhu);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTaiKhoan.setBounds(151, 50, 234, 25);
		contentPane.add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(151, 151, 133, 47);
		contentPane.add(btnDangNhap);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(151, 86, 234, 25);
		contentPane.add(txtMatKhau);
	}
	void DangNhap() {
		String strTen = txtTaiKhoan.getText();
		String strMK = txtMatKhau.getText();
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			MainFrame mainframe = new MainFrame();
			mainframe.setVisible(true);
			this.setVisible(false);
		}else {
			txtTaiKhoan.setText("");
			txtMatKhau.setText("");
			
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this,"Đăng nhập thất bại");
		}
	}
}
