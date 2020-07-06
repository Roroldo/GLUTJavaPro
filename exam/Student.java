package exam;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private double chinese;
    private double math;
    private double english;

    public Student(int id, String name, double chinese, double math, double english) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public double getSum() {
        return chinese + math + english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + getSum() +
                '}';
    }
}
