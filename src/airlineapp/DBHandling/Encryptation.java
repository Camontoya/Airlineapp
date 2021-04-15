package airlineapp.DBHandling;

import airlineapp.Authentication.iAuthentication;
import static airlineapp.DBHandling.DBManagement.*;
import airlineapp.Authentication.userValidation;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Encryptation implements iAuthentication {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    public void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-256");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        }
    }

    public String encrypt(String strToEncrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public String decrypt(String strToDecrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    public String generateEncryptedPassword(String email, String password) {
        if (!userValidation.isWorker(email)) {
            String secretKey = generateSecretKeyU(email);
            String encryptedPassword = encrypt(password, secretKey);
            return encryptedPassword;
        } else {
            String secretKey = generateSecretKeyW(email);
            String encryptedPassword = encrypt(password, secretKey);
            return encryptedPassword;
        }
    }

    @Override
    public String generateSecretKeyU(String userEmail) {
        try {
            CallableStatement s = userRetrieve(userEmail);
            return "" + s.getString("out_user_id").charAt(0)
                    + s.getString("out_name").charAt(0)
                    + s.getString("out_last_name").charAt(0);
        } catch (SQLException ex) {
            System.err.println("There was an issue running the stored procedure."
                    + "\n Issue description: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public String generateSecretKeyW(String workerEmail) {
        System.out.println("Entering here!");
        try {
            CallableStatement s = workerRetrieve(workerEmail);
            return "" + s.getString("out_worker_id").charAt(0)
                    + s.getString("out_name").charAt(0)
                    + s.getString("out_last_name").charAt(0);
        } catch (SQLException ex) {
            System.err.println("There was an issue running the stored procedure."
                    + "\n Issue description: " + ex.getMessage());
        }
        return null;
    }
}
