import java.util.Random;

public class AlphanumericGenerator{
    String IDGenerator(int lengthOfID){
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder s = new StringBuilder(lengthOfID);

        int i;
        for (i = 0; i < lengthOfID; i ++){
            int ch = (int)(str.length()*Math.random()); //generates a random number using Math.random()
            s.append(str.charAt(ch)); //adds a random character one by one at the end of s
        }
    return s.toString();
    }
}
