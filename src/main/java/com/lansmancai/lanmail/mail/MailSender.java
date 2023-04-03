package com.lansmancai.lanmail.mail;

import com.lansmancai.lanmail.object.Mail;
import com.lansmancai.lanmail.ui.MailContext;

/**
 * 发送邮件接口
 * 
 */
public interface MailSender {

	/**
	 * 发送一封邮件并返回该邮件对象
	 * @param mail
	 * @param ctx
	 * @return
	 */
	Mail send(Mail mail, MailContext ctx);
}
