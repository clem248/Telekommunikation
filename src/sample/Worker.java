package sample;

public class Worker {
    private String firstname;
    private String lastname;
    private String workername;
    private String password;
    private String location;
    private String gender;

    public Worker(String firstname, String lastname, String workername, String password, String location, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.workername = workername;
        this.password = password;
        this.location = location;
        this.gender = gender;
    }

    public Worker() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
