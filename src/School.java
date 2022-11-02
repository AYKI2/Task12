public class School {
    private String name;
    private int schoolNumber;
    private int numberOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Вы не ввели название школы!");
        }else {
            this.name = name;
        }
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void printSchool(School[] schools) {
        for (School school:schools){
            System.out.println("Школа: " +school.name);
            System.out.println("Номер школы: " +school.schoolNumber);
            System.out.println("Количество учеников: " +school.numberOfStudents);
            System.out.println();
        }
    }
}
