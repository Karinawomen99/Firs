package Clean.code.dz1.dz2.task2;
//Реализовать Singleton для менеджера логирования (Logger)
//Описание
//В приложении необходимо создать класс Logger, который будет вести журнал событий. Класс должен обеспечивать централизованный доступ к логированию для всего приложения. Например:
//Запись информации о событиях (например, успешное подключение к базе данных).
//Запись ошибок (например, исключения при выполнении операций).
//Запись предупреждений (например, при попытке работы с устаревшими методами).
//Класс Logger должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса, который будет использоваться для записи логов.
public class Logger {
    private static Logger instance;
    private Logger(){}
    public static Logger getInstance(){
        if (instance== null){
            instance =new Logger();
        }
        return instance;
    }
    public void info(String messege){
        System.out.println("[INFO]"+messege);
    }
    public void warn(String messege) {
        System.out.println("[WARN]" + messege);
    }
    public void error (String messege){
        System.out.println("[ERROR]"+messege);
}
}
