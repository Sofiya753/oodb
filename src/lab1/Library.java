package lab1;

import java.util.Collection;

public class Library {
    Collection<Book> book;
    Collection<Client>client;
    Collection<Worker>worker;

    public Collection<Book> getBook() {
        return book;
    }

    public void setBook(Collection<Book> book) {
        this.book = book;
    }

    public Collection<Client> getClient() {
        return client;
    }

    public void setClient(Collection<Client> client) {
        this.client = client;
    }
}

