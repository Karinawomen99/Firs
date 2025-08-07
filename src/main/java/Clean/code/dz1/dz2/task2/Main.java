package Clean.code.dz1.dz2.task2;

public class Main  {
    public static void main(String[] args) {

        // Получаем экземпляр логгера
        Logger logger = Logger.getInstance();

        // Логируем информационное сообщение
        logger.info("Приложение запущено");

        // Логируем предупреждение
        logger.warn("Используется устаревший метод processData()");

        // Логируем ошибку
        logger.error("Ошибка подключения к базе данных");

        // Проверяем, что второй вызов getInstance возвращает тот же объект
        Logger logger2 = Logger.getInstance();
        logger2.info("Сообщение через второй экземпляр (на самом деле он тот же)");
    }
}