import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int newArr[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            newArr[arr.length-i-1]=arr[i];
        }
        return newArr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int biggest=-999999;
        int biggestPos=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>biggest){
                biggest=arr[i];
                biggestPos=i;
            }
        }
        System.out.println(biggest);
        System.out.println(biggestPos);
        arr[biggestPos]=-999999;
        biggest=-9999999;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>biggest){
                biggest=arr[i];
                biggestPos=i;
            }
        }
        return(biggest);
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        for(String x:dictionary){
            if (x.equals(word)){
                return true;
            }
        }
        // REPLACE WITH YOUR CODE HERE
        return false;
    }


    public static void main(String[] args) {
        System.out.println(secondLargest(new int []{1,2,3,4,5}));
    }
}
