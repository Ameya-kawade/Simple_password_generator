
import java.util.Random;
public class Password_generator {

    public static void main(String[]args){

        Random rand=new Random();
        char sr[]=new char[10];
        for (int i=0;i<10;i++){
            sr[i]=(char)('a'+ rand.nextInt(1,30));
        }

        System.out.println(sr);
        }


    }



