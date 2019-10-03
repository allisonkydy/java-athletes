package com.lambdaschool.solution;

public class HockeyCourtCreationInjector implements CourtCreationInjector
{
  @Override
  public Processor getProcess()
  {
    return new App(new HockeyCourtImpl());
  }
}
