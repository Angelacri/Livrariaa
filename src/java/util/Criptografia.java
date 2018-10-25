package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

    public static String convertPasswordToMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));
        return String.format("%32x", hash);
    }
//    public boolean comparaPasswordToMD5(String password){
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        if()
//    }

    public static String convertPasswordTomMDS(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
