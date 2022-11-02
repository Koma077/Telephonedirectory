import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    Map<String, Integer> telephoneDirectory = new HashMap<>();

    public Map<String, Integer> getTelephoneDirectory() {
        return telephoneDirectory;
    }

    public void addNumber(Contact contact){
        telephoneDirectory.put(contact.getName(), contact.getNumber());

    }
    @Override
    public String toString() {
        return "Телефонный справочкик: " + telephoneDirectory +
                '}';
    }
}
