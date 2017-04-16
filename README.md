# Java Primitives Benchmark

## Overview
Estimated speed of arithmetic operations (+, -, *, /) with Java primitives
(byte, short, int, long, float, double) measured via 
[Caliper](https://github.com/google/caliper).

## Results
               benchmark     ns linear runtime
            ByteAddition  0.414 =
           ShortAddition  0.807 =
             IntAddition  0.428 =
            LongAddition  0.403 =
           FloatAddition  1.562 ===
          DoubleAddition  1.623 ===
             
         ByteSubtraction  0.691 =
        ShortSubtraction  0.805 =
          IntSubtraction  0.692 =
         LongSubtraction  0.432 =
        FloatSubtraction  1.591 ===
       DoubleSubtraction  1.589 ===
             
      ByteMultiplication  1.202 ==
     ShortMultiplication  1.188 ==
       IntMultiplication  1.193 ==
      LongMultiplication  1.293 ==
     FloatMultiplication  1.551 ===
    DoubleMultiplication  1.603 ===
             
            ByteDivision  2.371 ====
           ShortDivision  4.015 =======
             IntDivision  3.062 =====
            LongDivision 15.452 ==============================
           FloatDivision  4.361 ========
          DoubleDivision  5.140 =========
###### © 2016, Vitaliy Kononenko, K-24
