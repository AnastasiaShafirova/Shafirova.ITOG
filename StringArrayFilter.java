import java.util.Scanner;

public class StringArrayFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] inputArray = new String[n];
        scanner.nextLine();
        

        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку" + (i + 1) + ": ");
            inputArray[i] = scanner.nextLine();            
        }
        
        String[] outputArray = filterStrings(inputArray);

        System.out.println("Результат");
        for (String s : outputArray){
            System.out.println(s);
        }
        scanner.close();
    }

    public static String[] filterStrings(String[] inputArray) {
        int count = 0;

        for (String item : inputArray) {
            if (item.length() <= 3){
                count++;
            }
        }

        String[] resultArray = new String[count];
        int index = 0;

        for (String item : inputArray){
            if (item.length() <= 3){
                resultArray[index++] = item;
            }
        }
        return resultArray;
    }
    }

