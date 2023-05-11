package edu.handong.csee.java.hw3.engines;


/**
 * This class is the SphereVolEngine for doing calculate Sphere's volume.
 */
public class SphereVolEngine implements Computable {
    private static final String engineName ="SPHEREVOL";
    private double num;
    private double resultNum;

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
     * This is the getter of resultNum.
     * @return
     */
    public double getResultNum() {
        return resultNum;
    }

    /**
     * This is the setter of resultNum.
     * @param resultNum
     */
    public void setResultNum(double resultNum) {
        this.resultNum = resultNum;
    }

    /**
     * This is the method of SphereVolEngine to get Input data.
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
     * This is the method of SphereVolEngine to compute some values.
     */
    @Override
    public void compute() {
        resultNum = Math.PI * num * num * num * 4 / 3;
    }

    /**
     * This method is the return method of SphereVolEngine.
     *
     * @return
     */
    @Override
    public double getResult() {
        return resultNum;
    }
}
