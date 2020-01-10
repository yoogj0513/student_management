package student_management.ui.panel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import student_management.dto.Student;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StudentPanel extends JPanel {
	private JLabel lblStdNo;
	private JTextField tfStdNo;
	private JLabel lblStdName;
	private JTextField tfStdName;
	private JLabel lblKor;
	private JTextField tfKor;
	private JLabel lblEng;
	private JTextField tfMath;
	private JLabel lblMath;
	private JTextField tfEng;

	/**
	 * Create the panel.
	 */
	public StudentPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uD559\uC0DD\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblStdNo = new JLabel("학생번호");
		lblStdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblStdNo);
		
		tfStdNo = new JTextField();
		add(tfStdNo);
		tfStdNo.setColumns(10);
		
		lblStdName = new JLabel("학생이름");
		lblStdName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblStdName);
		
		tfStdName = new JTextField();
		add(tfStdName);
		tfStdName.setColumns(10);
		
		lblKor = new JLabel("국어");
		lblKor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblKor);
		
		tfKor = new JTextField();
		add(tfKor);
		tfKor.setColumns(10);
		
		lblEng = new JLabel("수학");
		lblEng.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblEng);
		
		tfMath = new JTextField();
		add(tfMath);
		tfMath.setColumns(10);
		
		lblMath = new JLabel("영어");
		lblMath.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblMath);
		
		tfEng = new JTextField();
		add(tfEng);
		tfEng.setColumns(10);
	}
	
	public Student getStudent() {
		int stdNo = Integer.parseInt(tfStdNo.getText().trim());
		String stdName = tfStdName.getText().trim();
		int kor = Integer.parseInt(tfKor.getText().trim());
		int math = Integer.parseInt(tfMath.getText().trim());
		int eng = Integer.parseInt(tfEng.getText().trim());
		Student std = new Student(stdNo, stdName, kor, math, eng);
		return std;
	}
	
	public void setStudent(Student std) {
		tfStdNo.setText(std.getStdNo()+"");
		tfStdName.setText(std.getStdName());
		tfKor.setText(std.getKor()+"");
		tfMath.setText(std.getKor()+"");
		tfEng.setText(std.getEng()+"");
	}
	
	public void clearTf() {
		tfStdNo.setText("");
		tfStdName.setText("");
		tfKor.setText("");
		tfMath.setText("");
		tfEng.setText("");
	}
}
