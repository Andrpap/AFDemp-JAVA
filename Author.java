package exercise3;

public class Author {

    private String name;
    private String email;
    private String gender;

    public String getAuthorName() {
        return name;
    }

    public String getAuthorEmail() {
        return email;
    }

    public String getAuthorGender() {
        return gender;
    }
    
    
    public String toString() {
    return "Book[name= " + name +
            "Author[name=" + Author + 
            "email= " + email + 
            "gender= " + gender + 
            "price= " + price +
            "qty= " + qty) + "]";
    }
}

