/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task2romankukalev;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JPTV21Task2RomanKukalev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int n = input.nextInt();
        System.out.println("Сумма цифр равна: " + sumDigits(n));
            // TODO code application logic here
        }
    
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
}
