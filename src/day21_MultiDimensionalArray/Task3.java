package day21_MultiDimensionalArray;

public class Task3 {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] each9 : array) {
            for (String[][][][][][][][] each8 : each9) {
                for (String[][][][][][][] each7 : each8) {
                    for (String[][][][][][] each6 : each7) {
                        for (String[][][][][] each5 : each6) {
                            for (String[][][][] each4 : each5) {
                                for (String[][][] each3 : each4) {
                                    for (String[][] each2 : each3) {
                                        for (String[] each1 : each2) {
                                            for (String each : each1) {
                                                System.out.print(each + "\t");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each elements of the given array
 */
