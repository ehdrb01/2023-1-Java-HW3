package edu.handong.csee.java.hw3.engines;


import java.util.Arrays;

/**
 * This class is the LCMEngine for doing calculate the least common multiple value.
 */
public class LCMEngine implements Computable{
    private static final String engineName ="LCM";
    private double[] nums;
    private double result;

    /**
     * This is the getter of engineName.
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * This is the getter of nums.
     * @return
     */
    public double[] getNums() {
        return nums;
    }

    /**
     * This is the setter of nums.
     * @param nums
     */
    public void setNums(double[] nums) {
        this.nums = nums;
    }

    /**
     * This is the setter of result.
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This is the method of LCMEngine to get Input data.
     *
     * @param args
     */
    @Override
    public void setInput(String[] args) {
        int len = args.length;

        if(len < 3)
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        if(Double.parseDouble(args[1]) < 0 || Double.parseDouble(args[2]) < 0)
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);

        nums = new double[len-1];
        for(int i = 0; i < len - 1; i++) {
            nums[i] = Double.parseDouble(args[i+1]);
        }

    }

    /**
     * This is the method of LCMEngine to compute some values.
     */
    @Override
    public void compute() {
        int i = nums.length - 1;
        double temp;

        Arrays.sort(nums);

        // num이 최대공약수가 된다
        double num = nums[i];

        setResult(nums[i]);
        while(i >= 0) {
            double n1 = nums[i];
            double n2 = result;


            while (nums[i] != 0) {
                temp = n2 % nums[i];
                n2 = nums[i];
                nums[i] = temp;
            } // num이 최대공약수가 된다
            i--;
            result = n1 * result / n2;


        }


    }

    /**
     * This method is the return method of LCMEngine.
     *
     * @return
     */
    @Override
    public double getResult() {
        return result;
    }
}
