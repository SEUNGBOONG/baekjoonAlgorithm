package 지후과제;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Country country = new Country();
        Scanner scanner = new Scanner(System.in);
        System.out.println("인구를 예측할 연수를 입력하세요.");
        int year = scanner.nextInt();
        country.data();
        country.countryOutput(country.getCountryName(), country.getPopulation(), country.getPopulationGrowthRate());

        country.writeOutput();

        country.calculatePopulation(year);
        scanner.close();

    }
}
