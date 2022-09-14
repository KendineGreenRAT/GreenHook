package greenrat.greenhook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException{

        JTextField webhookgirdisi = new JTextField("Webhook");
        webhookgirdisi.setBounds(200, 50, 100, 25);
        JTextField messagegirdisi = new JTextField("Message");
        messagegirdisi.setBounds(200, 100, 100, 25);
        JTextField usernamegirdisi = new JTextField("Username");
        usernamegirdisi.setBounds(200, 150, 100, 25);
        JTextField avatargirdisi = new JTextField("Avatar URL");
        avatargirdisi.setBounds(200, 200, 100, 25);
        JButton sendmessage = new JButton("Gönder");
        sendmessage.setBounds(200, 250, 100, 25);

        JFrame mainwindow = new JFrame("GreenHook 3.0");
        mainwindow.setVisible(true);
        mainwindow.setResizable(true);
        mainwindow.setLayout(null);
        mainwindow.setSize(500, 600);
        mainwindow.getContentPane().setBackground(Color.darkGray);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.add(webhookgirdisi);
        mainwindow.add(messagegirdisi);
        mainwindow.add(usernamegirdisi);
        mainwindow.add(avatargirdisi);
        mainwindow.add(sendmessage);

        sendmessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        DiscordWebhook webhooksender = new DiscordWebhook(webhookgirdisi.getText());
                        webhooksender.setContent(messagegirdisi.getText());
                        webhooksender.setUsername(usernamegirdisi.getText());
                        webhooksender.setAvatarUrl(avatargirdisi.getText());
                        webhooksender.setTts(true);
                        webhooksender.execute();
                    } catch (IOException ex) {
                        System.out.println("ERROR: Webhook Geçersiz.");
                    }

            }
        });
    }
}
