package lab1;

public class Book {
    String title;
    String autor;
    String code;

    public Book(String title, String autor, String code) {
        this.title = title;
        this.autor = autor;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
