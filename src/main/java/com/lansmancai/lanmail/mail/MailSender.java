package com.lansmancai.lanmail.mail;

import com.lansmancai.lanmail.object.Mail;
import com.lansmancai.lanmail.ui.MailContext;

/**
 * �����ʼ��ӿ�
 * 
 */
public interface MailSender {

	/**
	 * ����һ���ʼ������ظ��ʼ�����
	 * @param mail
	 * @param ctx
	 * @return
	 */
	Mail send(Mail mail, MailContext ctx);
}
