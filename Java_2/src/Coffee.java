import java.util.Scanner;

public class Coffee {
     private String productName;
     private double priceIn1Kg;
     private double weight;
     
     public Coffee(String name, double price, double weight) {
    	 this.productName = name;
    	 this.priceIn1Kg = price;
    	 this.weight = weight;
     }
     public double sumPrice() {
    	 return this.priceIn1Kg * this.weight;
     }
     public boolean checkWeight(double w) {
    	 return this.weight > w;
     }
     public boolean checkPriceBiggest500k() {
    	 return this.sumPrice() > 500000;
     }
     public double discount(double d) {
    	 if(this.sumPrice() > 500000) {
    		 return (d / 100) * this.sumPrice();
    	 }else {
    		 return 0;
    	 }
     }
     public double afterDiscount(double x) {
    	 return this.sumPrice() - this.discount(x);
     }
     public void input() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Nhap ten san pham: ");
    	 this.productName = sc.nextLine();
    	 System.out.println("Nhap gia tren 1 kg: ");
    	 this.priceIn1Kg = sc.nextDouble();
    	 System.out.println("Nhap so kg: ");
    	 this.weight = sc.nextDouble();
     }
     public void output() {
    	 System.out.println(this.productName+" "+this.priceIn1Kg+" "+this.weight);
     }
}
