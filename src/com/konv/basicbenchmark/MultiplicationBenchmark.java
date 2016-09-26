package com.konv.basicbenchmark;

import com.google.caliper.SimpleBenchmark;

public class MultiplicationBenchmark extends SimpleBenchmark {

    public byte timeByteMultiplication(int reps) {
        byte result = 1;
        byte term = 7;
        for (int i = 0; i < reps; ++i) {
            result *= term;
        }
        return result;
    }

    public short timeShortMultiplication(int reps) {
        byte result = 1;
        byte term = 7;
        for (int i = 0; i < reps; ++i) {
            result *= term;
        }
        return result;
    }

    public int timeIntMultiplication(int reps) {
        int result = 1;
        for (int i = 1; i < reps; ++i) {
            result *= i;
        }
        return result;
    }

    public long timeLongMultiplication(int reps) {
        long result = 1;
        long repsLong = reps;
        for (long i = 1; i < reps; ++i) {
            result *= i;
        }
        return result;
    }

    public float timeFloatMultiplication(int reps) {
        float result = 1;
        float term = 3242.3421343f;
        for (int i = 0; i < reps; ++i) {
            result *= term;
        }
        return result;
    }

    public double timeDoubleMultiplication(int reps) {
        double result = 1;
        double term = 3.32431234341;
        for (int i = 0; i < reps; ++i) {
            result *= term;
        }
        return result;
    }
}
