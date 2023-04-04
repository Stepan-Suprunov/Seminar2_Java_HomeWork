// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

package task;

import java.util.Arrays;

public class Task2 {
    public static void splitStrings() {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] my_split = json.split("},");
        String[] my_split_1 = new String[]{my_split[0]};
        String[] my_split_2 = new String[]{my_split[1]};
        String[] my_split_3 = new String[]{my_split[2]};
        String student_1 = my_split_1[0];
        String student_2 = my_split_2[0];
        String student_3 = my_split_3[0];
        student_1 = student_1.replace("[{\"фамилия\":\"", "Студент ");
        student_1 = student_1.replace("\",\"оценка\":\"", " получил ");
        student_1 = student_1.replace("\",\"предмет\":\"", " по предмету ");
        student_1 = student_1.replace('"', '.');
        System.out.println(student_1);
        student_2 = student_2.replace(" {\"фамилия\":\"", "Студент ");
        student_2 = student_2.replace("\",\"оценка\":\"", " получил ");
        student_2 = student_2.replace("\",\"предмет\":\"", " по предмету ");
        student_2 = student_2.replace('"', '.');
        System.out.println(student_2);
        student_3 = student_3.replace(" {\"фамилия\":\"", "Студент ");
        student_3 = student_3.replace("\",\"оценка\":\"", " получил ");
        student_3 = student_3.replace("\",\"предмет\":\"", " по предмету ");
        student_3 = student_3.replace("\"}]", ".");
        System.out.println(student_3);
    }
}
