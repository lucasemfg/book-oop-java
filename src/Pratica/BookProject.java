package Pratica;

public class BookProject {
    public static void main(String[] args) {
        Person[] per = new Person[2];
        Book[] boo = new Book[2];

        per[0] = new Person("Lucas", 99, "M");
        per[1] = new Person("Marcos", 99, "M");

        boo[0] = new Book("O Príncipe", "Nicolau Maquiavel", 176, per[0]);
        boo[1] = new Book("Sonho de uma noite de verão", "William Shakespeare", 95, per[1]);
    

        boo[1].open();
        boo[1].peruse(1);
        boo[1].backpage();
        System.out.println(boo[1].details());
    }
}
