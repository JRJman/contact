import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    Book SUT;

    @Before
    public void setup(){
        SUT = new Book("Dien with derpress", "Zenzo Arian");
    }

    @Test
    public void borrowBook_borrowABook_returnTrue(){
        SUT.borrowBook();
        Boolean result = SUT.isBookBorrowed();
        assertThat(result, is(true));
    }

    @Test
    public void returnBook_returnABook_returnFalse(){
        SUT.returnBook();
        Boolean result = SUT.isBookBorrowed();
        assertThat(result, is(false));
    }

    @Test
    public void isBookBorrowed_returnABook_returnFalse(){
        SUT.returnBook();
        Boolean result = SUT.isBookBorrowed();
        assertThat(result, is(false));
    }
}
