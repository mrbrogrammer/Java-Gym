package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
        
//        boolean is = hen.getMonthlyEggCount() instanceof Integer;
//        System.out.println(hen.getContinent());
//        System.out.println(hen.getMonthlyEggCount());
//        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen;
            //write your code here
            switch (continent) {
                case Continent.AFRICA:
                    hen = new AfricanHen();
                    break;
                case Continent.ASIA:
                    hen = new AsianHen();
                    break;
                case Continent.NORTHAMERICA:
                    hen = new NorthAmericanHen();
                    break;
                default:
                    hen = new EuropeanHen();
                    break;
            }
            return hen;
        }
    }
}
