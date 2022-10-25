import org.apache.commons.lang3.RandomStringUtils;

public class Generator {

    static String test;

    public static String getTwoSymName() {
        return RandomStringUtils.randomAlphabetic(2);
    }

    public static String getThreeSymName() {
        return RandomStringUtils.randomAlphabetic(3);
    }

    public static String getFourSymName() {
        return RandomStringUtils.randomAlphabetic(1) + " " + RandomStringUtils.randomAlphabetic(2);
    }

    public static String getFourSymStartWithSpaceName() {
        return " " + RandomStringUtils.randomAlphabetic(3);
    }

    public static String getFourSymEndWithSpaceName() {
        return RandomStringUtils.randomAlphabetic(3) + " ";
    }

    public static String getElevenSymName() {
        return RandomStringUtils.randomAlphabetic(5) + " " + RandomStringUtils.randomAlphabetic(5);
    }

    public static String getEighteenSymName() {
        return RandomStringUtils.randomAlphabetic(8) + " " + RandomStringUtils.randomAlphabetic(9);
    }

    public static String getNineteenSymName() {
        return RandomStringUtils.randomAlphabetic(19);
    }

    public static String getTwentySymName() {
        return RandomStringUtils.randomAlphabetic(20);
    }
}
