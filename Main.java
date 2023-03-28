import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<person> list = new ArrayList<>();
        list.add(new student("logica", "012378", 3.4));
        list.add(new student("a", "0456562", 2.5));
        list.add(new student("b", "585679", 2.0));
        list.add(new professor("m", "45632", 5));
        list.add(new professor("e", "586546", 16));
        list.add(new professor("e", "586546", 19));
        int i;
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getVacationDays());
            if (list.get(i) instanceof student) {
                ((student) list.get(i)).showGeneralGrade();
            }
            if (list.get(i) instanceof professor) {
                ((professor) list.get(i)).showAcademicPosition();
            }
        }
    }
}