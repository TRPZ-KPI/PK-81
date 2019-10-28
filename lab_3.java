import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        int Number = 7111;
        int C3 = Number%3;
        int C17 = Number%17;

        System.out.println("Number = " + Number);
        System.out.println("C3 = " + C3);
        System.out.println("C17 = " + C17);

        // Надрукувати слова без повторень заданого тексту в алфавітному порядку за першою літерою.
        // StringBuffer

        String text = "В3 А1 Г4 Б2 А1 Б2 Д5";
        StringBuffer inputData = new StringBuffer(text);
        StringBuffer outputData = new StringBuffer();
        ArrayList<String> words = new ArrayList<>();

        for(String word : inputData.toString().split(" ")){
            words.add(word);
        }

        Collections.sort(words);

        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
            for(int j = 1; j < words.size(); j++){
                if(words.get(j) == words.get(i)){
                    System.out.println(words.get(j));
                    words.remove(j);
                }
                else{
                    continue;
                }
            }
            outputData.append(words.get(i)).append(" ");
        }
        System.out.print(outputData.toString());

    }
}