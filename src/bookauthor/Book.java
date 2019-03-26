package bookauthor;

public class Book {

private String title;
    Author[] authors;

    public static void main(String[] args) {
     Book bookName = new Book();   
            Author[] authors = {
            new Author("М.Дрюон"), 
            new Author("Г.Уэллс"), 
            new Author("А.Пушкин"),
            new Author("А.Вайнер"),
            new Author("Г.Вайнер"),
            new Author("C.Алексеев")
    };

        bookName.setTitle("Бумеранг. Диагностика кармы.");// Ввели название книги через Settter
     
        System.out.println("\"" + bookName.getTitle() + "\"");// Вывели через Getter
      
        System.out.println("\"" + bookName.toString() + "\"");// Через toString
        
        System.out.println(authors[5].getName() + "\n");// Вывели имя автора через Getter
        
        System.out.println("Массив из 5 книг:");
        
        String books[] = new String[5];
        
        bookName.setTitle("Проклятые короли");
        books[0] = "1." + "\"" + bookName.getTitle() + "\"" + " - " + authors[0].getName();
        bookName.setTitle("Заколдованный мир");
        books[1] = "2." + "\"" + bookName.getTitle() + "\"" + " - " + authors[1].getName();
        bookName.setTitle("Руслан и Людмила");
        books[2] = "3." + "\"" + bookName.getTitle() + "\"" + " - " + authors[2].getName();
        bookName.setTitle("Визит к Минотавру");
        books[3] ="4." +  "\"" + bookName.getTitle() + "\"" + " - " + "Братья Вайнеры: " + authors[3].getName() + ", " + authors[4].getName();
        bookName.setTitle("Весна");
        authors[0].setName("О.Лутс");
        books[4] = "5." +  "\"" + bookName.getTitle() + "\"" + " - " + authors[0].getName();

        for (String str: books) {
System.out.println(str); 
    
    }   
    }
public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
       return title;
    }
}