

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


public class Test {
    static void givenString_whenEncrypt_thenSuccess()
            throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException,
            BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException {

        String input = "Arish is a gandu";
        SecretKey key = Generator.generateKey(128);
        IvParameterSpec ivParameterSpec = Iv.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";

        String cipherText = Encrypt.encrypt(algorithm, input, key, ivParameterSpec);
        String plainText = Decrypt.decrypt(algorithm, cipherText, key, ivParameterSpec);


        System.out.println(input);
        System.out.println(algorithm);
        System.out.println(cipherText);
        System.out.println(plainText);
    }


//    final String secretKey = "ssshhhhhhhhhhh!!!!";
//
//    String originalString = "howtodoinjava.com";
//    String encryptedString = Encrypt.encrypt(originalString, secretKey) ;
//    String decryptedString = Decrypt.decrypt(encryptedString, secretKey) ;
//
//System.out.println(originalString);
//System.out.println(encryptedString);
//System.out.println(decryptedString);

}
