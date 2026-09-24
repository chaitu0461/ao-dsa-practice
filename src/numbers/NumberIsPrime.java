package numbers;

public class NumberIsPrime {
  static void main() {
    int number = 5;
    // The first factor of a number can be found within sq(n)
    for(int i=2;i*i<=number;i++){
      if(number%i==0){
        System.out.println("Not prime");
        return;
      }
    }
    System.out.println("This is prime number");
  }
}
