package com.lambdaschool.solution;

public class App implements Processor
{
  // constructor injection
  private AthleteCreation athleteCreation;

  public App(AthleteCreation athleteCreation)
  {
    this.athleteCreation = athleteCreation;
  }

  @Override
  public void displayAthlete()
  {
    System.out.println("************");
    athleteCreation.display();
    System.out.println("************\n");
  }
}
