package edu.handong.csee.java.hw3.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

import java.util.Arrays;

/**
 * This class is the GCDEngine for doing calculate the GCD number.
 */
public class GCDEngine implements Computable {
    private static final String engineName ="GCD";
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
     * This is the method of GCDEngine to get Input data.
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
     * This is the method of GCDEngine to compute some values
     */
    @Override
    public void compute() {
        int i = nums.length - 1;
        double temp;

        Arrays.sort(nums);
        setResult(nums[i]);
        while(i >= 0) {
            while (nums[i] != 0) {
                temp = result % nums[i];
                result = nums[i];
                nums[i] = temp;
            }
            i--;
        }
    }

    /**
     * This method is the return method of GCDEngine.
     *
     * @return
     */
    @Override
    public double getResult() {
        return result;
    }
}
