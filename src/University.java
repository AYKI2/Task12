public class University {
    private String name;
    private int foundingDate;
    private int contract;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Вы не ввели название университета!");
        }else {
            this.name = name;
        }
    }

    public int getFoundingDate() {
        return foundingDate;
    }
    public void setFoundingDate(int foundingDate) {
        this.foundingDate = foundingDate;
    }

    public int getContract() {
        return contract;
    }
    public void setContract(int contract) {
        this.contract = contract;
    }

    public void printUniversity(University[] universities){
        for (University university:universities) {
            System.out.println("Название: "+university.name);
            System.out.println("Дата основания: "+university.foundingDate);
            System.out.println("Контракт: "+university.contract);
            System.out.println();
        }
    }
}
