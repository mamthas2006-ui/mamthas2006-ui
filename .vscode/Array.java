class Array{
    int []arr;
    int size;
    int capacity;
    Array (int capacity){/*constructor */
        arr=new int[capacity];
        this.capacity=capacity;
        size=0;

    }
    boolean insert(int index.int element){
        if(index<0  || size>=capacity|||index>size){
            System.out.println("Invalid input ");
         return false;

        } 
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];

        }
         arr[index]=element;
         size +=;
         return true;

    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args)/*main function */
{
        Array arr1=new Array(5);/*object */
        /*System.out.println(arr1.capacity);*/
        arr1.insert(0,5);
        arr1.insert(1,4);
        arr.insert(7,6);
        arr.display();


    }
}