

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args)
            throws InvalidAlgorithmParameterException, IllegalBlockSizeException,
            NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {

        Test.givenString_whenEncrypt_thenSuccess();
    }
}
