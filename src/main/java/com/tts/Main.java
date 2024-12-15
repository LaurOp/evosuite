package com.tts;

public class Main {
    public static void main(String[] args) {
        Inbox myInbox = new Inbox();

        myInbox.addMail(new Mail("alice@example.com", "me@example.com", "Meeting Reminder", "Don't forget the meeting at 10 AM."));
        myInbox.addMail(new Mail("bob@example.com", "me@example.com", "Greetings", "Hope you're doing well!"));
        myInbox.addMail(new Mail("charlie@example.com", "me@example.com", "Weekly Update", "Here's the weekly update."));

        System.out.println(myInbox);

        System.out.println("Unread Mails:");
        for (Mail mail : myInbox.getUnreadMails()) {
            System.out.println(mail);
        }

        myInbox.markAllAsRead();
        System.out.println("\nAfter marking all as read:");
        System.out.println(myInbox);
    }
}