package B_Orange.uno;

import java.time.LocalDateTime;

public class Log {
    private long id ;
    private String title;
    private String description ;
    private long accountID;
    private LocalDateTime when = LocalDateTime.now();

    public Log() {
    }

    public Log(long id, String title, String description, long accountID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.accountID = accountID;
    }

    public Log(long id, String title, String description, long accountID, LocalDateTime when) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.accountID = accountID;
        this.when = when;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", accountID=" + accountID +
                ", when=" + when +
                '}';
    }
}
