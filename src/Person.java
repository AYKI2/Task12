public class Person {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Возраст не может быть отрицательным!");
        }
    }

    public void printPerson(Person[] people){
        for (Person person:people) {
            System.out.println("Имя: "+person.name);
            System.out.println("Фамилия: "+person.surname);
            System.out.println("Возраст: "+person.age);
            System.out.println();
        }
    }
}
