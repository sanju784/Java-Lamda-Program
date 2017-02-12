public class lambda {
    public static void main(String[] args) {
      number val = () -> Math.random() * 100;
      System.out.println(val.getValue());
      factorial res = (n) -> {
          int result = 1;
          for(int i = 1;i <= n;i++)
            result = result * i;
          return result;
      };
      System.out.println("Factorial of 5 is " + res.fact(5));
      reverseStr str = (s) -> {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--)
            rev += s.charAt(i);
        return rev;
      };
      System.out.println("The reverse of Java is " + str.func("Java"));
    }
}

interface number {
  double getValue();
}

interface factorial {
    int fact(int n);
}

interface reverseStr {
    String func(String n);
}