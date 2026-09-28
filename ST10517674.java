public class ST10517674 {
    public static void main(String[] args) {

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int highest = 0;
        String bestCity = "";

        System.out.println("GAMING CONSOLE REPORT");

        for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }

            System.out.println(cities[i] + ": " + total);

            if (total > highest) {
                highest = total;
                bestCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("City with most sales: " + bestCity);
        System.out.println("Total sales: " + highest);
    }
}
