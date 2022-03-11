package day4;

public class DayOfWeek {

  public void whatDay(MoodOfStudent moodOfStudent) {
      moodOfStudent.lookLikeAZombie();
      System.out.println("It's Monday, and you look like a zombie\n");

      moodOfStudent.ignoreTeacherInspirationalMoves();
      moodOfStudent.danceLikeCrazy();
      System.out.println("It's Tuesday, you are still tired and don't really listen, " +
          "but you still dance a bit\n");

      moodOfStudent.danceLikeCrazy();
      System.out.println("You've reached the middle of the week, and dance like crazy\n");

      moodOfStudent.shoutLikeCrazy();
      System.out.println("It's Thursday, and you shout like crazy\n");

      moodOfStudent.danceLikeCrazy();
      moodOfStudent.shoutLikeCrazy();
      System.out.println("It's Friday agaiiin, you dance and shout like crazy!");

  }

}
