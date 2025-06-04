package Pratica;

public class Book implements Publication{
    private String title;
    private String writer;
    private int totalPag;
    private int currentPag;
    private boolean open;
    private Person reader; 

    public String details() {return "\nBook details\n\n" + "Book title: "
     + title + "\nwriter: " + writer + "\ntotalPag: " + totalPag + "\ncurrentPag: " 
     + currentPag+ "\nopen: " + open + "\nreader: " + reader.getName() + 
    "  age: " + reader.getAge() + "  gender: " + reader.getGender();}

    public Book(String title, String writer, int totalPag, Person reader) {
        this.title = title;
        this.writer = writer;
        this.totalPag = totalPag;
        this.open = false;
        this.currentPag = 0;
        this.reader = reader;
    }

    @Override
    public void open() {this.open = true;}

    @Override
    public void close() {this.open = false;}

    @Override
    public void peruse(int pa) {this.currentPag = pa;
       if (pa > this.totalPag) {this.currentPag = 0;}
       else {this.currentPag = pa;}}

    @Override
    public void nextPage() {this.currentPag ++;
       if (this.currentPag > this.totalPag) {this.currentPag = 0;}}

    @Override
    public void backpage() {if (this.currentPag > 0){this.currentPag--;}}
}
