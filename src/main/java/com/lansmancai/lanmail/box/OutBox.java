package com.lansmancai.lanmail.box;

import javax.swing.ImageIcon;

/**
 * ������, �������ڷ��͵��ʼ����߷���ʧ�ܵ��ʼ�
 * 
 */
public class OutBox extends AbstractBox {

	@Override
	public String getText() {
		return "������";
	}

	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/out-tree.gif");
	}
	
}
