public class car {
    private String brand;
    private int model;
    private int year;

    public car (){

    }
    public car (String brand,int model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public car(car other){
        this.year =other.year;
        this.model=other.model;
        this.brand=other.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (brand .equals("")) {
            System.out.println("error");
        }
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(int model){
        if (model<2025&&model>1886) {
            this.model = model;
        }
    }
    public void setYear (int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public int getModel() {
        return model;
    }

    public void print(){
        System.out.println("the brand is: "+getBrand());
        System.out.println("the model is: "+getModel());
        System.out.println("the year is: "+getYear());

    }

    public String toString() {
        return "car Details: [brand: " + brand + ", model: " + model + ", year: " + year + "]";
    }


}