public class Person {

    private String gender;
    private String lastname;
    private String firstname;
    private String city;
    private int phoneNumber;


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getCity() {
        return city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getFullName() {
        if (getGender().equals("male"))
        {
            return "M. " + getLastname() + " " + getFirstname();
        } else if (getGender().equals("female"))
        {
            return "Mme " + getLastname() + " " + getFirstname();
        } else {
            return getLastname() + " " + getFirstname();
        }
    }
}
