package com.tts;
import java.util.ArrayList;
import java.util.List;

class Inbox {
    private List<Mail> mails;

    public Inbox() {
        this.mails = new ArrayList<>();
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> getAllMails() {
        return new ArrayList<>(mails);
    }

    public List<Mail> getUnreadMails() {
        List<Mail> unreadMails = new ArrayList<>();
        for (Mail mail : mails) {
            if (!mail.isRead()) {
                unreadMails.add(mail);
            }
        }
        return unreadMails;
    }

    public void markAllAsRead() {
        for (Mail mail : mails) {
            mail.markAsRead();
        }
    }

    @Override
    public String toString() {
        StringBuilder inboxContent = new StringBuilder("Inbox:\n");
        for (Mail mail : mails) {
            inboxContent.append(mail.toString()).append("\n\n");
        }
        return inboxContent.toString();
    }
}
