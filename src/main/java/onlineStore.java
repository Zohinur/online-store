public class onlineStore {

    public String SKU;
    public String productName;
    public double price;
    public String department;

    public onlineStore(String SKU, String productName, double price, String department) {
        this.SKU = SKU;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }
    public String getSKU(){
        return getSKU();
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void displayProduct() {
        System.out.printf("%-8s %-35s $%8.2f %-20s%n", SKU, productName, price, department);
    }

}
