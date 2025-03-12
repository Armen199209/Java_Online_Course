public class Lesson3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(b[0]);


        System.out.println("----------------------------");

        a[0] = 11;
        a[1] = 2;
        System.out.println(a[0]);

        System.out.println("----------------------------");

        int num1 = 5;
        int num2 = num1 > 4 ? 20 : 30;
        System.out.println(num2);

        System.out.println("----------------------------");

        int y = 0;
        if (y > 0) {
            System.out.println("Positive");
        } else if (y < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Y=0");
        }
        System.out.println(y > 0 ? "Positive" : y < 0 ? "Negative" : "y=0");


        System.out.println("----------------------------");

        String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Wait");
        }


        //   Enhanced Switch (Упрощённый switch в Java 14+)
        int day = 3;
        int result = switch (day) {
            case 1 -> 100;
            case 2 -> 200;
            case 3,4,5 -> 300;
            default -> 0;
        };
        System.out.println(result);
    }


}

