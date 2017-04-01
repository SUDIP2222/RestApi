package bookmarks.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sudip sarker on 4/1/2017.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private long id;

    @JsonIgnore
    public String password;
    public String username;



    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    Account() { // jpa only
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();

    public Set<Bookmark> getBookmarks(){
        return bookmarks;
    }






}
