package student_management.ui.panel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import student_management.dto.Department;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DepartmentPanel extends AbsItemPanel<Department> {
	private JLabel lblDeptNo;
	private JTextField tfDeptNo;
	private JLabel lblDeptName;
	private JTextField tfDeptName;
	private JLabel lblFloor;
	private JTextField tfFloor;

	/**
	 * Create the panel.
	 */
	public DepartmentPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uD559\uACFC \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblDeptNo = new JLabel("학과번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		add(tfDeptNo);
		tfDeptNo.setColumns(10);
		
		lblDeptName = new JLabel("학과명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		tfDeptName.setColumns(10);
		add(tfDeptName);
		
		lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		tfFloor.setColumns(10);
		add(tfFloor);
	}
	
	
	@Override
	public void clearTf() {
		tfDeptNo.setText("");
		tfDeptName.setText("");
		tfFloor.setText("");
	}
	
	@Override
	public Department getItem() {
		int deptNo = Integer.parseInt(tfDeptNo.getText().trim());
		String deptName= tfDeptName.getText().trim();
		int floor = Integer.parseInt(tfFloor.getText().trim());
		Department dept = new Department(deptNo, deptName, floor);
		return dept;
	}
	
	@Override
	public void setItem(Department item) {
		tfDeptNo.setText(item.getDeptNo()+"");
		tfDeptName.setText(item.getDeptName());
		tfFloor.setText(item.getFloor()+"");
	}
}
