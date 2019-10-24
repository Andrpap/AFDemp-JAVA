
package exercise3;

public class Book {

    private String name;
    private double price;
    private int qty;
    private Author Author; /* den katalaba auto to simeio */
    
    public String getName(){
    return name;}
    
    public Author getAuthor(){
        return Author;
    }
     public double getPrice(){
     return price;}
     
     public void setPrice(double timi){
     timi = price;}
     
    
    public int getQty(){
    return qty;}
    
    public String getAuthorName(){
    return name;}
    
    public void setQty(int posotita){
    posotita = qty; }
    
    public String toString() {
    return "Book[name= " + name +
            "Author[name=" + Author + 
            "email= " + email + 
            "gender= " + gender + 
            "price= " + price +
            "qty= " + qty + "]";
    }
    
    
    public static void main(String[] args) {
       
    }
    
}
