package edu.handong.csee.java.hw3.engines;
/**
 * This class is the FactorialEngine for doing calculate factorial value.
 */
public class FactorialEngine implements Computable {
    private static final String engineName ="FACTORIAL";
    private int num;
    private int factorialNum;

    /**
     * This is the getter of engineName.
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * This is the getter of num.
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * This is the setter of num.
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * This is the getter of FactorialNum.
     * @return
     */
    public int getFactorialNum() {
        return factorialNum;
    }

    /**
     * This is the getter of FactorialNum.
     * @param factorialNum
     */
    public void setFactorialNum(int factorialNum) {
        this.factorialNum = factorialNum;
    }

    /**
     * This is the method of FactorialEngine to get Input data.
     *
     * @param args
     */
    @Override
    public void setInput(String[] args) {
        int len = args.length;

        if(len != 2)
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        if(Double.parseDouble(args[1]) < 0)
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);

        num = Integer.parseInt(args[1]);
    }

    /**
     * This is the method of FactorialEngine to compute some values.
     */
    @Override
    public void compute() {
        setFactorialNum(1);
        if(num == 0 || num == 1) // 0이나 1이면 1
            factorialNum = 1;
        else { // 다른 숫자면 factorial
            for (int i = num; i != 1; i--) {
                factorialNum = factorialNum * i;
            }
        }
    }

    /**
     * This method is the return method of FactorialEngine.
     *
     * @return
     */
    @Override
    public double getResult() {
        return factorialNum;
    }
}
