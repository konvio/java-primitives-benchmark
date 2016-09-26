package com.konv.basicbenchmark;

import com.google.caliper.SimpleBenchmark;

public class DivisionBenchmark extends SimpleBenchmark {

    public byte timeByteDivision(int reps) {
        byte result = 117;
        for (int i = 0; i < reps; ++i) {
            result /= 2;
            result += 100;
        }
        return result;
    }

    public short timeShortDivision(int reps) {
        short result = 13244;
        short term = 3;
        for (int i = 0; i < reps; ++i) {
            result /= term;
            result += 3141341;
        }
        return result;
    }

    public int timeIntDivision(int reps) {
        int result = 324213431;
        int term = 3;
        for (int i = 1; i < reps; ++i) {
            result /= term;
            result += 3234134;
        }
        return result;
    }

    public long timeLongDivision(int reps) {
        long result = 1313841983479183498L;
        long repsLong = reps;
        for (long i = 1; i < reps; ++i) {
            result /= i;
        }
        return result;
    }

    public float timeFloatDivision(int reps) {
        float result = 3;
        float term = 0.5421343f;
        for (int i = 0; i < reps; ++i) {
            result /= term;
        }
        return result;
    }

    public double timeDoubleDivision(int reps) {
        double result = 33431.31343131344;
        double term = 0.972431234341;
        for (int i = 0; i < reps; ++i) {
            result /= term;
        }
        return result;
    }
}
