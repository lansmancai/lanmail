package com.lansmancai.lanmail.box;

import javax.swing.ImageIcon;

/**
 * �Ѿ��ɹ����͵��ʼ�
 * 
 */
public class SentBox extends AbstractBox {

	@Override
	public String getText() {
		return "�ѷ���";
	}
	
	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/sent-tree.gif");
	}
}
