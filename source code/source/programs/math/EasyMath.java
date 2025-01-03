package source.programs.math;

import java.util.*;
import source.programs.others.Fraction;

public class EasyMath {

    /**
     *
     * @param type
     * @param a
     * @param b
     * @return
     */
    public Integer MathAction(String type, int a, int b) {
      int x = 0;
      switch (type) {
         case "adittoion" -> {
            x = a + b;
         }
         case "Adittoion" -> {
            x = a + b;
         }
         case "subtraction" -> {
            x = a - b;
         }
         case "Subtraction" -> {
            x = a - b;
         }
         case "multiplication" -> {
            x = a * b;
         }
         case "Multiplication" -> {
            x = a * b;
         }
         case "division" -> {
            x = a / b;
         }
         case "Division" -> {
            x = a / b;
         }
         case "percent" -> {
            x = a % b;
         }
         case "Percent" -> {
            x = a % b;
         }
      }
      return x;
   }

    /**
     * Find Biggest General Divisor
     * @param num1
     * @param num2
     * @return 
     */
    public float FBGD(int num1, int num2) {
       ArrayList<Float> NG1 = new ArrayList<>();
       ArrayList<Float> NG2 = new ArrayList<>();
       ArrayList<Float> Divisors = new ArrayList<>();
       for (int i = 1; i <= num1; i++) {
          float x = num1;
          x = x / i;
          if (x % 1 == 0) {
             NG1.add(x);
          }
       }
       for (int j = 1; j <= num2; j++) {
          float y = num2;
          y = y / j;
          if (y % 1 == 0) {
             NG2.add(y);
          }
       }
       for (int a = 0; a <= NG1.size() - 1; a++) {
          float curNum1 = NG1.get(a);
          for (int b = 0; b <= NG2.size() - 1; b++) {
             float curNum2 = NG2.get(b);
             if (curNum1 == curNum2) {
               Divisors.add(curNum1);
             }
          }
       }
       Divisors.sort(Comparator.naturalOrder());
       float numDiv = Divisors.size() - 1;
       float maxDiv = Divisors.get((int) numDiv);
       return maxDiv;
    }
    
    /**
     * Find Biggest General Divisor
     * @param num1
     * @param num2
     * @param num3
     * @return 
     */
    public float FBGD(int num1, int num2, int num3) {
       ArrayList<Float> NG1 = new ArrayList<>();
       ArrayList<Float> NG2 = new ArrayList<>();
       ArrayList<Float> NG3 = new ArrayList<>();
       ArrayList<Float> Divisors = new ArrayList<>();
       for (int i = 1; i <= num1; i++) {
          float x = num1;
          x = x / i;
          if (x % 1 == 0) {
             NG1.add(x);
          }
       }
       for (int j = 1; j <= num2; j++) {
          float y = num2;
          y = y / j;
          if (y % 1 == 0) {
             NG2.add(y);
          }
       }
       for (int k = 1; k <= num3; k++) {
          float z = num3;
          z = z / k;
          if (z % 1 == 0) {
             NG3.add(z);
          }
       }
       for (int a = 0; a <= NG1.size() - 1; a++) {
          float curNum1 = NG1.get(a);
          for (int b = 0; b <= NG2.size() - 1; b++) {
             float curNum2 = NG2.get(b);
             for (int c = 0; c <= NG3.size() - 1; c++) {
                float curNum3 = NG3.get(c);
                if (curNum1 == curNum2 && curNum1 == curNum3 && curNum2 == curNum3) {
                   Divisors.add(curNum1);
                }
             }
          }
       }
       Divisors.sort(Comparator.naturalOrder());
       float numDiv = Divisors.size() - 1;
       float maxDiv = Divisors.get((int) numDiv);
       return maxDiv;
    }
    
    /**
     * Find Face of a Square or a Rectangle
     * @param side1
     * @param side2
     * @return
     */
    public int FFSR(int side1, int side2) {
        return side1 * side2;
    }

    /**
     * Find Face of a Square or a Rectangle
     * @param side1
     * @param side2
     * @return
     */
    public int FTSR(int side1, int side2) {
       int output = (side1 + side2)*2;
       return output;
    }
    
    /**
     * Find amount of numbers in range.
     * @param startNum
     * @param endNum
     * @return
     */
    public int Gaus(int startNum, int endNum) {
       int eachGroup = startNum + endNum;
       int numNumbers = endNum - (startNum - 1);
       int total = (eachGroup * numNumbers) / 2;
       return total;
    }

