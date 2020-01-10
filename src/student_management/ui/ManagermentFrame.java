package student_management.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import student_management.ui.frame.DepartmentManagermentFrame;
import student_management.ui.frame.StudentManagermentFrame;
import student_management.ui.frame.TitleManagermentFrame;

@SuppressWarnings("serial")
public class ManagermentFrame extends JFrame{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// 1: 학생 관리 / 2: 학과관리
					StudentManagermentFrame frame = new StudentManagermentFrame();
					frame.setVisible(true);
					
					DepartmentManagermentFrame deptFrame = new DepartmentManagermentFrame();
					deptFrame.setVisible(true);
					
					TitleManagermentFrame titleFrame = new TitleManagermentFrame();
					titleFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
