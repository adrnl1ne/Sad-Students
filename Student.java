package day4;

public class Student {
  MoodOfStudent student1 = new MoodOfStudent();
  MoodOfStudent student2 = new MoodOfStudent();
  MoodOfStudent student3 = new MoodOfStudent();
  MoodOfStudent student4 = new MoodOfStudent();


  public void nameStudents() {
    student1.name = "Jakob";
    student2.name = "Michael";
    student3.name = "Phoebe";
    student4.name = "Santiago";
  }


  public void showStudentMood(DayOfWeek dayOfWeek) {
    dayOfWeek.whatDay(student1);
    System.out.println("Student name: " + student1.name + "\nExpected grade: " + student1.expectedGrade +
        "\nEngagement level: " + student1.levelOfEngagement);

  }

}
