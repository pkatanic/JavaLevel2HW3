import java.util.*;

public class UniqueList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple","IBM","Commodore","IBM","Intel","AMD","Microsoft","Apple");
        System.out.printf("\n====== Первоначальный список: %s%n",stringList);

        sortList(stringList);
        Set<String> uniqueWords = new HashSet<String>(stringList);
        for(String word : uniqueWords){
            System.out.println(word + ": " + Collections.frequency(stringList,word));
        }

    }
    public static void sortList(List<String> myList){

        Set<String>hashSetList = new HashSet<String>(myList);
        System.out.printf("\n====== Уникальные значения с использованием HashSet: %s", hashSetList);

        Set<String> treeSetList = new TreeSet<String>(myList);
        System.out.printf("\n====== Уникальные значения с использованием TreeSet: %s", treeSetList);
    }

}
