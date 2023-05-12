// CodeCademy PrimeDirective tutorial
// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  // isPrime method checls if number is prime
  public static boolean isPrime(int number) {
   if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      } 
    }
     return true; 
  }

  // isFibonacci checks if number is a Fibonacci number
  public static boolean isFibonacci(int number) {
    int first = 0;
    int second = 1;

    while (second <= number) {
      if (second == number) {
        return true;
      }
      int temp = first + second;
      first = second;
      second = temp;
    }
    return false;
  }

  // onlyPrimes returns only prime numbers in array
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }

  // onlyNPrimes returns only prime numbers in an array up to N
  public ArrayList<Integer> onlyNPrimes(int[] numbers, int firstPrimes) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number) && firstPrimes != 0) {
        primes.add(number);
        firstPrimes--;
      }
    }
    return primes;
  }
  
  // oddOrEven returns Odd or Even numbers in an array based on what String is put in
  public ArrayList<Integer> oddOrEven(int[] numbers, String evenOrOddString) {
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    for (int number: numbers) {
      if (number % 2 == 0) {
        even.add(number);
      } else {
        odd.add(number);
      }
    }
    if (evenOrOddString == "Even") {
      return even;
    } else {
      return odd;
    }  
  }

  // onlyNFibonacci returns only fibonacci numbers in an array up to N
  public ArrayList<Integer> onlyNFibonacci(int[] numbers, int firstFib) {
    ArrayList<Integer> fib = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isFibonacci(number) && firstFib != 0) {
        fib.add(number);
        firstFib--;
      }
    }
    return fib;
  }
  
  public static void main(String[] args) {
    //System.out.println(isPrime(28));


    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
    System.out.println(pd.onlyPrimes(numbers));
    System.out.println(pd.onlyNPrimes(numbers, 4));
    System.out.println(pd.oddOrEven(numbers, "Odd"));
    System.out.println(pd.onlyNFibonacci(numbers, 13));

    

  }  

}