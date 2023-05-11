package edu.handong.csee.java.hw3.engines;

/**
 * This class is the SQRTEngine for doing calculate square root value.
 */
public class SQRTEngine implements Computable {
    private static final String engineName ="SQRT";
    private double num;
    private double sqrtNum;

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
    public double getNum() {
        return num;
    }

    /**
     * This is the setter of num.
     * @param num
     */
    public void setNum(double num) {
        this.num = num;
    }

    /**
     * This is the getter of sqrtNum.
     * @return
     */
    public double getSqrtNum() {
        return sqrtNum;
    }

    /**
     * This is the setter of sqrtNum.
     * @param sqrtNum
     */
    public void setSqrtNum(double sqrtNum) {
        this.sqrtNum = sqrtNum;
    }

    /**
     * This is the method of SQRTEngine to get Input data.
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

        num = Double.parseDouble(args[1]);
    }

    /**
     * This is the method of SQRTEngine to compute some values.
     */
    @Override
    public void compute() {
        sqrtNum = Math.sqrt(num);
    }

    /**
     * This method is the return method that value from SQRTEngine.
     *
     * @return
     */
    @Override
    public double getResult() {
        return sqrtNum;
    }
}
