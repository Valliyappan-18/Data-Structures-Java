public class Stack{
    // initialize array 
    static int stackarr[] = new int[5];
    static int topOfStack; //last value inserted value - topOfStack
    
    // constructor 
    Stack(){
        topOfStack = -1; // because array element starts from 0. so that, -1 assigned to default.
    }
    // push method
    void push(int pushedValues){
        if(topOfStack == stackarr.length-1){
            System.out.println("Stack is overflow or full");
        } else{
        /* Here, I was used preincrement so that, It'll -1+1 = 0 
            stackarr[0] = 1stpushed value likewise ... it'll execute
         */
        stackarr[++topOfStack] = pushedValues; //push value into particular index position
        }
    }
    //pop method
    int pop(){
        if(topOfStack >=0){
            return stackarr[topOfStack--];
        }else{
            System.out.println("Stack is underflow or empty");
            return -1; // if it's empty return -1 because int method should be return something. 
        }
    }
    // array elements
    static void StackElement(){
        for(int i=0;i<5;i++){
            System.out.println("Stack Values are :");
            System.out.println(stackarr[i]);
        }
    }
}