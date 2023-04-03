package com.lansmancai.lanmail.box;

import javax.swing.ImageIcon;

/**
 * �������Ľڵ������
 * 
 */
public abstract class AbstractBox implements MailBox {
	//��box����Ӧ��ͼƬ(��ʾ�����ϵ�ͼƬ)
	private ImageIcon icon;
	//ʵ�ֽӿڵķ���
	public ImageIcon getImageIcon(String imagePath) {
		if (this.icon == null) {
			this.icon = new ImageIcon(imagePath);
		}
		return this.icon;
	}
	//��дtoString����, ���ýӿڵ�getText����, getText����������ȥʵ��
	public String toString() {
		return getText();
	}
}
