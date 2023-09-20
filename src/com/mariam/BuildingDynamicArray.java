package com.mariam;

public class BuildingDynamicArray {
    private int[] items;
    private int count;

    public BuildingDynamicArray(int length){
        items = new int[length];
    }

    public void insert(int item){
        items[count++] = item;
        // array is full, resize it
        if(count == items.length){
            // create a new array twice the size
            //copy existing items and set items to the new array
            int [] newItems = new int[count * 2];
            for(int i = 0 ; i < count ; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }

    public void removeAt(int index){
        if((index < 0) || index >= count ){
            throw new IllegalArgumentException();
        } else {
            for (int i = index ; i < count ; i++){
                items[i] = items[i+1];
            }
            count --;
        }
    }

    public int indexOf(int item){
        for (int i = 0 ; i < count ; i++){
            if(item == items[i])
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i= 0; i < count ; i++){
            System.out.println(items[i]);
        }
    }

    public static void main(String [] args){
        BuildingDynamicArray numbers = new BuildingDynamicArray(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
        numbers.insert(6);
        numbers.removeAt(2);
        System.out.println("index of 4 is: " + numbers.indexOf(4));
        numbers.print();

    }
}
