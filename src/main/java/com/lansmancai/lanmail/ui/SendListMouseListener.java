package com.lansmancai.lanmail.ui;

import javax.swing.JOptionPane;

import com.lansmancai.lanmail.object.FileObject;

/**
 * д�ʼ�ʱ�ĸ����б������
 * 
 */
public class SendListMouseListener extends MainListMouseListener {

	@Override
	public void handle(FileObject file) {
		int result = JOptionPane.showOptionDialog(null, "��ѡ�����", "ѡ��",
				0, JOptionPane.QUESTION_MESSAGE, null, 
				new Object[]{"��", "ȡ��"}, null);
		if (result == 0) {
			//�򿪲���
			openFile(file);
		}
	}

}
