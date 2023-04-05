package task;

public class Task2stringBuilder {
    public static void StringBuilder() {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] my_split = json.split("},");
        String[] my_split_1 = new String[]{my_split[0]};
        String[] my_split_2 = new String[]{my_split[1]};
        String[] my_split_3 = new String[]{my_split[2]};
        StringBuilder student_1 = new StringBuilder(my_split_1[0]);
        StringBuilder student_2 = new StringBuilder(my_split_2[0]);
        StringBuilder student_3 = new StringBuilder(my_split_3[0]);
        student_1.replace(0, 13, "Студент ");
        student_1.replace(14, 26, " получил ");
        student_1.replace(24, 37, " по предмету ");
        student_1.replace(47, 48, ".");
        System.out.println(student_1);
        student_2.replace(0, 13, "Студент ");
        student_2.replace(14, 27, " получил ");
        student_2.replace(24, 37, " по предмету ");
        student_2.replace(48, 49, ".");
        System.out.println(student_2);
        student_3.replace(0, 13, "Студент ");
        student_3.replace(15, 27, " получил ");
        student_3.replace(25, 38, " по предмету ");
        student_3.replace(44, 47, ".");
        System.out.println(student_3);
    }
}
