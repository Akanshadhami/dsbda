import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5{
    public static String getmd(String input){
       
       try{ MessageDigest md=MessageDigest.getInstance("Md5");
        byte[] messageDigest=md.digest(input.getBytes());
        BigInteger no=new BigInteger(1,messageDigest);
        String hashtext=no.toString(16);
        while(hashtext.length()<32){
            hashtext="0"+hashtext;
        }
        return hashtext;

    }
    catch (NoSuchAlgorithmException e){
        throw  new RuntimeException(e);
    }
    }

    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        String s="informationsecurity";
        System.out.println("original text is:"+s);
        System.out.println("encriped text is:" +getmd(s));

    }
}