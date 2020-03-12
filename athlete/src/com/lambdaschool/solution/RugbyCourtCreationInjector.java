package com.lambdaschool.solution;

public class RugbyCourtCreationInjector implements CourtCreationInjector
{
  @Override
  public Processor getProcess()
  {
    return new App(new RugbyCourtImpl());
  }
}
