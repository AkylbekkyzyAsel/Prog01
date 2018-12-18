import java.util.Scanner;
        public class Main {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = input.nextInt();
        double[][] p = new double[n][2];
        System.out.print("Enter " + n + " points: ");
        for (int i = 0; i < p.length; i++) {
            p[i][0] = input.nextDouble();
            p[i][1] = input.nextDouble();
            }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(p[p1][0], p[p1][1],
         p[p2][0], p[p2][1]);

        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                 double distance = distance(p[i][0], p[i][1],
                        p[j][0], p[j][1]);
                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                    }
                 }
             }


         System.out.println("The closest two points are " +
                "(" + p[p1][0] + ", " + p[p1][1] + ") and (" +
                p[p2][0] + ", " + p[p2][1] + ")");
        }

        public static double distance(
        double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
}

