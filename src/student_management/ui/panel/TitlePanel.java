package student_management.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import student_management.dto.Title;

@SuppressWarnings("serial")
public class TitlePanel extends AbsItemPanel<Title> {
	private JLabel lblTitleNo;
	private JTextField tfTitleNo;
	private JLabel lblTitleName;
	private JTextField tfTitleName;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uD559\uACFC \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblTitleNo = new JLabel("직책번호");
		lblTitleNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleNo);
		
		tfTitleNo = new JTextField();
		add(tfTitleNo);
		tfTitleNo.setColumns(10);
		
		lblTitleName = new JLabel("직책명");
		lblTitleName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleName);
		
		tfTitleName = new JTextField();
		tfTitleName.setColumns(10);
		add(tfTitleName);
	}
	
	
	@Override
	public void clearTf() {
		tfTitleNo.setText("");
		tfTitleName.setText("");
	}
	
	@Override
	public Title getItem() {
		int titleNo = Integer.parseInt(tfTitleNo.getText().trim());
		String titleName= tfTitleName.getText().trim();
		Title title = new Title(titleNo, titleName);
		return title;
	}
	
	@Override
	public void setItem(Title item) {
		tfTitleNo.setText(item.getTitleNo()+"");
		tfTitleName.setText(item.getTitleName());
	}
}
