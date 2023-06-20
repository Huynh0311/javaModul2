package collection_11.CountNumberOfString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi = scanner.nextLine();
        Map<String, Integer> stringMap = new HashMap<>();

        for (int i = 0; i < chuoi.length(); i++) {
            String key = chuoi.charAt(i)+"";
            if(stringMap.containsKey(key)){
                int count = stringMap.get(key);
                count++;
                stringMap.put(key, count);
            }else {
                stringMap.put(key, 1);
            }
        }
        Set<String> keys = stringMap.keySet();
        for(String key: keys){
            System.out.println(key+": " + stringMap.get(key));
        }
    }
}