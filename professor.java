public class professor extends person{
    private int NumOfPublications;

    public professor(String name, String phoneNum, int numOfPublications) {

        super(name, phoneNum);
        NumOfPublications = numOfPublications;
    }
    public String getVacationDays()
    {
        return "3";
    }

    public void setNumOfPublications(int numOfPublications) {
        NumOfPublications = numOfPublications;
    }

    public void showAcademicPosition()
    {
        if(NumOfPublications<8)
            System.out.println("Assistant Professor");
        if(NumOfPublications<16 && NumOfPublications>=8)
            System.out.println("Associate_Professor");
        if(NumOfPublications>=16)
            System.out.println("Full Professor");
    }
}
