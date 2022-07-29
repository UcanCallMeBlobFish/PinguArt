import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arr[] = new String[8];
        String numbers[] = new String[8];


        for (int i = 0; i < arr.length; i++) {
            String str = sc.nextLine();
            if (str.length() == 8) {
                arr[i] = str;
            } else if (str.length() < 8) {
                arr[i] = String.format("%08d", Integer.parseInt(str));
            }
        }//// fill with zero

        for (int i = 0; i < 8; i++) {
            arr[i] = arr[i].replace('1', '-');
            arr[i] = arr[i].replace('0', ' ');
            arr[i] = arr[i].replace('2', '~');
            arr[i] = arr[i].replace('3', 'P');
        }  /// replace

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = "";
            for (int j = 7; j >= 0; j--) {
                numbers[i] += arr[i].charAt(j);
            }

        }
        System.out.println("+---[PinguArt]---+");
        System.out.println("|" + numbers[0] + numbers[1] + "|");
        System.out.println("|" + numbers[2] + numbers[3] + "|");
        System.out.println("|" + numbers[4] + numbers[5] + "|");
        System.out.println("|" + numbers[6] + numbers[7] + "|");
        System.out.println("+----------------+");


    }


}

