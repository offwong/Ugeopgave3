public class Ugeopgave3 {
    //Opgave 1:
    /*double balance = 50;
    String accountName;


    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double withdrawAmount){
        balance -= withdrawAmount;

    }


    void printBalance(){
        System.out.println(accountName + " have " + balance + " kr");
    }

    void main(){
        accountName = "Off";


        Scanner scanner = new Scanner(System.in);
        System.out.println("How much to input");
        int amount = scanner.nextInt();
            deposit(amount);
        printBalance();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Do you want to withdraw?");
        int withdrawAmount = scanner1.nextInt();
        withdraw(withdrawAmount);
        printBalance();

    }

    //Opgave 2
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;

    void addAssignmentPoints(int points){
        assignmentPoints += points;
    }
    void addExamPoints(int points){
        examPoints += points;
    }
    void addProjectPoints(int points){
        projectPoints += points;
    }
    void printTotal(){
        int total = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total score: " + total);
    }

    void main(){
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();
    }*/

    //Opgave 3


    /*double applyDiscount(double price, double discountPercent){
    return price - (price * discountPercent / 100);
    }
    double addTax(double price){
        return price * 1.25;
    }
    double calculateFinalPrice(double basisPris, double rabatProcent){
        double priceAfterDiscount = applyDiscount(basisPris, rabatProcent);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }
    void main (){
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Final Price: " + finalPrice + " Kr");
    }*/

    //Opgave 4

    /*double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
    int findMax(int [] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        } return max;
    }
    int findMin(int [] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        } return min;
    }
    int countAboveAverage(int [] numbers){
    int count = 0;
    double average = calculateAverage(numbers);
    for (int i = 0; i < numbers.length; i++){
        if (numbers[i] > average) {
            count++;
        }
    }   return count;

    }
    void main(){
        int []numbers = {45, 67, 23, 89, 34, 56, 78};
        System.out.println( calculateAverage(numbers));
        System.out.println(findMin(numbers));
        System.out.println(countAboveAverage(numbers));
    }*/

    //DebugAssignment:
    void main() {

        int a = 7, b = 42;

        minimum(a,b);

        if (minimum(a,b) == a) {

            System.out.println("a is the smallest!");

        }

    }
    //Fix void til int saa man kan return
    int minimum(int a, int b) {
    //Fix if/else til et svar "smaller"
        int smaller;
        if (a < b)
        {
            smaller = a;
        }
        else
        {
            smaller = b;

        }
        return smaller;

    }



}
