package app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner extends Customer {

    @Id
    String username;

    @Column
    private String password;

    @Column
    int ownerId;

    public Owner(){

    }

    public Owner(String username, String password, int ownerId){
        this.username = username;
        this.password = password;
        this.ownerId = ownerId;
    }

    public void setUsername(String username) { this.username = username; }

    public void setPassword(String password) { this.password = password; }

    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public int getOwnerId() { return ownerId; }

}
