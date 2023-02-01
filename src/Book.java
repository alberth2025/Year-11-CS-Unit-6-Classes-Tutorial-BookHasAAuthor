public class Book {
    //properties

    private String name;
    private double price;
    private int qty;
    private Author author;

    //constructor

    public Book(String n, Author a, double p, int q){
        name = n;
        price = p;
        qty = q;
        author = a;
    }

    //behavior

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public int getQty(){
        return qty;
    }
    public void setQty(int q){
        qty = q;
    }
    public String toString(){
        return "'" + name + "' by " + author.getName() + " (" + author.getGender() + ") at " + author.getEmail();
    }
}
