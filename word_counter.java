import java.util.*;
public class word_counter {
    String line;
    public word_counter(String line){
        this.line=line;
    }
    void WordSplitter(String line){
        String [] words=line.split("\\s");
        wordCounter(words);
        System.out.println();
        HashSet <String> word2=new HashSet<>();
        for(String g:words){
            int count=CountOccurance(words, g);
            if(word2.contains(g)){
                continue;
            }
            word2.add(g);
            if(count>1){
                System.out.println("The word '"+g+"' has been used "+CountOccurance(words, g));
            }
        }
    }
    public void wordCounter(String[]words){
        int count=0;
        for(String word:words){
            System.out.println(word);
            count++;
        }
        System.out.println();
        System.out.println("Total Words: "+count);
    }
    public int CountOccurance(String [] words,String word){
        int count=0;
        for(String word1:words){
                if(word1.equals(word)){
                    count++;
                }
        }
        return count;
    }
    public void wordrepeat(String[]words){
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Sentence: ");
        String line=sc.nextLine();
        if(line==""){
            System.out.println("Invalid Input!!!");
        }
        else{
            System.out.println();
        word_counter w=new word_counter(line);
        w.WordSplitter(line);
        }
        System.out.println();
        sc.close();
    }
}
