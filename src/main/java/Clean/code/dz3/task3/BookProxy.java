package Clean.code.dz3.task3;

public class BookProxy {
    private Book realBook;
    private boolean isContentLoaded;

    public BookProxy(Book realBook) {
        this.realBook = realBook;
        this.isContentLoaded = false;
    }

    public String getContent() {
        if (!isContentLoaded) {
            System.out.println("Загрузка содержимого книги...");
            loadContentFromStorage();
            isContentLoaded = true;
        }
        return realBook.getContent();
    }

    private void loadContentFromStorage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Содержимое книги успешно загружено");
    }

    public String getTitle() {
        return realBook.getTitle();
    }

    public String getAuthor() {
        return realBook.getAuthor();
    }
}