import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
//liste oluşturma

        int[] arr = {150,50,68,98,64,52,30,5,12,24,72,88};
        System.out.println("The array is: " + Arrays.toString(arr));

          /*  eğer listeyi kullanıcının oluşturmasını istiyorsak liste oluştumra bölümüne bu kodu yazabiliriz.
        System.out.print("How many number add your array: ");
        numberOfRange = input.nextInt();
        int[] arr = new int[numberOfRange];

        System.out.println("Enter the number of arrays: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". digits: ");
            arr[i] = scan.nextInt();
        }*/

// kontrol etmek istediği sayıyı giriyor
        Arrays.sort(arr);

        System.out.println();

        System.out.print("Which number do you want to check: ");
        number = input.nextInt();

        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            if (j < number) {
                min = j;
            }
            if (j > number) {
                max = j;
                break;
            }
        }
//çıktısı
        System.out.println("The nearest number smaller than the entered number: " + min);
        System.out.println("The nearest number greater than the entered number: " + max);
        input.close();




    }
}