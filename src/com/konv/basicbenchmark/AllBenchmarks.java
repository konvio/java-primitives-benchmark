package com.konv.basicbenchmark;

import com.google.caliper.SimpleBenchmark;

public class AllBenchmarks extends SimpleBenchmark{

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
