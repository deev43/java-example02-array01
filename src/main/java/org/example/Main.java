package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2,3.5,4.6,5.7};
        double toplam =0;
        double greaterNumber=myList[0];

        for (double myNumber:myList){
            if (greaterNumber<myNumber) {
                greaterNumber=myNumber;
            }
            toplam+=myNumber;
            System.out.println(myNumber);
        }
        System.out.println("Dizideki sayilarin toplami : "+toplam);
        System.out.println("En buyuk sayi: "+greaterNumber);
    }
}
