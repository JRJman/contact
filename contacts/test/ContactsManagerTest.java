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
        person.name = "Zenzo Arian";
        person.email = "25453.ma-web.nl";
        person.phoneNumber = "12345678";
    }

    @Test
    public void addContact_addPerson_checkName(){
        SUT.addContact(person);
        String result = SUT.myFriends[0].name;
        assertThat(result, is(person.name));
    }

    @Test
    public void addContact_addPerson_checkPhoneNumber(){
        SUT.addContact(person);
        String result = SUT.myFriends[0].phoneNumber;
        assertThat(result, is(person.phoneNumber));
    }
}
