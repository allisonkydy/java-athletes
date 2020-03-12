package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        CourtCreationInjector courtInjector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Track Court
        courtInjector = new TrackCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Court
        courtInjector = new HockeyCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Rugby Court
        courtInjector = new RugbyCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Court
        courtInjector = new BaseballCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

    }
}
