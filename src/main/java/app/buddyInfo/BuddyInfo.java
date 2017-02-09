package app.buddyInfo; /**
 * Created by tanzeelrana on 2/2/2017.
 */

import javax.persistence.*;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BuddyInfo(String firstName, String lastName, String phoneNum){
        if(firstName != null){
            this.firstName = firstName;
        }

        if(lastName != null){
            this.lastName = lastName;
        }

        if(phoneNum != null){
            this.phone = phoneNum;
        }
    }
}

