package Clean.code.dz3.task3;

public class Main {
    public static void main(String[] args) {
        Book book = new BookBuilder()
                .setTitle("Алые паруса")
                .setAuthor("Александр Грим")
                .setContent("Про девочку Ассоль")
                .setCover("Алые паруса.jpg")
                .setDescription("История про девочку и лодку с красными парусами")
                .build();
        BookProxy proxy = new BookProxy(book);
        System.out.println("Название"+proxy.getTitle());
        System.out.println("Автор"+proxy.getAuthor());

        String content = proxy.getContent();
        System.out.println("Содержимое"+content);

        String contetn2 = proxy.getContent();
        System.out.println("Повторное обращение к содержимому "+content);

    }
}
