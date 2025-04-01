public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book kamienieNaSzaniec = new Book("Kamienie na szaniec", "Aleksander Kamińśki");
        Book anytgona = new Book("Antygona", "Sofokles");

        library.addBook(kamienieNaSzaniec);
        library.addBook(anytgona);

        library.showAvailableBooks();

        kamienieNaSzaniec.borrowBook();
        library.showAvailableBooks();
    }
}