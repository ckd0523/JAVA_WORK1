package sec11.exam01_jmenu;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class JMenuExample2 extends JFrame {

	private JMenuBar jMenuBar;
	private JMenu menuProject, menuDelete, menuEdit, menuSort, menuEffect, menuPage;
	private JMenuItem menuItemDeleteProject;
	private JMenuItem menuItemExit, menuItemNameChange, menuItemCopy, menuItemPInfo, menuItemOrigin, menuItemShare ;
	private JMenuItem menuItemNewPage, menuItemAllSave, menuItemPageCopy, menuItemPageDelete, menuItemPageNameChange, menuItemPageDown, menuItemPageUpLoad, menuItemPageTest;
	
	// 메인 윈도우 설정
	public JMenuExample2() {
		this.setTitle("JMenuExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJMenuBar());
		this.setSize(300, 200);
	}
	
	// JMenuBar 생성
	public JMenuBar getJMenuBar() {
		if(jMenuBar == null) {
			jMenuBar = new JMenuBar();
			
			JMenu menuEdit = new JMenu("편집");
			JMenu menuSort = new JMenu("정렬");
			JMenu menuEffect = new JMenu("효과");
			
			// 메뉴 추가
			jMenuBar.add(getMenuProject());
			jMenuBar.add(getMenuPage());
			jMenuBar.add(menuEdit);
			jMenuBar.add(menuSort);
			jMenuBar.add(menuEffect);
			
		}
		return jMenuBar;
	}
	// 프로젝트 메뉴 생성
	public JMenu getMenuProject() {
		if(menuProject == null) {
			menuProject = new JMenu("프로젝트");
			
			JMenuItem menuItemNameChange = new JMenuItem("이름 바꾸기");
			JMenuItem menuItemCopy = new JMenuItem("사본 만들기");
			JMenuItem menuItemPInfo = new JMenuItem("프로젝트 정보 설정");
			JMenuItem menuItemOrigin = new JMenuItem("기본 화면사이즈");
			JMenuItem menuItemShare = new JMenuItem("공유 옵션");
			JMenuItem menuItemExit = new JMenuItem("닫기");
			
			//서브메뉴과 메뉴 아이템 추가
			menuProject.add(menuItemNameChange);
			menuProject.add(menuItemCopy);
			menuProject.add(getMenuDelete());
			menuProject.add(new JSeparator());// 아이템들 분리
			menuProject.add(menuItemPInfo);
			menuProject.add(menuItemOrigin);
			menuProject.add(menuItemShare);
			menuProject.add(new JSeparator());
			menuProject.add(menuItemExit);

		}
		return menuProject;
	}
	
	// 페이지 메뉴 생성
	public JMenu getMenuPage() {
		if(menuPage == null) {
			menuPage = new JMenu("페이지");
			
			JMenuItem menuItemNewPage = new JMenuItem("새 페이지 삽입");
			JMenuItem menuItemAllSave = new JMenuItem("모두 저장하기");
			JMenuItem menuItemPageCopy = new JMenuItem("페이지 복제");
			JMenuItem menuItemPageDelete = new JMenuItem("페이지 삭제");
			JMenuItem menuItemPageNameChange = new JMenuItem("페이지 이름 바꾸기");
			JMenuItem menuItemPageDown = new JMenuItem("페이지 내려받기");
			JMenuItem menuItemPageUpLoad = new JMenuItem("전체 페이지 내려받기");
			JMenuItem menuItemPageTest = new JMenuItem("웹 테스트");
			
			//서브메뉴과 메뉴 아이템 추가
			menuPage.add(menuItemNewPage);
			menuPage.add(new JSeparator());
			menuPage.add(menuItemAllSave);
			menuPage.add(new JSeparator());
			menuPage.add(menuItemPageCopy);
			menuPage.add(menuItemPageDelete);
			menuPage.add(menuItemPageNameChange);
			menuPage.add(new JSeparator());
			menuPage.add(menuItemPageDown);
			menuPage.add(menuItemPageUpLoad);
			menuPage.add(new JSeparator());
			menuPage.add(menuItemPageTest);

		}
		return menuPage;
	}
	
	// 삭제하기 서브 메뉴 생성
	public JMenu getMenuDelete() {
		if(menuDelete == null) {
			menuDelete = new JMenu("삭제 하기");
			// 메뉴 아이템 추가
			menuDelete.add(getMenuItemDeleteProject());

			
		}
		return menuDelete;
	}
	// 새 파일 메뉴 아이템 생성
	public JMenuItem getMenuItemDeleteProject() {
		if(menuItemDeleteProject==null) {
			menuItemDeleteProject =new JMenuItem("이 프로젝트를 삭제");
		}
		return menuItemDeleteProject;
	}



	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
		
				JMenuExample2 jFrame = new JMenuExample2();
				jFrame.setVisible(true);
				
			}
		});
		
	}

}
