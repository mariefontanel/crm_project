public class Person {

    private String gender;
    private String lastname;
    private String firstname;
    private String city;
    private String phoneNumber;

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     *
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     *
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return "Téléphone : " + phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return
     */
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
