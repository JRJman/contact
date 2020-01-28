import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    Person SUT;
    Person person;

    @Before
    public void setup(){
        SUT = new Person();
        person = new Person();
    }

    @Test
    public void getUserName_getUsername_checkName(){
        String result = SUT.getUserName();
        assertThat(result, is("Zenzo Arian"));
    }

    @Test
    public void isSamePerson_checkPerson_checkNames(){
        Boolean result = SUT.isSamePerson(person);
        assertThat(result, is(true));
    }

}
