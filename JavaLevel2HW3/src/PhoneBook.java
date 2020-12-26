import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phonebook=new HashMap<>();
    private List<String>phone_number_list;

    public void add(String surname, String phone_number) {
        if (phonebook.containsKey(surname)) {
            phone_number_list = phonebook.get(surname);
            phone_number_list.add(phone_number);
            phonebook.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phonebook.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phonebook.get(surname);
    }

}
