public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isBtn;
    boolean isBorrowed;
    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }
    Book(String title, String author, String isBtn) {
        this.title = title;
        this.author = author;
        this.isBtn = isBtn;
    }
    Book(String isBtn) {
        this("Unknown","Unknown",isBtn);
    }
    Book() {
    }
    public static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }
    void borrowBook() {
        if(isBorrowed) {
            System.out.println("This book" + this.title + " is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("You have borrowed the book " + this.title);
        }
    }
    void returnBook() {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("You have returned the book " + this.title);
        } else {
            System.out.println("Wrong book details "+ this.title +" is already in library");
        }
    }

    public static void main(String[] args) {
        Book newBook = new Book("design of things","arvind batt","2023Book@1253");
        newBook.borrowBook();
        newBook.borrowBook();
        Book newBook1 = new Book("design of lights","alu arjun","2020Book@2342");
        newBook1.borrowBook();
        Book newBook2 = new Book("destiny","mohit ram shanker","2000Book@1433");
        newBook2.borrowBook();

    }
};