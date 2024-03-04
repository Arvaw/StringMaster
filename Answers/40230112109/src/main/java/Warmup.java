public class Warmup {
    public String wordFinder(String sentence, int number) {
            //To have words and search in array
            String[] words = sentence.split(" ");
            if (number > 0 && number <= words.length) {
                //Arrays start at 0
                return words[number - 1];
            } else {
                return " Number = "+String.valueOf(number)+" is out Of Bound";
            }
        }



    public int oddEvenCounter(String number, boolean searchForEven) {
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (searchForEven && number.charAt(i) % 2 == 0){
                count++;
            }
            else if (!searchForEven && number.charAt(i) % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public String firstWord(String wordA, String wordB) {
        String temp;
        if (wordA.length() > wordB.length()){
            temp = String.copyValueOf(wordA.toCharArray());
            wordA = String.copyValueOf(wordB.toCharArray());
            wordB = String.copyValueOf(temp.toCharArray());
        }
        for (int i = 0; i < wordA.length(); i++){
            if ((int)wordA.charAt(i) == (int)wordB.charAt(i))
                continue;
            else if((int)wordA.charAt(i) < (int)wordB.charAt(i))
                return wordA;
            else
                return wordB;
        }
        return wordA;
    }
}
