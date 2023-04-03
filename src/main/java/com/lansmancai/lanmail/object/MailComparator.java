package com.lansmancai.lanmail.object;

import java.util.Comparator;
import java.util.Date;

/**
 * �ʼ�������
 * 
 */
public class MailComparator implements Comparator {
	//ʵ��compare����
	public int compare(Object o1, Object o2) {
		try {
			//������ǿתΪMail����
			Mail m1 = (Mail)o1;
			Mail m2 = (Mail)o2;
			//����������ڽ��бȽ�
			Date d1 = m1.getReceiveDate();
			Date d2 = m2.getReceiveDate();
			return d2.compareTo(d1);
		} catch (Exception e) {
			return -1;
		}
	}

}
