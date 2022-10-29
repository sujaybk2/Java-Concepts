//package Iteration3;
//
//public class managerDemo extends employeeDemo{
//    private int teamSize;
//    private int teamRatings;
//
//    public managerDemo(String name, int empCode, String dob, double salary, int age, int teamSize, int teamRatings) {
//        super(name, empCode, dob, salary, age);
//        this.teamSize = teamSize;
//        this.teamRatings = teamRatings;
//    }
//
//    public managerDemo(String name, int empCode, String dob, int age, double salary, int teamSize, int teamRatings) {
//        super(name, empCode, dob, age, salary);
//        this.teamSize = teamSize;
//        this.teamRatings=teamRatings;
//
//    }
//
//    public int getTeamSize() {
//        return teamSize;
//    }
//
//    public void setTeamSize(int teamSize) {
//        this.teamSize = teamSize;
//    }
//
//    public int getTeamRatings() {
//        return teamRatings;
//    }
//
//    public void setTeamRatings(int teamRatings) {
//        this.teamRatings = teamRatings;
//    }
//    public double calculateIncrement(float payHike){
//        if(teamRatings > 8){
//            return (getSalary() * payHike) / 100;
//        }
//        return 0;
//
//    }
//}
