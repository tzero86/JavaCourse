package chapter12;

import java.util.Map;

public class GradesCorrection {
    public static void main(String[] arg){

        Map<String, Integer> oldGrades = TestResults.getOriginalGrades();
        Map<String, Integer> newGrades = TestResults.getMakeUpGrades();

        for (var student : newGrades.entrySet()){
            if (newGrades.get(student.getKey()) > oldGrades.get(student.getKey())){
                oldGrades.put(student.getKey(),newGrades.get(student.getKey()));
            }
            System.out.println("Student: " + student.getKey() + ", Grade:" + oldGrades.get(student.getKey()));
        }

    }
}
