import java.util.ArrayList;

class Library {
    public ArrayList<Book> books;
    public Library() { books = new ArrayList<>(); }
    public void addBook(Book book) { books.add(book); }

    public void showAvailableBooks() {
        System.out.println("Available books:\n");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}