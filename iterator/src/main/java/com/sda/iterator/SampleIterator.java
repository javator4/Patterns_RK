package com.sda.iterator;

import java.util.Iterator;

public class SampleIterator implements Iterator{

    private String dataset[];
    private int position = 0;

    public SampleIterator(String[] dataset) {
        this.dataset = dataset;
    }

    public boolean hasNext() {
        if(position<dataset.length){
            return true;
        }
        return false;
    }

    public String next() {
        if(this.hasNext()){
            return dataset[position++];
        }
        return null;
    }


}
