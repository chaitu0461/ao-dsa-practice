package numbers;

public class GCD {
  static void main() {
    int num1 = 50;
    int num2 = 9;

    while (num1!=0 && num2!=0){
      if(num1>num2){
        num1=num1%num2;
      }
      else {
        num2 = num2%num1;
      }
    }
    if(num1>0){
      System.out.println("GCD:"+num1);
    }
    else {
      System.out.println("GCD:"+num2);

    }

  }
}
