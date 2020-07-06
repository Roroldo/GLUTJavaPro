package exam;

import java.io.*;
import java.util.Scanner;

public class StoreStudents {
    public static void main(String[] args) {
        File file = new File("STUDENT.DAT");
        Scanner in = new Scanner(System.in);
        int count = 5;
        Student stu = null;
        ObjectOutputStream ois = null;
        try {
            ois = new ObjectOutputStream(new FileOutputStream(file));
            System.out.println("请依次输入5位学生的学号、姓名、语文成绩、数学成绩和英语成绩：");
            for (int i = 0; i < count; i++) {
                int id = in.nextInt();
                String name = in.next();
                double chinese = in.nextDouble();
                double math = in.nextDouble();
                double english = in.nextDouble();
                stu = new Student(id, name, chinese, math, english);
                ois.writeObject(stu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            in.close();
        }
    }
}
