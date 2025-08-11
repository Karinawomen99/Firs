package Clean.code.dz2.task1;
//Описание
//В приложении необходимо создать класс ConfigurationManager, который будет управлять настройками приложения, такими как:
//Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
//Путь к папке для хранения файлов.
//Настройки логирования (например, уровень логирования, путь к лог-файлу).
//Класс ConfigurationManager должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса, который будет предоставлять доступ к конфигурационным данным.
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    private ConfigurationManager(){
        dbPassword ="12345";
        dbUrl="jbl.attantion:2290";
        dbUser="calvin";
    }
    public static ConfigurationManager getInstance(){
        if (instance==null){
            instance = new ConfigurationManager ();
        }
        return instance;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}

