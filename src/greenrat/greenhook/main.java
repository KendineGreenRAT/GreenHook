package greenrat.greenhook;

import java.io.IOException;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException {
        System.out.println("   ____                     _   _             _      ____    ___  \n" +
                "  / ___|_ __ ___  ___ _ __ | | | | ___   ___ | | __ |___ \\  / _ \\ \n" +
                " | |  _| '__/ _ \\/ _ \\ '_ \\| |_| |/ _ \\ / _ \\| |/ /   __) || | | |\n" +
                " | |_| | | |  __/  __/ | | |  _  | (_) | (_) |   <   / __/ | |_| |\n" +
                "  \\____|_|  \\___|\\___|_| |_|_| |_|\\___/ \\___/|_|\\_\\ |_____(_)___/ \n" +
                "            ");
        Scanner input = new Scanner(System.in);
        String webhook,message;

        System.out.print("Webhook Belirtiniz: ");
        webhook = input.nextLine();

        System.out.print("Mesaj Giriniz: ");
        message = input.nextLine();





        DiscordWebhook webhooksender = new DiscordWebhook(webhook);
        webhooksender.setContent(message);
        webhooksender.setUsername("GreenHook 2.0");
        webhooksender.setAvatarUrl("https://i.im.ge/2022/08/20/OIo26M.GreenHook.png");
        webhooksender.setTts(true);
        webhooksender.execute();
    }

}

