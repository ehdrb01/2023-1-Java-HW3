package edu.handong.csee.java.hw3.engines;

/**
 * This class is the MaxEngine for doing calculate maximum value
 */
public class MaxEngine implements Computable {
    private static final String engineName ="MAX";
    private double[] nums;
    private double max;

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
     * This is the getter of max.
     * @return
     */
    public double getMax() {
        return max;
    }

    /**
     * This is the setter of max.
     * @param max
     */
    public void setMax(double max) {
        this.max = max;
    }

    /**
     * This is the method of MaxEngine to get Input data
     *
     * @param args
     */
    @Override
    public void setInput(String[] args) {
        int maxLength = args.length;

        if(maxLength <= 2)
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);

        nums = new double[maxLength];
        for(int i = 0; i < maxLength - 1; i++) {
            if(i == 0) {
                max = Double.parseDouble(args[i+1]);
            }
            nums[i] = Double.parseDouble(args[i+1]);
        }
    }

    /**
     * This is the method of MaxEngine to compute some values
     */
    @Override
    public void compute() {
        for(double num : nums) {
            if(max < num)
                max = num;
        }
    }

    /**
     * This method is the return method that return value from MaxEngine
     *
     * @return
     */
    @Override
    public double getResult() {
        return max;
    }
}
