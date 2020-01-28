import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class ContactsManagerTest {

    ContactsManager SUT;
    Contact person;

    @Before
    public void setup(){
        SUT = new ContactsManager();
        person = new Contact();
    }

    @Test
    public void addContact_addPerson_checkName(){
        SUT.addContact(person);
        String result = SUT.myFriends[0].getName();
        assertThat(result, is(person.getName()));
    }

    @Test
    public void addContact_addPerson_checkPhoneNumber(){
        SUT.addContact(person);
        String result = SUT.myFriends[0].getPhoneNumber();
        assertThat(result, is(person.getPhoneNumber()));
    }
}
