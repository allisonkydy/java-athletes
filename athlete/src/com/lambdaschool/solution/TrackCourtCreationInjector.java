package com.lambdaschool.solution;

public class TrackCourtCreationInjector implements CourtCreationInjector
{
  @Override
  public Processor getProcess()
  {
    return new App(new TrackCourtImpl());
  }
}
