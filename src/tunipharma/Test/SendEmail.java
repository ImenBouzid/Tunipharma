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
        msg.setFrom(new InternetAddress("sicateur@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse("sicateur@gmail.com", false));
        msg.setSubject("Object : "+System.currentTimeMillis());
        msg.setText("Corps du message test");
        msg.setHeader("X-Mailer", "By Sicateur");
        msg.setSentDate(new Date());
        SMTPTransport t =
            (SMTPTransport)session.getTransport("smtps");
        t.connect("smtp.gmail.com", "abderrahim.slim@esprit.tn", "----mdp_sica---");
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        System.out.println("message sent successfully....");
        t.close();
    }
}
/*public class SendEmail
{
 public static void main(String [] args){
      String to = "sicateur@gmail.com";//change accordingly
      String from = "admin@gmail.com";//change accordingly
      String host = "localhost";//or IP address

     //Get the session object
      Properties properties = System.getProperties();
      properties.setProperty("mail.smtps.host", "smtp.gmail.com");
      //properties.put("mail.smtps.host","smtp.gmail.com");
      Session session = Session.getDefaultInstance(properties);

     //compose the message
      try{
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
         message.setSubject("Ping");
         message.setText("Hello, this is example of sending email  ");

         // Send message
         Transport.send(message);
         System.out.println("message sent successfully....");

      }catch (MessagingException mex) {mex.printStackTrace();}
   }*/
