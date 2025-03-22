package 지후과제;

import java.util.Scanner;

import static java.lang.System.exit;

public class Country {


    private String countryName;

    private int population;

    private double populationGrowthRate;

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public double getPopulationGrowthRate() {
        return populationGrowthRate;
    }

    public void data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("국가 데이터를 입력하세요.");
        System.out.print("국가명: ");
        countryName = scanner.next();
        System.out.print("인구수: ");
        int populationNumber = scanner.nextInt();
        while (populationNumber < 0) {
            System.out.println("인구수가 음수이다.");
            populationNumber = scanner.nextInt();
        }
        System.out.print("연간 인구 증감율(%): ");
        populationGrowthRate = scanner.nextDouble();
        System.out.println();
    }

    public void writeOutput() {
        System.out.println("국가 데이터:");
        System.out.println("국가명 = " + countryName);
        System.out.println("인구수 = " + population);
        System.out.println("연간 인구 증감율 = " + populationGrowthRate + "%");
        System.out.println();
    }

    public void countryOutput(String newCountryName,
                              int newPopulation,
                              double newPopulationGrowthRate) {
        countryName = newCountryName;
        if (newPopulation < 0) {
            System.out.println("오류: 인구수가 음수이다.");
            System.exit(0);
        }
        population = newPopulation;
        populationGrowthRate = newPopulationGrowthRate;
    }

    public void calculatePopulation(int year) {
        double expectValue = populationGrowthRate;
        for (int i = 0; i < year; i++) {
            population = (int) ((1 + expectValue) * population);
        }
        System.out.println("%s의 %d년후 인구 = %d" + countryName + year + population);
    }

}
