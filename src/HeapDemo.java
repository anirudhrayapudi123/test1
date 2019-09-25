import java.util.*;
class MinHeap{
    private Vector<Integer> minheap=new Vector<>();
    private void heapify(int lastIndex){
        //System.out.println("HEAP");
        //int lastIndex=maxheap.size()-1;
        while(lastIndex>0)
        {
            //if(lastIndex>0) {
            int parentIndex = -1;
            if (lastIndex % 2 == 0) {
                parentIndex = (lastIndex - 2) / 2;
            }
            if (lastIndex % 2 == 1) {
                parentIndex = (lastIndex - 1) / 2;
            }

            if (minheap.get(parentIndex) > minheap.get(lastIndex)) {
                int temp = 0;
                Collections.swap(minheap, parentIndex, lastIndex);

            }
            //this.heapify(parentIndex);
            lastIndex--;
        }
    }
    public void addElement1(int element){
        if(this.minheap.size()==0){
            this.minheap.add(element);
            return;
        }
        this.minheap.add(element);
        int lastIndex=minheap.size()-1;
        this.heapify(lastIndex);
    }
    public int getMax1(){
        return 0;
    }
    public void printHeap1(){
        for(int i=0;i<this.minheap.size();i++){
            System.out.print(minheap.get(i));
        }
    }
}
class MaxHeap {
    private Vector<Integer> maxheap = new Vector<>();

    private void heapify(int lastIndex) {
        //System.out.println("HEAP");
        //int lastIndex=maxheap.size()-1;
        while (lastIndex > 0) {
            //if(lastIndex>0) {
            int parentIndex = -1;
            if (lastIndex % 2 == 0) {
                parentIndex = (lastIndex - 2) / 2;
            }
            if (lastIndex % 2 == 1) {
                parentIndex = (lastIndex - 1) / 2;
            }

            if (maxheap.get(parentIndex) < maxheap.get(lastIndex)) {
                int temp = 0;
                Collections.swap(maxheap, parentIndex, lastIndex);

            }
            //this.heapify(parentIndex);
            lastIndex--;
        }
    }

    public void addElement(int element){
        if(this.maxheap.size()==0){
            this.maxheap.add(element);
            return;
        }
        this.maxheap.add(element);
        int lastIndex=maxheap.size()-1;
        this.heapify(lastIndex);
    }
    public int getMax(){
        return 0;
    }
    public void printHeap(){
        for(int i=0;i<this.maxheap.size();i++){
            System.out.print(maxheap.get(i));
        }
    }
}
public class HeapDemo {
    public static void main(String[] args){
        MaxHeap m=new MaxHeap();
        MinHeap m1=new MinHeap();
        m.addElement(1);
        m.addElement(2);
        m.addElement(5);
        m.addElement(4);

        m.addElement(7);
        m.printHeap();

        m1.addElement1(7);
        m1.addElement1(2);
        m1.addElement1(5);
        m1.addElement1(4);

        m1.addElement1(1);
        m1.printHeap1();

    }
}
