import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;
	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(30, 35, 70, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập b:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(30, 79, 70, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập c:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(30, 131, 70, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả:");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(30, 244, 70, 25);
		contentPane.add(lblNewLabel_3);
		
		txtA = new JTextField();
		txtA.setBounds(97, 34, 171, 25);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(97, 83, 171, 25);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(97, 131, 171, 25);
		contentPane.add(txtC);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(97, 241, 362, 35);
		contentPane.add(txtKetQua);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str_a = txtA.getText();
				String str_b = txtB.getText();
				String str_c = txtC.getText();
				
				double a = Double.parseDouble(str_a);
                double b = Double.parseDouble(str_b);
                double c = Double.parseDouble(str_c);
                
                double delta = b * b - 4 * a * c;

                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    txtKetQua.setText("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    txtKetQua.setText("Phương trình có nghiệm kép: x = " + x);
                } else {
                    txtKetQua.setText("Phương trình vô nghiệm");
                }
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(337, 67, 96, 49);
		contentPane.add(btnTinh);
	}

}
