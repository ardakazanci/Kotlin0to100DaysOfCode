/*
 *
 *   Created by Arda Kazancı on 5.12.2019 19:07
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 19:07
 *
 */

package data_class;

// Sample Data Class for Java

class Sample_Java {

    private String sample_string;
    private int sample_int;
    private long sample_long;
    private boolean sample_boolean;


    public String getSample_string() {
        return sample_string;
    }

    public void setSample_string(String sample_string) {
        this.sample_string = sample_string;
    }

    public int getSample_int() {
        return sample_int;
    }

    public void setSample_int(int sample_int) {
        this.sample_int = sample_int;
    }

    public long getSample_long() {
        return sample_long;
    }

    public void setSample_long(long sample_long) {
        this.sample_long = sample_long;
    }

    public boolean isSample_boolean() {
        return sample_boolean;
    }

    public void setSample_boolean(boolean sample_boolean) {
        this.sample_boolean = sample_boolean;
    }

    @Override
    public String toString() {
        return "Sample_Java{" +
                "sample_string='" + sample_string + '\'' +
                ", sample_int=" + sample_int +
                ", sample_long=" + sample_long +
                ", sample_boolean=" + sample_boolean +
                '}';
    }

}
