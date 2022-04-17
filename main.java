package Four;

import java.util.*;

public class main {
    public static void main(String[] args) {
        main.RandomWord();

        TelephoneBook pb = new TelephoneBook();

        pb.add("Murzulkin", "1234567");
        pb.add("Redkin", "2345678");
        pb.add("Chapolinin", "3456789");
        pb.add("Redkin", "4325678");

        System.out.println(pb.get("Redkin"));
    }


    public static void RandomWord() {

        String[] word = {"firstname", "fathername", "hometelephone", "index", "worktelephone", "lastname",
                "town", "country", "coordinate", "wife", "childrens", "money"};

        System.out.print("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        Integer m = scan.nextInt();

        String[] wordrandom = new String[m];
        Random rndwrd = new Random();

        for (int i = 0; i < wordrandom.length; i++) {
            wordrandom[i] = word[rndwrd.nextInt(word.length)];
        }
        System.out.println("Массив из слов сожержит следующие слова: " + Arrays.asList(wordrandom));

        Set<String> wordrandomUnique = new HashSet<>(Arrays.asList(wordrandom));
        System.out.println("Список слов, которые были взяты для массива: " + wordrandomUnique);
        Map<String, Integer> wordrandomRepeat = new HashMap<>();

        for (String words : wordrandom) {
            if (wordrandomRepeat.containsKey(words)) {
                wordrandomRepeat.put(words, wordrandomRepeat.get(words) + 1);
            } else {
                wordrandomRepeat.put(words, 1);
            }
        }
        System.out.println("Список слов и сколько раз они участвовали в массиве: " +  wordrandomRepeat);
    }


}
