package edu.handong.csee.java.hw3.engines;

/**
 * This class is the CubeVolEngine for doing calculate Cube's volume.
 */
public class CubeVolEngine implements Computable {
    private static final String engineName ="CUBEVOL";
    private double sidelength;
    private double volume;

    /**
     * This is the getter for engineName.
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * This is the getter of sidelength.
     * @return
     */
    public double getSidelength() {
        return sidelength;
    }

    /**
     * This is the setter of sidelength.
     * @param num
     */
    public void setNum(double sidelength) {
        this.sidelength = sidelength;
    }

    /**
     * This is the getter of volume.
     * @return
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This is the setter of volume.
     * @param volumeNum
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * This is the method of CubeVolEngine to get Input data.
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

        sidelength = Double.parseDouble(args[1]);
    }

    /**
     * This is the method of CubeVolEngine to compute Cube's Volume.
     */
    @Override
    public void compute() {
        volume = sidelength * sidelength * sidelength;
    }

    /**
     * This method is the return method that value from CubeVolEngine.
     *
     * @return
     */
    @Override
    public double getResult() {
        return volume;
    }
}
