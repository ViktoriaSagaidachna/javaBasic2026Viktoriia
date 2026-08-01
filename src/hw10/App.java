package hw10;

public class App {

    public static void main(String[] args) {

        // Створення трьох об'єктів Person
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        // Виведення інформації
        System.out.println("Інформація про осіб:");
        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        // Зміна професії
        System.out.println();
        System.out.println("Після зміни професії:");

        person1.setProfession("Дизайнер");
        person1.printInfo();
    }
}

// Клас Person
class Person {

    String name;
    int age;
    String profession;

    // Конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Метод зміни професії
    public void setProfession(String newProfession) {
        profession = newProfession;
    }

    // Метод виведення інформації
    public void printInfo() {
        System.out.println("Ім'я: " + name +
                ", Вік: " + age +
                ", Професія: " + profession);
    }
}