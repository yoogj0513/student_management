package student_management.ui.frame;

import student_management.dto.Department;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.DepartmentPanel;

@SuppressWarnings("serial")
public class DepartmentManagermentFrame extends AbsManagermentFrame<Department> {
	private DepartmentPanel deptPanel;

	@Override
	protected AbsItemPanel<Department> createItemPanel() {
		deptPanel = new DepartmentPanel();
		return deptPanel;
	}

	@Override
	protected Department getItem() {
		return deptPanel.getItem();
	}
	
	
	
}
