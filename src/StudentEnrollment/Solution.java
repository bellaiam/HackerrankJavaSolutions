package StudentEnrollment;
import java.util.Scanner;

class Student{
    String name;
    int studentClass;
    float result;
    public Student(String s, int sClass) {
        this.name = s;
        this.studentClass = sClass;
        System.out.println("Added student: " + s + " to the roll of class: " + sClass);
    }

    String publish() {
        if (result >= 33.33) {
            return name + " has been promoted to class: " + (studentClass + 1);
        } else {
            return name+ " has been retained in class: " + studentClass;
        }
    }
}
class  Result extends Student {
    Integer subject1;
    Integer subject2;
    Integer subject3;

    public Result (int a, int b, int c, String s, int sClass) {
        super(s, sClass);
        this.name = s;
        this.studentClass = sClass;
        this.subject1 = a;
        this.subject2 = b;
        this.subject3 = c;
        System.out.println(name + " obtained " + subject1 + " marks in subject1");
        System.out.println(name + " obtained " + subject2 + " marks in subject2");
        System.out.println(name + " obtained " + subject3 + " marks in subject3");
    }
    String calculateResult() {
        result = (subject1 + subject2 + subject3) * 100 / 300;
        return publish();
    }
    String changeMarks(int newMarks, String subject) {
        System.out.println(name + " has ordered a recheck in " + subject);
        if (subject.equals("" + subject1)) {
            subject1 = newMarks;

        } else if (subject.equals("" + subject2)) {
            subject2 = newMarks;

        } else {
            subject3 = newMarks;

        }
        return "Following is the new result: " + calculateResult();
    }


}

public class Solution{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");
        int[][] marks = new int[names.length][3];

        for(int i = 0; i < names.length; i++){
            String[] temp = sc.nextLine().split(" ");
            marks[i][0] = Integer.parseInt(temp[0]);
            marks[i][1] = Integer.parseInt(temp[1]);
            marks[i][2] = Integer.parseInt(temp[2]);
        }
        String[] cla = sc.nextLine().split(" ");

        Result r1 = new Result(marks[0][0], marks[0][1], marks[0][2],names[0], Integer.parseInt(cla[0]));
        Result r2 = new Result(marks[1][0], marks[1][1], marks[1][2],names[1], Integer.parseInt(cla[1]));
        Result r3 = new Result(marks[2][0], marks[2][1], marks[2][2],names[2], Integer.parseInt(cla[2]));
        Result r4 = new Result(marks[3][0],marks[3][1], marks[3][2], names[3],Integer.parseInt(cla[3]));
        Result r5 = new Result(marks[4][0], marks[4][1], marks[4][2], names[4], Integer.parseInt(cla[4]));
        String sub = sc.nextLine();
        int newMarks = Integer.parseInt(sc.nextLine());

        System.out.println(r1.calculateResult());
        System.out.println(r2.calculateResult());
        System.out.println(r3.calculateResult());
        System.out.println(r4.calculateResult());
        System.out.println(r5.calculateResult());

        System.out.println(r1.changeMarks(newMarks,sub));
        System.out.println(r3.changeMarks(newMarks,sub));
        System.out.println(r5.changeMarks(newMarks,sub));
    }
}