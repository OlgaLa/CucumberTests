package helpers;

import java.util.UUID;

public class TestUtils {

    public String generateRandomEmail() {
        return UUID.randomUUID().toString().substring(0,8)+"@gmail.com";
    }
}
