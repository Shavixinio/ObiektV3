public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    public int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getPages() {
        return pages;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void describeBook() {
        System.out.println(
                "Name: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Pages: " + getPages() + "\n"
        );
    }
}