package com.lambdaschool.solution;

public class App implements Processor
{
  // constructor injection
  private AthleteCreation athleteCreation;
  private CourtCreation courtCreation;

  public App(AthleteCreation athleteCreation)
  {
    this.athleteCreation = athleteCreation;
  }

  public App(CourtCreation courtCreation)
  {
    this.courtCreation = courtCreation;
  }

  @Override
  public void displayAthlete()
  {
    System.out.println("************");
    athleteCreation.display();
    System.out.println("************\n");
  }

  @Override
  public void displayCourt()
  {
    System.out.println("Plays on: ");
    courtCreation.displayCourt();
    System.out.println();
  }
}
