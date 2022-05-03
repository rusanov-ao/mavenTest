package CsvStudy;

import com.opencsv.CSVReader;
import com.opencsv.bean.*;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        try (CSVReader csvReader = new CSVReader(new FileReader("staff.csv"))) {
//            ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
//            strategy.setType(Employee.class);
//            strategy.setColumnMapping("id", "firstName", "lastName", "country", "age");
//
//            CsvToBean<Employee> csv = new CsvToBeanBuilder<Employee>(csvReader)
//                    .withMappingStrategy(strategy)
//                    .build();
//
//            List<Employee> staff = csv.parse();
//            staff.forEach(System.out::println);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee(1, "Nikita", "Shumskii", "Russia", 25));
        staff.add(new Employee(2, "Pavel", "Shramko", "Russia", 23));

        ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Employee.class);
        strategy.setColumnMapping("id", "firstName", "lastName", "country", "age");

        try (Writer writer = new FileWriter("staff.csv")) {
            StatefulBeanToCsv<Employee> sbc = new StatefulBeanToCsvBuilder<Employee>(writer)
                    .withMappingStrategy(strategy)
                    .build();
            sbc.write(staff);
        } catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }
    }
}
