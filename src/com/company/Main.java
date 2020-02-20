package com.company;

public class Main {

    public static void main(String[] args) {
        /*Communication communication = new Communication();
        Planning planning = new Planning();
        Modeling modeling = new Modeling();
        Contruction contruction = new Contruction();
        Deployment deployment = new Deployment();*/

        String Communication;
        String Planning;
        String Modeling;
        String Construction;
        String Deployment;

        int totalIterations = 1;
        double leftOfProject = 1000;
        double finishedProject = 0;


        for(double totalProject = 0; totalProject<995; totalProject = (totalProject + finishedProject)) {

            finishedProject = (leftOfProject * (Math.pow(0.8, totalIterations)));
            leftOfProject = leftOfProject - finishedProject;
            totalIterations = totalIterations + 1;

            System.out.println("Iteration # " + (totalIterations-1) + '\n');
            System.out.println("Left of project: " + leftOfProject + '\n');
            System.out.println("Finished project: " + finishedProject + '\n');
            System.out.println("Total project: " + totalProject + '\n' + '\n');

        }

    }
}
