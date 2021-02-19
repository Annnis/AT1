package com.company;


public class Function {
//1
           public static String dateByNum(int day) {
        String dayName;
        if (day == 1) {
            return dayName = "Monday";
        }
        if (day == 2) {
            return dayName = "Tuesday";
        }
        if (day == 3) {
            return dayName = "Wednesday";
        }
        if (day == 4) {
            return dayName = "Thursday";
        }
        if (day == 5) {
            return dayName = "Friday";
        }
        if (day == 6) {
            return dayName = "Saturday";
        }
        if (day == 7) {
            return dayName = "Sunday";
        }
        return null;
    }
//2
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
//3
    public static String[] numbers1_9  = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    public static String[] numbers11_19 = {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
            "семнадцать", "восемнадцать", "девятнадцать"};
    public static String[] numbersTens = {"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
            "восемьдесят", "девяносто"};
    public static String[] numbersHundreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
            "восемьсот", "девятьсот"};
    public static String getStringByNumber(int number) {

           if (number == 0) {
            return "zero";
        }
        String spelledNumber = " ";
        int digit, counter = 0;
        boolean isBelow20 = false;

        while (number != 0) {
            digit = number % 10;
            number /= 10;
            if(digit != 0 && counter == 0) {
                if(number % 10 == 1) {
                    spelledNumber += numbers11_19[digit - 1] + " ";
                    isBelow20 = true;
                } else {
                    spelledNumber += numbers1_9[digit - 1] + " ";
                }
            } else if(digit > 0 && !isBelow20 && counter == 1) {
                spelledNumber += numbersTens[digit - 1] + " ";
            } else if(counter == 2) {
                spelledNumber += numbersHundreds[digit - 1] + " ";
            }
            counter++;
        }

        String[] temp = spelledNumber.split(" ");
        spelledNumber = "";
        for(int i = temp.length - 1; i >= 0; i--) {
            spelledNumber += temp[i] + " ";
        }

        return spelledNumber;
    }
//4
    public static int getNumberByString(String number){


        String lowerCase = number.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] splitNumber = lowerCase.split(" ");

        if(splitNumber[0].equals("zero")) {
            return 0;
        }
        int result = 0;
        int counter = splitNumber.length; // 3//2//1
        while(counter != 0) {
            for(int i = 0; i < numbers1_9.length && counter != 0;i++) {
                if(splitNumber[splitNumber.length - counter].equals(numbersHundreds[i])) { // проверить: начать не с сотен
                    result += (i + 1) * 100;//100
                    counter--;//2
                    break;
                } else if (splitNumber[splitNumber.length - counter].equals(numbersTens[i])) {
                    result += (i + 1) * 10;
                    counter--;
                    break;
                } else if(splitNumber[splitNumber.length - counter].equals(numbers11_19[i])) {
                    result += i + 11;
                    counter--;
                    break;
                } else if (splitNumber[splitNumber.length - counter].equals(numbers1_9[i])) {
                    result += i + 1;
                    counter--;
                    break;
                }
            }
        }
        return result;
    }
}


















