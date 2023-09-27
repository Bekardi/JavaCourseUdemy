public class Main {
    public static void main(String[] args) {
        System.out.println( "sumDigits " + sumDigits(1234));
        System.out.println("sumDigits "  + sumDigits(22345));
        System.out.println("sumDigits "  + sumDigits(10000));
        System.out.println("sumDigits "  + sumDigits(8));
    }
    //method parses out each digit from the number and sum the digits up
    //f.e: number in -> 125 -> sumDigits() - > separates 1 + 2 + 5 -> returns - > sum of 1 + 2 + 5 = 8;
    public static int sumDigits(int number) {
        //if number is negative, returns -1
        if(number < 0) return -1;
        //copy of number
        int numberCopy = number;
        //sum of digits;
        int totalSum = 0;

        while(numberCopy > 9){
            //every loop iteration it's gonna add the remainder of the number
            //f.e 1) iteration : totalSum = 125 % 10 = 0 + 5
            //    2) iteration : totalSum = 12 % 10 = 5 + 2
            totalSum += numberCopy % 10;
            System.out.println("number " + numberCopy % 10);

            // to remove the remainder we divide the number by 10
            numberCopy = numberCopy / 10;

        }
        //when number is less than 9 we break out of the loop
        //and return totalSum + number(which only has one digit left)
        System.out.println("number " + numberCopy);

        return totalSum += numberCopy;
    }
}