package library;

public class LibraryCase {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Book book1 = new Book(1,"book1",10);
        Book book2 = new Book(2,"book2",10);
        Book book3 = new Book(3,"book3",10);
        Book book4 = new BestSeller(4,"bestSeller1",10,"bestSeller1 summary",1);
        Book book5 = new BestSeller(5,"bestSeller2",10,"bestSeller2 summary",5);
        Book book6 = new BestSeller(6,"bestSeller3",10,"bestSeller3 summary",50);

        storage.addBook(book1,1);
        storage.addBook(book2,1);
        storage.addBook(book3,1);
        storage.addBook(book4,1);
        storage.addBook(book5,1);
        storage.addBook(book6,1);

        for(Book book: storage.getBooks()){
            if(book instanceof BestSeller){
                System.out.println(book);
            }
        }

        for(Book book: storage.getBooks()){
            String name = book.getName();
            int amount = storage.getInStock(book);
            System.out.println(name + " - " + amount + " in storage");
        }

        storage.rentBook(book1);
        storage.rentBook(book4);

        for(Book book: storage.getBooks()){
            String name = book.getName();
            int amount = storage.getInStock(book);
            System.out.println(name + " - " + amount + " in storage");
        }

        storage.returnBook(book1);

        for(Book book: storage.getBooks()){
            String name = book.getName();
            int amount = storage.getInStock(book);
            System.out.println(name + " - " + amount + " in storage");
        }
    }
}
