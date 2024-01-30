package sec09.exam04_eventhandling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

public class JTableExample extends JFrame {

	private JTable jTable;
	private JPanel pSouth;
	//private JTextField txtName;
	//private JTextField txtAge;
	private JTextField txtCell;
	private Object[][] rowData;
	
	public JTableExample() {
		this.setTitle("JTableExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()),
				BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(200, 230);
	}
	
	public JTable getJTable() {
		if(jTable == null) {
			String[] columnNames = new String[] {"이름", "번호"};
			rowData = new Object[][] {
				{"최형석", 1},
				{"고승우", 2},
				{"김유송", 3},
				{"이창현", 4}
			};
			jTable =new JTable(rowData, columnNames);
			
			jTable.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int rowIndex = jTable.getSelectedRow();
					int columnIndex = jTable.getSelectedColumn();
					System.out.println("row:" + rowIndex+ " col:" + columnIndex);
					if(rowIndex != -1 && columnIndex !=-1) {
						if(columnIndex == 0) {
						TableModel tableModel = jTable.getModel();
						String cell = (String) tableModel.getValueAt(rowIndex, 0);
						getTxtCell().setText(cell);
						
						
						
						} else {
							TableModel tableModel = jTable.getModel();
							Integer cell = (Integer) tableModel.getValueAt(rowIndex, 1);
							getTxtCell().setText(String.valueOf(cell.intValue()));
					}
//					 else if(rowIndex != -1 && columnIndex !=1) {
//						TableModel tableModel = jTable.getModel();
//						Integer cell = (Integer) tableModel.getValueAt(rowIndex, 1);
//						getTxtCell().setText(String.valueOf(cell.intValue()));

						
					}
				}
			});
		}
		return jTable;
	}
	
	public JPanel getPSouth() {
		if(pSouth == null ) {
			pSouth = new JPanel();
			pSouth.setLayout(new GridLayout(4, 2));
			pSouth.add(new JLabel("[선택한 행 정보]"));
//			pSouth.add(new JLabel(""));
			pSouth.add(new JLabel("셀", JLabel.CENTER));
			pSouth.add(getTxtCell());
			
			
		}
		return pSouth;
	}
	
	public JTextField getTxtCell() {
		if(txtCell == null) {
			txtCell = new JTextField();
		}
		return txtCell;
	}
	

	
	
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
		
			JTableExample jFrame = new JTableExample();
			jFrame.setVisible(true);
				
			}
		});

		
	}

}
