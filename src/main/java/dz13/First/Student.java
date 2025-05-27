package dz13.First;

public class Student {
    private String name;
    private int age;
    private boolean active;

    public Student(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = Boolean.parseBoolean(String.valueOf(active));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    // Для удобства тестирования переопределим toString()
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }

    // Переопределим equals() для корректной работы тестов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student user = (Student) o;
        return age == user.age && active == user.active && name.equals(user.name);
    }
}