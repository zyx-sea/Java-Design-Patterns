package com.company;

/**
 * <br>
 * create:2017-05-18 11:05
 *
 * @author zhou
 */
public class TCLIterator implements TVIterator {
    private int currentIndex=0;
    private  Object[] objects={"湖南卫视","北京卫视","东方卫视","湖北卫视"};
    @Override
    public void setChannel(int i) {
        currentIndex=i;
    }

    @Override
    public void next() {
        if (currentIndex<objects.length){
            currentIndex++;
        }
    }

    @Override
    public void previous() {
        if (currentIndex>0){
        currentIndex--;
    }
    }

    @Override
    public boolean isLast() {
        return currentIndex==objects.length;
    }

    @Override
    public Object currentChannel() {
        return objects[currentIndex];
    }

    @Override
    public boolean isFirst() {
        return currentIndex==0;
    }
}
