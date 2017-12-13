package entities;

import entities.UserGroup.GROUP;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "getAllAdministrators", query = "SELECT s FROM Administrator s ORDER BY s.name")
public class Administrator extends User {
    
    public Administrator() {
    }

    public Administrator(String userName, String password, String name, String email) {
        super(userName, password, GROUP.Administrator, name, email);
    }

}
