import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
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
        Contact search = SUT.searchContact(person.getName());
        String result = search.getName();
        assertThat(result, is(person.getName()));
    }

    @Test
    public void addContact_addPerson_checkPhoneNumber(){
        SUT.addContact(person);
        Contact search = SUT.searchContact(person.getName());
        String result = search.getPhoneNumber();
        assertThat(result, is(person.getPhoneNumber()));
    }
}
