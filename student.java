public class student extends person {
    private double GPA;

    public student(String name, String phoneNum, double GPA) {
        super(name, phoneNum);
        this.GPA = GPA;
    }
    public String getVacationDays()
    {
        return "2" ;
    }

    public double getGPA() {
        return GPA;
    }

    public void showGeneralGrade()
    {
        if(GPA<=4 && GPA>3.4)
            System.out.println("Excellent");
        else if (GPA<=3.4&&GPA>2.8)
            System.out.println("Very Good");
        else if (GPA<=2.8&&GPA>2.4)
            System.out.println("Good");
        else if (GPA<=2.4&&GPA>2.0)
            System.out.println("Pass");
        else if (GPA<2.0)
            System.out.println("Fail");
    }

}
