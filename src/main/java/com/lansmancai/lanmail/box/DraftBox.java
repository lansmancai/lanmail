package com.lansmancai.lanmail.box;

import javax.swing.ImageIcon;

/**
 * �ݸ���
 * 
 */
public class DraftBox extends AbstractBox {

	@Override
	public String getText() {
		return "�ݸ���";
	}

	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/draft-tree.gif");
	}
}
