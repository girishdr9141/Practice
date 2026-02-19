import java.util.Scanner;
public class Inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String TypeOfDay = switch (day) {
            case "Mon", "Tue", "Wed", "Thu", "Fri" -> "Weekday";
            case "Sat", "Sun" -> "Weekend";
            default -> {
                if (day.isEmpty()) {
                    yield "Sorry! No data given";//yield is used in switch expressions to return the result from that block.

                } else {
                    yield "Invalid data";
                }
            }
        };//The semicolon ends the switch expression statement, just like any Java assignment statement.
        System.out.println("Type of Day is: " + TypeOfDay);
    }
}