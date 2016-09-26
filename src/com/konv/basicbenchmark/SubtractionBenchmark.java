package com.konv.basicbenchmark;

import com.google.caliper.SimpleBenchmark;

public class SubtractionBenchmark extends SimpleBenchmark {

    public int timeByteSubtraction(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result -= i;
        }
        return result;
    }

    public short timeShortSubtraction(int reps) {
        short result = 0;
        short term = 47;
        for (int i = 0; i < reps; ++i) {
            result -= term;
        }
        return result;
    }

    public int timeIntSubtraction(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result -= i;
        }
        return result;
    }

    public long timeLongSubtraction(int reps) {
        long result = 0;
        long repsLong = reps;
        for (long i = 0; i < reps; ++i) {
            result -= i;
        }
        return result;
    }

    public float timeFloatSubtraction(int reps) {
        float result = 0;
        float term = 493.324533f;
        for (int i = 0; i < reps; ++i) {
            result -= term;
        }
        return result;
    }

    public double timeDoubleSubtraction(int reps) {
        double result = 0;
        double term = 23432.342421342142143;
        for (int i = 0; i < reps; ++i) {
            result -= term;
        }
        return result;
    }
}

