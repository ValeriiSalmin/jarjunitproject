import org.junit.Assert;
import org.junit.Test;

public class Tests {

    private Pet pet = new Pet();

    @Test
    public void checkSum(){
        System.out.println("!Start test!");
        Assert.assertEquals(pet.sum(2,3), 5);
        System.out.println("!Finish test!");
    }
}
