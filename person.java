public abstract class person {
    private String name;
    private String PhoneNum;
    abstract String getVacationDays();

    public person(String name, String phoneNum) {
        this.name = name;
        PhoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }
}
