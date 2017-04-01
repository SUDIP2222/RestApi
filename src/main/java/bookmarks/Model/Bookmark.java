package bookmarks.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by sudip sarker on 4/1/2017.
 */
@Entity
public class Bookmark {
    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private long id;

    public String uri;
    public String description;

    public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }

    Bookmark(){

    }

    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }
}
