package JsonStudy;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.transform.stream.StreamResult;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //чтение json
//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(new FileReader("data.json"));
//            JSONObject jsonObject = (JSONObject) obj;
//            System.out.println(jsonObject);
//        } catch (IOException | ParseException ex) {
//            ex.printStackTrace();
//        }

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("data.json"));
            JSONObject jsonObject = (JSONObject) obj;

            String lastName = (String) jsonObject.get("lastName");
            System.out.println(lastName);

            JSONObject address = (JSONObject) jsonObject.get("address");
            String streetAddress = (String) address.get("streetAddress");
            System.out.println(streetAddress);

            JSONArray phoneNumbers = (JSONArray) jsonObject.get("phoneNumbers");
            for (Object number : phoneNumbers) {
                System.out.println(number);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
