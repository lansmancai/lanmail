package com.lansmancai.lanmail.mail;

import java.util.List;

import com.lansmancai.lanmail.object.Mail;
import com.lansmancai.lanmail.ui.MailContext;

/**
 * ��ȡ�ʼ���Ϣ�Ľӿ�
 * 
 */
public interface MailLoader {
	
	/**
	 * �õ�INBOX�������ʼ�
	 * @param ctx �����������
	 * @return
	 */
	List<Mail> getMessages(MailContext ctx);
	
}
