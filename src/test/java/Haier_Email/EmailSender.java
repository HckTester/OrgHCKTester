package Haier_Email;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailSender {
	
	private final String host;
	private final String port;
	private final String username;
	private final String password;

	public EmailSender(String host, String port, String username, String password) {
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public void sendEmailWithReport(List<String> recipients, String subject, String body
			) {
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.port", port);
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");

		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));

			// Set recipients
			for (String recipient : recipients) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			}

			message.setSubject(subject);

			Multipart multipart = new MimeMultipart();

			// Attach HTML report
			MimeBodyPart htmlPart = new MimeBodyPart();
			htmlPart.setContent(body, "text/html");
			multipart.addBodyPart(htmlPart);

			// Attach report file
//			MimeBodyPart attachmentPart = new MimeBodyPart();
//			attachmentPart.attachFile(Rportlink);
//			multipart.addBodyPart(attachmentPart);

			message.setContent(multipart);

			Transport.send(message);
			System.out.println("Email sent successfully!");
		} catch (Exception ex) {
			System.out.println("Error sending email: " + ex.getMessage());
		}
	}

	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
