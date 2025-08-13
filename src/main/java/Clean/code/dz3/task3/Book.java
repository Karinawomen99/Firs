package Clean.code.dz3.task3;
//Цель: Создать библиотеку, которая предоставляет функции просмотра каталога книг, чтения книг и загрузки их для офлайн чтения, с особым вниманием к ленивой загрузке и эффективному управлению ресурсами.
//
//Паттерны проектирования:
//Proxy: Используйте Lazy Loading Proxy для отложенной загрузки книг, что позволяет уменьшить начальную нагрузку на систему и использовать ресурсы эффективнее.
//Builder: Для построения сложных объектов книг, которые могут включать различные компоненты, такие как обложка, описание, содержание, авторы.
//
//Архитектура библиотеки:
//BookBuilder: Класс для построения книг с различными характеристиками.
//Book: Базовый класс для книги, содержит основную информацию и методы доступа.
//BookProxy: Proxy класс, который управляет доступом к объекту Book, осуществляя загрузку данных только по необходимости (например, при первом обращении к содержанию книги).
public class Book {
    private String title;
    private String author;
    private String description;
    private String cover;
    private String content;

    public Book(String title,String author,String description,String content,String cover) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.content = content;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCover() {
        return cover;
    }

    public String getContent() {
        return content;
    }

}
