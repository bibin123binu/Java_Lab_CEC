import java.util.Scanner;

class AcademicsManager {
    static Scanner scanner;
    static int rollNo;
    static String name;
    static double acMark, spMark;

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the student details: \nRoll no: ");
        rollNo = scanner.nextInt();
        System.out.println("Name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("Academic mark: ");
        acMark = scanner.nextDouble();
        System.out.println("Sports mark: ");
        spMark = scanner.nextDouble();
        Result res = new Result(name, rollNo, acMark, spMark);
        res.displayScores();
    }
}

interface Student {
    void displayAcademicScore();
}

interface Sports {
    void displaySportsScore();
}

class Result implements Student, Sports {
    double academicScore, sportsScore;
    String name;
    int rollNo;

    Result(String name, int rollNo, double academicScore, double sportsScore) {
        this.name = name;
        this.rollNo = rollNo;
        this.sportsScore = sportsScore;
        this.academicScore = academicScore;
    }

    public void displayScores() {
        System.out.println(String.format(
                "\n\nStudent details:\nRoll No: %d\nName: %s", this.rollNo,
                this.name));
        displayAcademicScore();
        displaySportsScore();
    }

    public void displayAcademicScore() {
        System.out.println(String.format("Academic score: %,.2f", this.academicScore));
    }

    public void displaySportsScore() {
        System.out.println(String.format("Sports score: %,.2f\n", this.sportsScore));
    }
}