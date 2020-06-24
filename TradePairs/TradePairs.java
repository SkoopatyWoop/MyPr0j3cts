/**
 * TradePairs is a simple program that takes in user input on the terminal.
 *
 * YOU WILL NEED TO HAVE JAVA INSTALLED
 * IN YOUR PATH TO RUN THIS PROGRAM
 *
 * So, TradePairs is responsible for giving you all the possible pairs you can trade! If you are a trader,
 * you know time is very essential, and being able to find all of your possible pairs could be the difference between
 * a win and a loss.
 *
 * Here is how you run the program:
 *
 * 1. in terminal, make sure you are in the same directory as this downloaded java file, if you are not,
 * type in the characters "cd" onto your terminal, then the file path to TradePairs.java
 *
 * example: if TradePairs is in C:\Users\You\Downloads\TradePairs.java, you will type in:
 *    cd C:\Users\You\Downloads\
 *    then press enter
 *
 * 2. you will type in javac TradePairs.java
 *
 * 3. Type java TradePairs (then after pressing space, you will input the pairs yo want to trade below, don't worry
 *      I will show you an example input)
 *
 *      Example:
 *      java TradePairs AUD USD NZD CAD
 *      then press enter
 *
 *      your output should be
 *
 *      AUD USD
 *      AUD NZD
 *      AUD CAD
 *      USD NZD
 *      USD CAD
 *      NZD CAD
 *
 *      ENJOY!
 *
 */
public class TradePairs {

    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++) {
            for(int j = i + 1; j < args.length; j++) {
                System.out.println(args[i] +" "+ args[j]);
            }
        }

    }
}