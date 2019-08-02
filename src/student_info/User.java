package student_info;


public class User {
    String fname, lname, id;

    public User(String fname, String lname, String id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }

    //getters
    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public String getId()
    {
        return this.id;
    }

}
