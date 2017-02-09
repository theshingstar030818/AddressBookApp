package app.addressBook; /**
 * Created by tanzeelrana on 2/2/2017.
 */

import app.buddyInfo.BuddyInfo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        if(buddyInfo != null){
            this.buddies.add(buddyInfo);
        }
    }

    public int getSize(){
        return this.buddies.size();
    }

}