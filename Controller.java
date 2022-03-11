package day4;

public class Controller {
  MoodOfStudent moodOfStudent = new MoodOfStudent();
  Student student = new Student();
  DayOfWeek dayOfWeek = new DayOfWeek();

  public void run() {
    student.nameStudents();
    student.showStudentMood(dayOfWeek);
  }
}
