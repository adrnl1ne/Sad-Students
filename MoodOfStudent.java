package day4;

public class MoodOfStudent {
  String name;
  int levelOfEngagement = 0;
  int expectedGrade = 0;


  public void danceLikeCrazy() {
    levelOfEngagement += 10;
    expectedGrade += 1;
  }

  public void shoutLikeCrazy() {
    levelOfEngagement += 10;
    expectedGrade += 1;
  }

  public void lookLikeAZombie() {
    levelOfEngagement -= 10;
    expectedGrade -= 1;
  }

  public void ignoreTeacherInspirationalMoves() {
    levelOfEngagement -= 10;
    expectedGrade -= 1;
  }

}
