package Iteration3;

public class regionalHeadDemo extends employeeDemo{
    private String regionName;
    private int reviewRating;
    private int regionPerformance;

    public regionalHeadDemo(String name, int empCode, String dob, double salary, int age, String regionName, int reviewRating, int regionPerformance) {
        super(name, empCode, dob, salary, age);
        this.regionName = regionName;
        this.reviewRating = reviewRating;
        this.regionPerformance = regionPerformance;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }
    public double calculateIncrement(float payHike){
        if(reviewRating > 7 && regionPerformance > 8){
            return (getSalary() * payHike)/100;
        }
        return 0;
    }
}
