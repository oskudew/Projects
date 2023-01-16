package User.User_MS.Entity;

import java.util.List;

public class User {

    private Long UserID;
    private String name;
    private int age;
    private List Contact;

    public User() {
    }

    public User(Long userID, String name, int age, List contact) {
        UserID = userID;
        this.name = name;
        this.age = age;
        Contact = contact;
    }

    public User(Long userID, String name, int age) {
        UserID = userID;
        this.name = name;
        this.age = age;
    }

    public Long getUserID() {
        return UserID;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Contact=" + Contact +
                '}';
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getContact() {
        return Contact;
    }

    public void setContact(List contact) {
        Contact = contact;
    }
}
