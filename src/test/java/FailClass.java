import org.junit.Test;

import static org.junit.Assert.fail;

public class FailClass {


    @Test
    public void this_should_fail(){
        fail();
    }

    @Test
    public void this_should_fail_too(){
        fail();
    }




}
