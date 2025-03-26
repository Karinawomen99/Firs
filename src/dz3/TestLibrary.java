package dz3;

public class TestLibrary {
    public static void main (String []args){
        Library book = new Library("1988", "Джорд Фпанк ", 1989," Фантастика");
        System.out.println( "категория:"+book.category);

        System.out.println(book.author);//
        System.out.println(book.year);//

    }
}
