import java.util.Scanner;
public class countSpaces {

  
    public static void main(String[] args){
       
       String MoviePhrase;
        MoviePhrase = "If you let my daughter go now, that'll be the end of it. I will not look for you, I will not pursue you. But if you don't, I will look for you, I will find you, and I will kill you.";
        String data[];
        int spaces=0;
        data = MoviePhrase.split("");
        for (String data1 : data) {
            if (data1.equals(" ")) {
                spaces++;
            }
        }
        System.out.println("the phrase has "+ spaces + " spaces");
    
}
