package com.lansmancai.lanmail.mail;

import java.util.List;

import com.lansmancai.lanmail.object.Mail;
import com.lansmancai.lanmail.ui.MailContext;

/**
 * 读取邮件信息的接口
 * 
 */
public interface MailLoader {
	
	/**
	 * 得到INBOX的所有邮件
	 * @param ctx 邮箱的上下文
	 * @return
	 */
	List<Mail> getMessages(MailContext ctx);
	
}
