public class Author {
    //properties

    private final String name;
    private String email;
    private final char gender;

    //constructor

    public Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
//        if (gender!=('m')&&gender!=('f')){
//            throw new IllegalArgumentException();
//        }
    }

    //behavior

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        email = e;
    }
    public char getGender(){
        return gender;
    }

    public String toString(){
        return name + " (" + gender + ") at " + email;
    }

}
