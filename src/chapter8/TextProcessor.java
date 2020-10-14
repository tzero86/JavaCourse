package chapter8;

public class TextProcessor {

    public static void main(String[] arg){
        countWords("I Love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!I'mElias");
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for(int i=0; i< modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.print(modifiedText);
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        System.out.printf("Your text contains %d words. %n", numberOfWords);
        for (String word : words){
            System.out.println(word);
        }
    }

    public static void reverseString(String text){
        for (int i= text.length()-1; i>=0;i--){
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }
}
