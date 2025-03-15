public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Print numbers from 1 to 15");
        for (int i = 1; i < +15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n-----------------------------------------------------");

        System.out.println("Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n-----------------------------------------------------");
        System.out.println("Print  * symbols using number");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Print  * symbols using number in reverse mode");
        int m = 5;
        for (int i = m; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Create an array with number 1-11");

        int[] array1 = new int[11];
        for (int i = 0, k = 1; i < array1.length; i++) {
//            System.out.println(array1[i] + k);
//            k++;
            array1[i] = i + 1;
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Create an array with even numbers from -10 to 10");
        int[] array2 = new int[11];

        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
            System.out.print(array2[i] + " ");
        }

//        for (int i : array2) {
//            System.out.print(i + " ");
//        }


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Give an array. Print count of odd elements");


        int[] array3 = {-10, -9, -11, 4, 6, 3, 7, 2, 1, 24};
        int j = 0;
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 != 0) {
                j++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThe odd numbers count will be: " + j);

        System.out.println("\n-----------------------------------------------------");
        System.out.println("Give an array. Print elements from -10 to 5");

        for (int num1 : array3) {
            if (num1 >= -10 && num1 <= 5) {
                System.out.print(num1 + " ");
            }
        }

        System.out.println("\n-----------------------------------------------------");
        System.out.println("Give an array. Print elements which can be divided 3 or 4");

        int[] array4 = {2, 3, 5, 4, 6, 7, 8, 22, 65, 15};
        for (int num2 : array4) {
            if (num2 % 3 == 0 || num2 % 4 == 0) {
                System.out.print(num2 + " ");
            }
        }


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Give an array. Print sum of elements");
        int[] array5 = {1, 2, 3, 4, -1};
        int sum = array5[0];
        for (int i = 1; i < array5.length; i++) {
            sum = array5[i] + sum;
        }
        System.out.println(sum);


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Give an array. Print sum of positive elements");
        int[] array6 = {1, 2, 3, 4, -1};
        int sum2 = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > 0) {
                sum2 = array6[i] + sum2;
            }
        }
        System.out.println(sum2);


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Give an array. Print sum of multiplicatio of positive elements");
        int[] array7 = {2, 3, 4, -5};
        int mult1 = 1;
        for (int i = 0; i < array7.length; i++) {
            if (array7[i] > 0) {
                mult1 = mult1 * array7[i];
            }
        }
        System.out.println(mult1);


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Find max value from array");
        int[] array8 = {7, 3, 1, 9, 0, 34, -4};
        int maxValue = array8[0];
        for (int i = 1; i < array8.length; i++) {
            if (maxValue < array8[i]) {
                maxValue = array8[i];
            }
        }
        System.out.println(maxValue);


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Find element whi is alone");
        int[] array9 = {2, 4, 5, 2, 7, 6, 4, 7, 6};
        int result = array9[0];
        for (int i = 1; i < array9.length; i++) {
            result = result ^ array9[i];
        }
        System.out.println(result);


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Sort array in ASC");
        int[] array10 = {3, 55, 4, 2, 1, 45};

        for (int a : array10) {
            System.out.print(a + " ");
        }
        System.out.println();


        boolean resultTrue = true;
        int countOfFors = 0;
        while (resultTrue) {
            resultTrue = false;
            for (int i = 0; i < array10.length - 1 - countOfFors; i++) {
                if (array10[i] > array10[i + 1]) {
                    int z = array10[i];
                    array10[i] = array10[i + 1];
                    array10[i + 1] = z;
                    resultTrue = true;
                }
            }
            countOfFors++;
        }
        for (int a : array10) {
            System.out.print(a + " ");
        }


    }
}
