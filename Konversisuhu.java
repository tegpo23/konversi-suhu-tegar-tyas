/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversisuhu;

import java.util.Scanner;


public class Konversisuhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan konversi suhu kepada pengguna
        System.out.println("Pilih jenis konversi suhu:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Celsius ke Kelvin");
        System.out.println("3. Fahrenheit ke Celsius");
        System.out.println("4. Fahrenheit ke Kelvin");
        System.out.println("5. Kelvin ke Celsius");
        System.out.println("6. Kelvin ke Fahrenheit");
        System.out.print("Masukkan pilihan (1-6): ");
        int pilihan = input.nextInt();

        // Meminta pengguna memasukkan suhu awal
        System.out.print("Masukkan suhu awal: ");
        double suhuAwal = input.nextDouble();
        double suhuHasil = 0; // Variabel untuk menyimpan hasil konversi

        // Melakukan konversi berdasarkan pilihan pengguna
        switch (pilihan) {
            case 1:
                suhuHasil = celsiusToFahrenheit(suhuAwal);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", suhuAwal, suhuHasil);
                break;
            case 2:
                suhuHasil = celsiusToKelvin(suhuAwal);
                System.out.printf("%.2f Celsius = %.2f Kelvin%n", suhuAwal, suhuHasil);
                break;
            case 3:
                suhuHasil = fahrenheitToCelsius(suhuAwal);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", suhuAwal, suhuHasil);
                break;
            case 4:
                suhuHasil = fahrenheitToKelvin(suhuAwal);
                System.out.printf("%.2f Fahrenheit = %.2f Kelvin%n", suhuAwal, suhuHasil);
                break;
            case 5:
                suhuHasil = kelvinToCelsius(suhuAwal);
                System.out.printf("%.2f Kelvin = %.2f Celsius%n", suhuAwal, suhuHasil);
                break;
            case 6:
                suhuHasil = kelvinToFahrenheit(suhuAwal);
                System.out.printf("%.2f Kelvin = %.2f Fahrenheit%n", suhuAwal, suhuHasil);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        // Menutup scanner
        input.close();
    }

    // Metode untuk konversi suhu
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
