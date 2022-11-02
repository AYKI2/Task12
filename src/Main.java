import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("------------Университеты------------");
        University university1 = new University();
        university1.setName("КГТУ");
        university1.setFoundingDate(1954);
        university1.setContract(45000);

        University university2 = new University();
        university2.setName("КНУ");
        university2.setFoundingDate(1925);
        university2.setContract(46000);

        University university3 = new University();
        university3.setName("Ала - тоо");
        university3.setFoundingDate(1996);
        university3.setContract(125268);
        
        University[] universities = {university1,university2,university3};
        university1.printUniversity(universities);

        System.out.println("---------------Школы---------------");
        School school1 = new School();
        school1.setName("Гимназия");
        school1.setSchoolNumber(69);
        school1.setNumberOfStudents(5000);

        School school2 = new School();
        school2.setName("Средняя");
        school2.setSchoolNumber(52);
        school2.setNumberOfStudents(4300);

        School school3 = new School();
        school3.setName("Лицей");
        school3.setSchoolNumber(98);
        school3.setNumberOfStudents(6500);

        School[] schools = {school1,school2,school3};
        school1.printSchool(schools);

        System.out.println("---------------Машины---------------");
        Car car1 = new Car();
        car1.setCompany("Mercedes benz");
        car1.setModel("AMG GT");
        car1.setPrice(6000000);
        car1.setSpeed(310);

        Car car2 = new Car();
        car2.setCompany("BMW");
        car2.setModel("M8");
        car2.setPrice(17000000);
        car2.setSpeed(304);

        Car car3 = new Car();
        car3.setCompany("Rolls-Roys");
        car3.setModel("Phantom");
        car3.setPrice(39000000);
        car3.setSpeed(240);

        Car[] cars = {car1,car2,car3};
        car1.printCar(cars);

        System.out.println("----------------Люди----------------");
        Person person1 = new Person();
        person1.setName("Исхак");
        person1.setSurname("Абдухамитов");
        person1.setAge(20);

        Person person2 = new Person();
        person2.setName("Дастан");
        person2.setSurname("Шукуралиев");
        person2.setAge(20);

        Person person3 = new Person();
        System.out.print("Напишите своё имя: ");
        person3.setName(input.next());
        System.out.print("Напишите свою фамилию: ");
        person3.setSurname(input.next());
        System.out.print("Введите свой возраст: ");
        person3.setAge(input.nextInt());

        Person[] persons = {person1,person2,person3};
        person1.printPerson(persons);
    }
}