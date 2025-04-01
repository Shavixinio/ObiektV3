public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book kamienieNaSzaniec = new Book("Kamienie na szaniec", "Aleksander Kamińśki", 256);
        Book anytgona = new Book("Antygona", "Sofokles", 80);
        Ebook ebook = new Ebook("Test Ebook", "Me", 21.3, 2147483647);

        library.addBook(kamienieNaSzaniec);
        library.addBook(anytgona);

        library.showAvailableBooks();

        kamienieNaSzaniec.borrowBook();
        library.showAvailableBooks();
        anytgona.describeBook();
        ebook.describeBook();
    }
}