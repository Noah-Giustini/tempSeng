package backend;

import java.util.Scanner;
import java.util.*;

//import javafx.application.Application;

public class Student{

    /**
     * All the applications the student has made
     */
    private ArrayList<Application> applications = new ArrayList<Application>();        //TODO make method to get this list of applications
    private boolean hasGottenScholarship = false;
    private String eduLvl = "Undergrad";
    private String name;
    private double GPA;


    public Student(String name, String eduLvl, double GPA){
        this.name = name;
        this.eduLvl = eduLvl;
        this.GPA = GPA;
    }

    /**
     * @return the applications
     */
    public ArrayList<Application> getApplications() {
        return applications;
    }

    /**
     * @return the hasGottenScholarship
     */
    public boolean isHasGottenScholarship() {
        return hasGottenScholarship;
    }


    /**
     * @return the eduLvl
     */
    public String getEduLvl() {
        return eduLvl;
    }

    /**
     * @param eduLvl the eduLvl to set
     */
    public void setEduLvl(String eduLvl) {
        this.eduLvl = eduLvl;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * @param gPA the gPA to set
     */
    public void setGPA(double gPA) {
        GPA = gPA;
    }



    /**
     * Will let the student apply for a certain scholarship
     * @param scholarship the scholarship the student will apply for
     * @return the new application of the student
     */
//    public void apply(Scholarship scholarship, Scanner scan) {
//        try {
//        Application app = new Application(scholarship.getName(), this.name);
//        try {
//            System.out.println("Please enter a priority. ");
//            app.setPriority(scan.nextInt());
//        } catch (Exception e) {
//            System.out.println("invalid priority, set to 1");
//            app.setPriority(1);
//        }
//        app.setGPA(this.GPA);
//        System.out.println("gd");
//        app.setDate("01/02/2019");
//        System.out.println("gd");
//        app.setStatus("pending");
//        System.out.println("gd");
//        app.setEducationLevel(this.eduLvl);
//        System.out.println("gd");
//        this.applications.add(app);
//        System.out.println("gd");
//    } catch (Exception e) {
//        System.out.println("ERROR");
//        System.exit(0);
//    }
//
//
//        
//    }


    /**
     * Will let the student edit an application
     * @param app application to edit
     */
    public void editApplication(Application app) {
        Scanner scan = new Scanner(System.in);
        String choice;
        boolean tryAgain = true;

        while(tryAgain){
            System.out.println("What would you like to edit?");
            System.out.println("Press      Placeholder \n  Enter \"e\" to exit");
            choice = scan.nextLine();
            switch (choice){
                case "e":   tryAgain = false; 
                    break;

                case "g":   this.editGPA(app);
                    break;

                case "l":   this.editLevel(app);
                    break;

                case "p":   this.fixPriority();
                    break;

                default:    System.out.println("Please enter a valid command");
                    break;
            }
            scan.nextLine();
        }
        scan.close();
    }



    /**
     * List all the applications the student has made
     */
    public void viewApplications() {
        for(Application a : applications){
            System.out.println(a.toString());
        }

    }


    /**
     * Will let the student withdraw an application
     * @param app application that will be withdrawn
     */
//    public void withdrawApplication(Application app) {
//        try {
//        this.applications.remove(app);
//        Scholarship sch = new Scholarship(app.getScholarship());
//        this.fixPriority();
//        System.out.println("Application has been sucessfully withdrawn. ");
//        } catch (Exception e) {
//            System.out.println("ERROR");
//            System.exit(0);
//        }
//    }


    /**
     * shows available scholarships 
     * @param scholars arraylist of all scholarships
     */
    public void viewScholarships(ArrayList<Scholarship> scholars){
        for (Scholarship s : scholars){
            System.out.println(s.toString());
        }


    }
    
    /**
     * will give the user a command prompt to verify that he really wants to accept it
     * If the student wished to accept it all application will be withdrawn and other scholarship offers will be declined
     * @param scholarship scholarship the student will accept
     */
    public void acceptScholarship(Scholarship scholarship) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to accept this scholarship. Enter \"y\" for yes or enter anything else to exit");
        String choice = scan.nextLine();
        if(choice.equals("y")){
            scholarship.setChosen(scholarship.getChosen() + 1);
            this.hasGottenScholarship = true;
            //this.rejectAll();
        }
        
        scan.close();
    } catch (Exception e) {
            System.out.println("ERROR");
            System.exit(0);
        }
    }


    /**
     * Will give the user a command prompt to verify that he really wants to decline it.
     * If declined the student will no longer be able to accept this scholarship
     * @param scholarship scholarship to be declined 
     */
    public void declineScholarship(Scholarship scholarship) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to decline this scholarship. Enter \"y\" for yes or enter anything else to exit");
        String choice = scan.nextLine();
        if(choice.equals("y")){
            scholarship.setChosen(scholarship.getChosen() - 1); // just a placeholder for now
        }
        scan.close();
    }catch (Exception e) {
            System.out.println("ERROR");
            System.exit(0);
    }
    
    }

    /**
     * Will fix the priority of the applications. Not sure how to be implemeted yet
     */
    private void fixPriority(){

    }

    /**
     * will get an arraylist of all eligble scholarships for this student
     * @return arraylist of scholarships the student is eligible for
     */
//    public ArrayList<Scholarship> getEligbleScholarships(){
//        return ScholarshipSystem.scholarshipList;
//    }
//
//    private void rejectAll(){
//        this.applications.clear();
//        for( Application app : ScholarshipSystem.applicationList){
//            if (this.name.equals(app.getStudent())){
//                ScholarshipSystem.applicationList.remove(app);
//            }
//        }
//    }

    /**
     * lets the student change the GPA
     * @param app application to edit
     */
    private void editGPA(Application app){
        try {
        System.out.println("Your current gpa in the application is: " + app.getGPA());
        Scanner scan = new Scanner(System.in);
        double newGPA = 0;
        boolean tryAgain = true;
        
        while(tryAgain){
            try {
                System.out.println("What would you like to change it to? ");
                newGPA = scan.nextDouble();
                if(newGPA < 0.0 || newGPA > 4.0){
                    System.out.println("Please enter a valid number");   
                }
                else{
                    tryAgain = false;
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }
            scan.next();
        }
        app.setGPA(newGPA);
        scan.close();
    } catch (Exception e) {
            System.out.println("ERROR");
            System.exit(0);
        }
    }



    /**
     * lets the student change the education level
     * @param app application to edit
     */
    private void editLevel(Application app){
        try {
        System.out.println("Your current level is: " + app.getEducationLevel());
        Scanner scan = new Scanner(System.in);
        boolean tryAgain = true;
        System.out.println("What is your current education level?");
        String newEdu = scan.nextLine();
        scan.close();
        app.setEducationLevel(newEdu);    
    
    } catch(Exception e) {
        System.out.println("ERROR");
            System.exit(0);
    }


    }
}