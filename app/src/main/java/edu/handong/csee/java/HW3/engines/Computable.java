package edu.handong.csee.java.hw3.engines;

/**
 * This is the interface of this Calculator program
 */
public interface Computable {
    /**
     * This is the method of Computable to get Input data
     * @param args
     */
    void setInput(String[] args);

    /**
     * This is the method of Computable to compute some values
     */
    void compute();

    /**
     * This method is the return method
     * @return
     */
    double getResult();
}
