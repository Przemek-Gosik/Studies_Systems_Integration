import org.json.JSONArray;
import org.json.JSONObject;

public class City {
    private String source;
    private JSONObject json;
    private JSONArray receivedData;
    City(String source){
        this.source=source;
        this.json= new JSONObject(source);
        this.receivedData= (JSONArray) json.get("cities");
    }
    public void getAllCities(){
        receivedData.forEach (item ->{
            JSONObject obj =(JSONObject) item;
            System.out.print("City name: ");
            System.out.print(obj.get("Name"));
            System.out.print(", Population: ");
            System.out.print(obj.get("Population"));
            System.out.print(", CountryCode: ");
            System.out.print(obj.get("CountryCode"));
            System.out.print(", District: ");
            System.out.print(obj.get("District"));
            System.out.print("\n");
        });

    }

}
