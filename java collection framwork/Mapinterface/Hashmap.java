import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, String> numbers = new HashMap<>();
        numbers.put("in", "India");
        numbers.put("in", "India2");
        numbers.put("UsA", "United States Of America");
        numbers.put("uk", "United Kingdom");
        numbers.put("fr", "France");
        numbers.put("ge", "Germany");
        System.out.println(numbers);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");
        System.out.println("before" + table);
        table.putAll(numbers);
        System.out.println("After" +table);
        table.putIfAbsent("us", "United States");
        System.out.println("After putIfAbsent" +table);
        System.out.println(table.get("UsA"));
        System.out.println(table.getOrDefault("ges", "canot find"));
        System.out.println(table.containsKey("ge"));
        System.out.println(table.containsValue("Germany"));
        table.replace("in", "indiapapa");
        System.out.println("after repacing"+table);
        table.replace("in", "indiapapa", "Amit");
        System.out.println("after repacing"+table);
        Set<String> keyset =table.keySet();
        System.out.println(keyset);
        Collection<String> value=table.values();
        System.out.println(value);
        Set<Map.Entry<String,String>> entryset=table.entrySet();
        System.out.println(entryset);

        for(Map.Entry<String,String> entry:entryset)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        // table.putIfAbsent("in", "amit");
        // System.out.println(table);



        //deletion
        // table.remove("in");
        // System.out.println("After deletion" +table);
        // System.out.println(table.size());
        // table.clear();
        // System.out.println("After clearing" +table);
        // System.out.println(table.size());

    }
}
