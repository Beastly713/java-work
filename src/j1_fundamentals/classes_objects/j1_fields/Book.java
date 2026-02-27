package j1_fundamentals.classes_objects.j1_fields;
import java.lang.reflect.Field;

class Book {
    String title;
    String author;
    int pages;
    double price;
}

class Main {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();

        book1.title = "Goat Talk";
        book1.author = "Lionel";
        book1.pages = 2022;
        book1.price = 1910.30;

        book2.title = "Runner up";
        book2.author = "CR7";
        book2.pages = 1000;
        book2.price = 2022;

        Field[] fields = book1.getClass().getDeclaredFields();

        for(Field it : fields){
        it.setAccessible(true);  // needed for private fields
        try{
            System.out.println(it.getName() + " = " + it.get(book1));
        }catch ( IllegalAccessException e){
            e.printStackTrace();
        }
        }
    }
}
