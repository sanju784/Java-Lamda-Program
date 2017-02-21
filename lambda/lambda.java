public class lambda {
    public static void main(String[] args) {

      // lambda exp with double as return type and no argument
      number val = () -> Math.random() * 100;
      System.out.println(val.getValue());

      // lambda exp with int as both return type and argument
      factorial res = (n) -> {
          int result = 1;
          for(int i = 1;i <= n;i++)
            result = result * i;
          return result;
      };
      System.out.println("Factorial of 5 is " + res.fact(5));

      // lambda exp with string as both return type and argument
      reverseStr str = (s) -> {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--)
            rev += s.charAt(i);
        return rev;
      };
      System.out.println("The reverse of Java is " + str.func("Java"));

      // lambda exp with no return type and argument
      display dis = () -> System.out.println("Hello Lambda");
      dis.show();

	  //single function within the functional interface can be used to execute multiple operations having same signature
      math add = (x, y) -> x+y;
      System.out.println("Addition is " + add.op(5,10));

      math sub = (x,y) -> x-y;
      System.out.println("Subtract is " + sub.op(5, 10));

      math mul = (x,y) -> x*y;
      System.out.println("Multiplication is " + mul.op(5, 10));

      math div = (x,y) -> x/y;
      System.out.println("Division is " + div.op(5, 10));
    }
}

@FunctionalInterface
interface number {
  double getValue();
}

@FunctionalInterface
interface factorial {
  int fact(int n);
}

@FunctionalInterface
interface reverseStr {
  String func(String n);
}

@FunctionalInterface
interface display {
  void show();
}

@FunctionalInterface
interface math{
  int op(int a, int b);
}
