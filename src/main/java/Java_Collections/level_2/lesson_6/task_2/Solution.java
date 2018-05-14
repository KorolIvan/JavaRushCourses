package Java_Collections.level_2.lesson_6.task_2;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author Ivan Korol on 5/14/2018
 */
public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(byteArrayOutputStream.toByteArray());
        byte[] digist = messageDigest.digest();
        BigInteger integer = new BigInteger(1, digist);
        String md5HashString = integer.toString(16);
        while (md5HashString.length() < 32) {
            md5HashString = "0"+ md5HashString;
        }
        return md5HashString.equals(md5);
    }
}
