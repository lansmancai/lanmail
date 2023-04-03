package com.lansmancai.lanmail.system;

import com.lansmancai.lanmail.object.Mail;
import com.lansmancai.lanmail.ui.MailContext;

/**
 * �ڱ���ϵͳ�д����ʼ��Ľӿ�
 */
public interface SystemHandler {

	/**
	 * ɾ��һ���ʼ�(�ŵ�����վ)
	 * @param mail
	 * @param ctx ���������ĵõ���ص�Ŀ¼
	 */
	void delete(Mail mail, MailContext ctx);
	
	/**
	 * ���ʼ��������ѷ���
	 * @param mail
	 * @param ctx ���������ĵõ���ص�Ŀ¼
	 */
	void saveSent(Mail mail, MailContext ctx);
	
	/**
	 * ���ʼ�������������
	 * @param mail
	 * @param ctx ���������ĵõ���ص�Ŀ¼
	 */
	void saveOutBox(Mail mail, MailContext ctx);
	
	/**
	 * �������ݸ���
	 * @param mail
	 * @param ctx ���������ĵõ���ص�Ŀ¼
	 */
	void saveDraftBox(Mail mail, MailContext ctx);
	
	/**
	 * ����ɾ���ʼ�
	 * @param mail
	 * @param ctx ���������ĵõ���ص�Ŀ¼
	 */
	void realDelete(Mail mail, MailContext ctx);
	
	/**
	 * �����InBoxĿ¼
	 * @param mail
	 * @param ctx
	 */
	void saveInBox(Mail mail, MailContext ctx);
	
	/**
	 * ����һ���ʼ������ʼ��Ѿ������ڱ��ص�Ŀ¼��
	 * @param mail
	 * @param ctx
	 */
	void saveMail(Mail mail, MailContext ctx);
	
	/**
	 * �����������е��ʼ���ԭ
	 * @param mail
	 * @param ctx
	 */
	void revert(Mail mail, MailContext ctx);
}
