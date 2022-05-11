import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            //Test działania lokalnego REST API
            String temp_url = "http://localhost/IS_LAB6_REST/cities/read/";
            Source source = new Source(temp_url);
            System.out.println("Wysyłanie zapytania...");
            source.sendRequest();
            System.out.println("Pobieranie odpowiedzi...");
            String s = source.getSource();
            System.out.println("Przetwarzanie danych...");
            City city = new City(s);
            city.getAllCities();
        } catch (Exception e) {
            System.err.println("Wystąpił nieoczekiwan błąd!!! ");
            e.printStackTrace(System.err);
        }
    }

}
