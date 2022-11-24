public class GradingMultipleChoiceTest {
    public static void main(String[] args) {
        String[] students = {"student 1", "student 2", "student 3", "student 4" };
        char[][] choices = new char[4][10];
        for (int i = 0; i < choices.length; i++) {
            for (int j = 0; j < choices[i].length; j++) {
                choices[i][j] = (char) (65 + Math.random() * 5);

            }

        }
        for (int t = 0; t < students.length; t++) {
            System.out.print(students[t]);
            for (int i = 0; i < choices.length; i++) {
                for (int j = 0; j < choices[i].length; j++) {

                    choices[i][j] = (char) (65 + Math.random() * 5);
                    System.out.print(" " + choices[i][j]);
                }
                System.out.println();
                break;
            }
        }
        System.out.println();
        System.out.print("keys are ");
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int k = 0; k < key.length; k++) {

            System.out.print(key[k] + " ");
        }
        System.out.println();
        boolean grading = false;
        int count = 0;
        for (int g = 0; g < choices.length; g++) {
            for (int h = 0; h < choices[g].length; h++) {

                grading = (choices[g][h] == key[h]);
                if (grading) {
                    count++;
                }

                System.out.print(choices[g][h] + " " + grading + " ");


            }
            System.out.print("Student " + (g + 1) + " rekor is " + (count * 10));
            count = 0;
            System.out.println();


        }
    }
}
