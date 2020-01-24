package com.pdfexercises.ex6;

public class Q5 {
    private Integer rand1;

    public Q5() {
        this.rand1 = (int)(Math.random()*10001);
        System.out.println("Generated: " + rand1);
    }

    private int[] returnAsArray(Integer number){
        char[] charArray = number.toString().toCharArray();
        int[] intArray = new int[charArray.length];
        for(int i=0; i<charArray.length; i++){
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        return intArray;
    }

    public int countDigits(){
        return returnAsArray(rand1).length;
    }

    public int getFirstDigit(){
        return returnAsArray(rand1)[0];
    }

    public int sumDigits(){
        int digitSum = 0;
        for(int i: returnAsArray(rand1)){
            digitSum += i;
        }
        return digitSum;
    }

    public String reverseDigits(){

        int[] intArray = returnAsArray(rand1);
        char[] reversedNumArray = new char[intArray.length];
        for(int i=0; i<intArray.length; i++){
            reversedNumArray[intArray.length-1-i] = (char)(intArray[i] + '0');
        }
        return new String(reversedNumArray);
    }

    @Override
    public String toString() {
        String expression = "";
        expression += "Number of digits: " + countDigits() + "\n";
        expression += "Left first digit: " + getFirstDigit() + "\n";
        expression += "Sum of all digits: " + sumDigits() + "\n";
        expression += "Reversed digits: " + reverseDigits() + "\n";
        return expression;
    }

    public static void main(String[] args) {
        System.out.println(new Q5());
    }
}
