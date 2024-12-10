//import java.util.Scanner;
//
//public class Ifelse {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите порядковый день недели");
//
//        int day = scanner.nextInt();
//
//        chooseDayOfWeek(day);
//
//
//    }
//
//    private static void chooseDayOfWeek(int day) {
//        if (day >= 1 && day <= 5) {
//            if (day == 3) {
//                System.out.println("Можешь еще поспать!");
//            }
//
//            System.out.println("Вставай, пора на работу");
//        }
//        if (day == 6 || day == 7) {
//            System.out.println("Спи дальше!");
//
//        } else {
//            System.out.println("Вы некорректно ввели день недели");
//        }
//
//
//        private static void getDayOfWeekSwitch( int day) {
//
//            switch (day) {
//
//                case 3, 1, 2, 4, 5: {
//                    System.out.println("Надо идти на работу");
//
//                }
//                break;
//                case 6:
//                case 7:
//                    System.out.println("Выходной");
//                    break;
//                    default: {
//                        System.out.println(" Вы не корректно ввели день недели");
//                    }
//
//
//
//                if (day >= 1 && day <= 5) {
//                    if (day == 3) {
//                        System.out.println("Можешь еще поспать!");
//                    }
//
//                    System.out.println("Вставай, пора на работу");
//                }
//                if (day == 6 || day == 7) {
//                    System.out.println("Спи дальше!");
//
//                } else {
//                    System.out.println("Вы некорректно ввели день недели");
//                }
//                break;
//            }
//        }
//    }
//}
//private static void chooseDaysOfWeekSwitch(int day) {
//    switch (day) {
//        case 1,2,3,4,5 -> {
//            System.out.println("Надо идти на работу!");
//            if(day==3) {
//                System.out.println("Можешь еще поспать, ты во вторую смену!");
//            }
//        }
//        case  6,7 -> {
//            System.out.println("Спи дальше! Выходной");
//        }
//        default -> {
//            System.out.println("Вы не корректно ввели день недели!");
//        }
//    }
//
//}
//private static void chooseDaysOfWeekIf(int day) {
//    if (day >= 1 && day <= 5) {
//        if (day == 3) {
//            System.out.println("Можешь еще поспать, ты во вторую смену!");
//        }
//        System.out.println("Надо идти на работу!");
//    } else if (day == 6 || day == 7) { //day >= 6 && day <= 7
//        System.out.println("Спи дальше! Выходной");
//    } else {
//        System.out.println("Вы не корректно ввели день недели!");
//    }
//}
//private static void chooseDaysOfWeekSwitchClassic(int day) {
//    switch (day) {
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//        case 5:
//            System.out.println("Надо идти на работу!");
//            if(day==3) {
//                System.out.println("Можешь еще поспать, ты во вторую смену!");
//            }
//            break;
//        case 6:
//        case 7:
//            System.out.println("Спи дальше! Выходной");
//            break;
//        default: {
//            System.out.println("Вы не корректно ввели день недели!");
//        }
//    }
//
//}