package jupiter.demo.model;

import org.apache.logging.log4j.util.Strings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {

    @Id
    @GeneratedValue
    private int Id;
    private String Name;
    private String DOB;
    public user(int Id ,String Name,String DOB){
        super();
        this.Id = Id;
        this.Name = Name;
        this.DOB = DOB;
    }

    public user() {
    }

    public user(int Id) {
        Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
