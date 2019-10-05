package lab1;

public class Library extends Person {
    Boolean yesBook;
    String code;
    int count;

    Library(String firstName, String lastName, String phoneNumber, String email) {
        super(firstName, lastName, phoneNumber, email);
    }

    public String getCode(){
        return this.code;
    }

    public Boolean getYesBook(){
        return this.yesBook;
    }
    public int getCount(){
        return this.count;
    }

    public void exchangeYesBook(boolean f){
        this.yesBook=f;
    }

    public void setYesBook(boolean f){
        this.yesBook=f;
    }

    public void setCode(String s){
        this.code=s;
    }

    public void setCount(int c){
        this.count=c;
    }
}

