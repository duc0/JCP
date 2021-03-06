/*
 * Copyright (c) CP4J Project
 */

package com.vb.number;

public interface LongArithmetic {
    int compare(long n1, long n2);

    long add(long n1, long n2);

    long subtract(long n1, long n2);

    long multiply(long n1, long n2);

    long divide(long n1, long n2);

    long zero();

    long maxValue();

    long min(long n1, long n2);

    default boolean isEqual(long n1, long n2) {
        return compare(n1, n2) == 0;
    }
}

