package tunipharma.Test;

import java.io.*;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Date;

import javax.mail.*;

import javax.mail.internet.*;

import com.sun.mail.smtp.*;


public class SendEmail {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) throws Exception {
        Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.gmail.com");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("devils.tunipharma@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse("devils.tunipharma@gmail.com", false));
        msg.setSubject("Réclamation : "+System.currentTimeMillis());
        msg.setText("Corps du message test");
        msg.setHeader("X-Mailer", "By Sicateur");
        msg.setSentDate(new Date());
        SMTPTransport t =(SMTPTransport)session.getTransport("smtps");
        t.connect("smtp.gmail.com", "devils.tunipharma@gmail.com", "password?123");
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        System.out.println("message sent successfully....");
        t.close();
    }
}

