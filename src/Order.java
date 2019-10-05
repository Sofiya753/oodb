
public class Order extends Person {
    private Long id;
    private String book;
    private String autor;
    private String code;

    Order(String firstName, String lastName, String phoneNumber, String email) {
        super(firstName, lastName, phoneNumber, email);
    }

    public String getBook(){
        return this.book;
    }

    public String getAutor(){
        return this.autor;
    }

    public Long getId(){
        return this.id;
    }

    public String getCode(){
        return this.code;
    }

    public void setId(Long f){
        this.id=f;
    }

    public void setBook(String name){
        this.book=name;
    }

    public void setAutor(String name){
        this.autor=name;
    }

    public void setCode(String c){
        this.code=c;
    }
}