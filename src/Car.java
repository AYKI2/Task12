public class Car {
    private String company;
    private String model;
    private int speed;
    private int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }else {
            System.out.println("Цена не может быть меньше нуля!");
        }
    }

    public void printCar(Car[] cars){
        for (Car car:cars) {
            System.out.println("Компания: "+car.company);
            System.out.println("Модель: "+car.model);
            System.out.println("Цена: "+car.price);
            System.out.println("Макс. скорость: "+car.speed+"км/ч");
            System.out.println();
        }
    }
}
