package library;

public class Storage {
    private Book[] books;
    private int[] inStock;
    private int stockSize=6;

    public Storage() {
        this.books = new Book[stockSize];
        this.inStock = new int[stockSize];
    }

    public void addBook(Book newBook, int amount){
        Integer stockIndex = findInStock(newBook);
        if(stockIndex != null){
            inStock[stockIndex] += amount;
        } else {
            Integer firstNullIndex = null;
            for(int index=0; index<stockSize; index++){
                if(books[index] == null && firstNullIndex == null){
                    firstNullIndex = index;
                }
            }
            if(firstNullIndex == null){
                increaseStockSize();
                Book[] newBooks = new Book[stockSize];
                int[] newInStock = new int[stockSize];
                System.arraycopy(books, 0, newBooks, 0, stockSize-1);
                System.arraycopy(inStock,0, newInStock, 0, stockSize-1);
                books = newBooks;
                inStock = newInStock;
                books[stockSize-1] = newBook;
                inStock[stockSize-1] += amount;
            } else {
                books[firstNullIndex] = newBook;
                inStock[firstNullIndex] += amount;
            }
        }
    }

    public String rentBook(Book book){
        Integer stockIndex = findInStock(book);
        if(stockIndex != null){
            inStock[stockIndex] -= 1;
            return book.getName();
        } else {
            return null;
        }
    }

    public void returnBook(Book book){
        Integer stockIndex = findInStock(book);
        if (stockIndex != null){
            inStock[stockIndex] += 1;
        }
    }

    public Integer getInStock(Book book){
        Integer stockIndex = findInStock(book);
        if(stockIndex == null){
            return 0;
        } else {
            return inStock[findInStock(book)];
        }
    }

    private void increaseStockSize(){
        stockSize++;
    }

    private Integer findInStock(Book book){
        Integer stockIndex = null;
        for(int index=0; index<stockSize; index++){
            if(books[index]!= null && books[index].equals(book)){
                return index;
            }
        }
        return stockIndex;
    }

    public Book[] getBooks() {
        return books;
    }
}
