package edu.handong.csee.java.hw3.engines;



/**
 * This class is the MinEngine for doing calculate minimum value
 */
public class MinEngine implements Computable {
    private static final String engineName ="MIN";
    private double[] nums;
    private double min;

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
     * This is the getter of min.
     * @return
     */
    public double getMin() {
        return min;
    }

    /**
     * This is the setter of min.
     * @param min
     */
    public void setMin(double min) {
        this.min = min;
    }

    /**
     * This is the method of MinEngine to get Input data
     *
     * @param args
     */
    @Override
    public void setInput(String[] args) {
        int len = args.length;

        if(len <= 2)
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);

        nums = new double[len - 1];
        for(int i = 0; i < len - 1; i++) {
            if(i == 0) {
                min = Double.parseDouble(args[i + 1]);
            }
            nums[i] = Double.parseDouble(args[i+1]);
        }
    }

    /**
     * This is the method of MinEngine to compute some values
     */
    @Override
    public void compute() {
        for(double num : nums) {
            if(min > num)
                min = num;

        }
    }

    /**
     * This is the method of MinEngine to compute some values
     *
     * @return
     */
    @Override
    public double getResult() {
        return min;
    }
}
