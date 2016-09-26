package com.konv.basicbenchmark;

import com.google.caliper.Runner;

public class Main {

    public static void main(String[] args) {
        Runner.main(AllBenchmarks.class, new String[]{});
    }
}