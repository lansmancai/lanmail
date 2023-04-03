package com.lansmancai.lanmail.system.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lansmancai.lanmail.object.Mail;
import com.lansmancai.lanmail.object.MailComparator;
import com.lansmancai.lanmail.system.SystemLoader;
import com.lansmancai.lanmail.ui.MailContext;
import com.lansmancai.lanmail.util.FileUtil;

/**
 * ����ϵͳ�ʼ�����ʵ����
 * 
 */
public class SystemLoaderImpl implements SystemLoader {

	//ʵ�ֽӿڷ���, �õ���������ʼ�
	public List<Mail> getDeletedBoxMails(MailContext ctx) {
		//�ȴ����û���Ӧ��deletedĿ¼�еõ�ȫ����xml�ļ�
		return getMails(ctx, FileUtil.DELETED);
	}

	//ʵ�ֽӿڷ���, �õ��ݸ�����ʼ�
	public List<Mail> getDraftBoxMails(MailContext ctx) {
		//�ȴ����û���Ӧ��draft�еõ�ȫ����xml�ļ�
		return getMails(ctx, FileUtil.DRAFT);
	}

	@Override
	public List<Mail> getInBoxMails(MailContext ctx) {
		return getMails(ctx, FileUtil.INBOX);
	}
	
	//��xml�ļ�ת����Mail����, ������
	private List<Mail> convert(List<File> xmlFiles, MailContext ctx) {
		List<Mail> result = new ArrayList<Mail>();
		for (File file : xmlFiles) {
			//��xmlת����Mail����
			Mail mail = FileUtil.fromXML(ctx, file);
			result.add(mail);
		}
		sort(result);
		return result;
	}
	
	//����ʱ�併������
	private void sort(List<Mail> mails) {
		Collections.sort(mails, new MailComparator());
	}

	//ʵ�ֽӿڷ���, �õ��������е��ʼ�
	public List<Mail> getOutBoxMails(MailContext ctx) {
		return getMails(ctx, FileUtil.OUTBOX);
	}

	//ʵ�ֽӿڷ���, �õ��ѷ��͵��ʼ�
	public List<Mail> getSentBoxMails(MailContext ctx) {
		return getMails(ctx, FileUtil.SENT);
	}

	private List<Mail> getMails(MailContext ctx, String box) {
		List<File> xmlFiles = FileUtil.getXMLFiles(ctx, box);
		List<Mail> result = convert(xmlFiles, ctx);
		return result;
	}
}