    /**
     * Find a random number.
     * @param minimum
     * @param maximum
     * @return
     * @throws Exception
     */
    public int random(int minimum, int maximum) {
       int range = maximum - minimum + 1;
       int rand = (int)(Math.random() * range) + minimum;
       return rand;
    }

    /**
     * Find a random number.
     * @param MinMax
     * @return
     * @throws Exception
     */
    public int random(int[] MinMax) throws Exception {
       if ((MinMax.length - 1) > 1) {
          throw new Exception("Too many parameters.");
       }
       int range = MinMax[1] - MinMax[0] + 1;
       int rand = (int)(Math.random() * range) + MinMax[0];
       return rand;
    }
    
    /**
     * Find Emaunt Of Numbers
     * @param startRange
     * @param endRange
     * @return
     */
    public int FEON(int startRange, int endRange) {
        int s = startRange;
        int e = endRange;
        int out = e - (s - 1);
        return out;
    }
    
    /**
     * *Find* Lowest Multiple
     * @param num1
     * @param num2
     * @return
     */
    public int LCM(int num1, int num2) {
       HashMap<Integer, Integer> NG1 = new HashMap<>();
       HashMap<Integer, Integer> NG2 = new HashMap<>();
       ArrayList<Integer> multiples = new ArrayList<>();
       for (int i = 1; i <= 10; i++) {
          int a = num1;
          int b = num2;
          a = a*i;
          b = b*i;
          NG1.put(i, a);
          NG2.put(i, b);
       }
       for (int c = 1; c < Math.max(NG1.size(), NG2.size()); c++) {
          for (int d = 1; d < Math.max(NG1.size(), NG2.size()); d++) {
             if (Objects.equals(NG1.get(c), NG2.get(d))) {
                multiples.add(NG1.get(c));
             }
          }
       }
       int output = multiples.get(0);
       return output;
    }

    /**
     * *Find* Fraction Addition Action
     * @param numberator1
     * @param denominator1
     * @param numberator2
     * @param denominator2
     * @return
     */
    public Fraction FAA(int numberator1, int denominator1,int numberator2, int denominator2) {
       if (denominator1 != denominator2) {
          int finalDeno = LCM(denominator1,denominator2);
          int times1 = finalDeno / denominator1;
          int times2 = finalDeno / denominator2;
          denominator1 = denominator1 * times1;
          denominator2 = denominator2 * times2;
          numberator1 = numberator1 * times1;
          numberator2 = numberator2 * times2;
       }
       int add = numberator1 + numberator2;
       return new Fraction(add, denominator1);
    }

    /**
     * *Find* Fraction Subtraction Action
     * @param numberator1
     * @param denominator1
     * @param numberator2
     * @param denominator2
     * @return
     */
    public Fraction FSA(int numberator1, int denominator1,int numberator2, int denominator2) {
       int sub = 0;
       if (denominator1 != denominator2) {
          int finalDeno = LCM(denominator1,denominator2);
          int times1 = finalDeno / denominator1;
          int times2 = finalDeno / denominator2;
          denominator1 = denominator1 * times1;
          denominator2 = denominator2 * times2;
          numberator1 = numberator1 * times1;
          numberator2 = numberator2 * times2;
       }
       if (numberator1 > numberator2) {
          sub = numberator1 - numberator2;
       }
       return new Fraction(sub, denominator1);
    }
    
    public Fraction FMA(int numberator1, int denominator1,int numberator2, int denominator2) {
       int numbNew = numberator1 * numberator2;
       int denomNew = denominator1 * denominator2;
       int div  = (int) FBGD(numbNew,denomNew);
       int numbNewDiv = numbNew / div;
       int denomNewDiv = denomNew / div;
       return new Fraction(numbNewDiv, denomNewDiv);
    }
    
    public Fraction FDA(int numberator1, int denominator1,int numberator2, int denominator2) {
       Fraction NewFr2 = new Fraction(numberator2, denominator2);
       NewFr2.toReciprocal(numberator2, denominator2);
       int[] nd = NewFr2.toInt();
       int NewNumb2 = nd[0];
       int NewDenom2 = nd[1];
       Fraction out = FMA(numberator1, denominator1, NewNumb2, NewDenom2);
       return out;
    }
}
