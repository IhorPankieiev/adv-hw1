package ex_004_comparable.interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
       int temp1 = this.speed - ((Car)o).speed;
       if (temp1 == 0){
           int temp2 = this.price - ((Car)o).price;
           if(temp2 == 0){
               int temp3 = this.model.compareTo(((Car)o).model);
               if(temp3 == 0){
                   int temp4 = this.color.compareTo(((Car)o).color);
                   if(temp4 == 0){
                       return 0;
                   }
                   else {
                       return temp4;
                   }
               }
               else {
                   return temp3;
               }
           }
           else {
               return temp2;
           }
        }
       else {
           return temp1;
       }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}