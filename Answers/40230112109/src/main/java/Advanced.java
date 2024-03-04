import java.lang.reflect.Array;

public class Advanced {
    public String wordCensor(String sentence, String word, String newWord){
        StringBuilder answer = new StringBuilder();
        String[] temp = sentence.split(" ");
        for (int i = 0; i < temp.length; i++){
            if (temp[i].equals(word)){
                answer.append(newWord).append(" ");
            }
            else
                answer.append(temp[i]).append(" ");
        }
        return answer.toString().trim();
    }

    public String normalizingName(String firstName, String lastName){
        StringBuilder fullName = new StringBuilder();
        fullName.append(Character.toUpperCase(firstName.charAt(0)));
        for (int i = 1; i < firstName.length(); i++){
            fullName.append(Character.toLowerCase(firstName.charAt(i)));
        }
        fullName.append(" ");
        fullName.append(Character.toUpperCase(lastName.charAt(0)));
        for (int i = 1; i < lastName.length(); i++){
            fullName.append(Character.toLowerCase(lastName.charAt(i)));
        }
        return fullName.toString().trim();
    }
    public String doubleChar(String word) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length() - 1; i++){
            if (word.charAt(i) == word.charAt(i+1)){
                continue;
            }
            else {
                newWord.append(word.charAt(i));
            }
        }
        return newWord.append(word.charAt(word.length() - 1)).toString();
    }
}

