package com.lansmancai.lanmail.ui;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 * �ʼ��б����
 */
public class MailListTable extends JTable {
	public MailListTable(TableModel dm) {
		super(dm);
		//ֻ��ѡ��һ��
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//ȥ��������
		setShowHorizontalLines(false);
		setShowVerticalLines(false);
	}
	//���б��ɱ༭
	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
