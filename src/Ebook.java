public class Ebook extends Book {
    private double fileSize;

    public Ebook(String title, String author, double fileSize, int pages) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public void describeBook() {
        System.out.println(
                "Name: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Pages: " + getPages() + "\n" +
                "File size: " + getFileSize() + "\n"
        );
    }
}
