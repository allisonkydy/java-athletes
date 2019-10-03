package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
  @Override
  public Processor getProcess()
  {
    return new App(new BaseballAthleteImpl());
  }
}
