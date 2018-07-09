import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RandomNameTest {

    RandomName randomName;

    @Before
    public void setUp(){
        randomName = new RandomName();
    }

    @Test
    public void startsWithNames(){
        assertEquals(18, randomName.getClassNames().size());
    }

    @Test
    public void getOneName(){
        assertEquals(1, randomName.oneName().size());
    }

    @Test
    public void getTwoNames(){
        assertEquals(2, randomName.twoNames().size());
    }

    @Test
    public void getThreeName(){
        assertEquals(3, randomName.threeNames().size());
    }

    @Test
    public void getFourName(){
        assertEquals(4, randomName.fourNames().size());
    }

    @Test
    public void twoRandomNames(){
        ArrayList<String> names = randomName.twoNames();
        assertNotEquals(names.get(0), names.get(1));
    }

    @Test
    public void notEnoughNames(){
        randomName.populateTest();
        assertEquals(3, randomName.fourNames().size());
    }

}
