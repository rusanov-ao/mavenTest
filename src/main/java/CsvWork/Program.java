package CsvWork;

import com.opencsv.*;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //String[] employee = "1,David,Miller,Australia,30".split(",");
        
//        try (CSVWriter writer = new CSVWriter(new FileWriter("staff.csv"))) {
//            writer.writeNext(employee);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

//        try (CSVReader reader = new CSVReader(new FileReader("staff.csv"))) {
//            String[] nextLine;
//            while ((nextLine = reader.readNext()) != null) {
//                System.out.println(Arrays.toString(nextLine));
//            }
//        } catch (IOException | CsvValidationException ex) {
//            ex.printStackTrace();
//        }

//        try (CSVReader reader = new CSVReader(new FileReader("staff.csv"))) {
//            List<String[]> allRows = reader.readAll();
//
//            for (String[] row : allRows) {
//                System.out.println(Arrays.toString(row));
//            }
//        } catch (IOException | CsvException ex) {
//            ex.printStackTrace();
//        }


//        String[] employee = "2,David,Freezon,USA,40".split(",");
//
//        try (CSVWriter writer = new CSVWriter(new FileWriter("staff.csv", true))) {
//            writer.writeNext(employee);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        CSVParser parser = new CSVParserBuilder()
                .withSeparator('|')
                .build();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader("staff2.csv"))
                .withCSVParser(parser)
                .build()) {
            String[] nextLine;

            while ((nextLine = reader.readNext()) !=null) {
                System.out.println(Arrays.toString(nextLine));
            }
        } catch (IOException | CsvValidationException ex) {
            ex.printStackTrace();
        }
    }
}
