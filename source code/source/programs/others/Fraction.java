/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package source.programs.others;

/**
 *
 * @author PC
 */
public class Fraction {
   public int numb = 0;
   public int denom = 0;
   public Fraction(int numberator, int denominator) {
      this.numb = numberator;
      this.denom = denominator;
   }
   public int getFractionNumberator() {
      return this.numb;
   }
   public int getFractionDenominator() {
      return this.denom;
   }
   public Fraction toReciprocal(int numerator, int denomenator) {
      numerator = denomenator;
      denomenator = numerator;
      return new Fraction(numerator, denomenator);
   }
   public int[] toInt() {
      int[] th = new int[1];
      th[0] = this.numb;
      th[1] = this.denom;
      return th;
   }
   @Override
   public String toString() {
      if (this.numb == this.denom) {
         return String.valueOf(this.numb);
      } else {
         return this.numb + "|" + this.denom;
      }
      
   }
   
}
