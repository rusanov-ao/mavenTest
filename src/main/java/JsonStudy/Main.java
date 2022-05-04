package JsonStudy;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.management.OperationsException;
import javax.xml.transform.stream.StreamResult;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
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


        // чтение отдельных элементов
//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(new FileReader("data.json"));
//            JSONObject jsonObject = (JSONObject) obj;
//
//            String lastName = (String) jsonObject.get("lastName");
//            System.out.println(lastName);
//
//            JSONObject address = (JSONObject) jsonObject.get("address");
//            String streetAddress = (String) address.get("streetAddress");
//            System.out.println(streetAddress);
//
//            JSONArray phoneNumbers = (JSONArray) jsonObject.get("phoneNumbers");
//            for (Object number : phoneNumbers) {
//                System.out.println(number);
//            }
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }


        // создать json и записать в него
//        JSONObject obj = new JSONObject();
//        obj.put("name", "mkyong.com");
//        obj.put("age", 100);
//        obj.put("boolean", true);
//        obj.put("booleanString", "true");
//        obj.put("null", null);
//        obj.put("nullString", "null");
//
//        JSONArray list = new JSONArray();
//        list.add("msg 1");
//        list.add("msg 2");
//        list.add("msg 3");
//
//        obj.put("message", list);
//
//        try (FileWriter file = new FileWriter("new_data.json")) {
//            file.write(obj.toJSONString());
//            file.flush(); // гарантия что буфер будет записан
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // сериализация
//        Cat cat = new Cat();
//        cat.name = "Матроскин";
//        cat.age = 5;
//        cat.color = Color.blue.getRGB();
//
//        GsonBuilder builder = new GsonBuilder();
//        Gson gson = builder.create();
//        System.out.println(gson.toJson(cat));


        // десерелизация
        String jsonText = "{\"name\":\"Мурзик\",\"color\":-16777216,\"age\":9}";

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Cat cat = gson.fromJson(jsonText, Cat.class);
        System.out.println("Имя: " + cat.name + "\nВозраст: " + cat.age + "\nЦвет: " + cat.color);
    }
}
