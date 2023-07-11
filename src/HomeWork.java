import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class HomeWork{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Смирнов", 5646564, bookPhone);
        addNumber("Сидоров", 1234244534, bookPhone);
        addNumber("Петров", 546545585, bookPhone);
        addNumber("Якубович", 895665477, bookPhone);
        addNumber("Смердящий", 123456789, bookPhone);
        addNumber("Чайковский", 987654321, bookPhone);
        printBook(bookPhone);
    }
}