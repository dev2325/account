import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void checkNameTwoSymThanFalse(){
        Account account = new Account(Generator.getTwoSymName());
        System.out.println(account.toString());
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameThreeSymThanFalse(){
        Account account = new Account(Generator.getThreeSymName());
        System.out.println(account.toString());
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameFourSymThanTrue(){
        Account account = new Account(Generator.getFourSymName());
        System.out.println(account.toString());
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameFourSymStartWithSpaceThanFalse(){
        Account account = new Account(Generator.getFourSymStartWithSpaceName());
        System.out.println(account.toString());
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameFourSymEndWithSpaceThanFalse(){
        Account account = new Account(Generator.getFourSymEndWithSpaceName());
        System.out.println(account.toString());
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameElevenSymThanTrue(){
        Account account = new Account(Generator.getElevenSymName());
        System.out.println(account.toString());
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameEighteenSymThanTrue(){
        Account account = new Account(Generator.getEighteenSymName());
        System.out.println(account.toString());
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameNineteenSymThanFalse(){
        Account account = new Account(Generator.getNineteenSymName());
        System.out.println(account.toString());
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameTwentySymThanFalse(){
        Account account = new Account(Generator.getTwentySymName());
        System.out.println(account.toString());
        Assert.assertFalse(account.checkNameToEmboss());
    }
}
