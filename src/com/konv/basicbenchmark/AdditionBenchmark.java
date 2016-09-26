package com.konv.basicbenchmark;

import com.google.caliper.SimpleBenchmark;

public class AdditionBenchmark extends SimpleBenchmark {

    public int timeByteAddition(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result += i;
        }
        return result;
    }

    public short timeShortAddition(int reps) {
        short result = 0;
        short term = 47;
        for (int i = 0; i < reps; ++i) {
            result += term;
        }
        return result;
    }

    public int timeIntAddition(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result += i;
        }
        return result;
    }

    public long timeLongAddition(int reps) {
        long result = 0;
        long repsLong = reps;
        for (long i = 0; i < reps; ++i) {
            result += i;
        }
        return result;
    }

    public float timeFloatAddition(int reps) {
        float result = 0;
        float term = 493.324533f;
        for (int i = 0; i < reps; ++i) {
            result += term;
        }
        return result;
    }

    public double timeDoubleAddition(int reps) {
        double result = 0;
        double term = 23432.342421342142143;
        for (int i = 0; i < reps; ++i) {
            result += term;
        }
        return result;
    }
}
