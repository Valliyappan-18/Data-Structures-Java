public class StackExecution {
    public static void main(String[] args){
        //object creation for stack class 
        Stack stack1 = new Stack();

        stack1.push(18);
        stack1.push(17);
        stack1.push(15);
        stack1.push(14);
        stack1.push(2);

        Stack.StackElement();

        int pop1 = stack1.pop();
        System.out.println("popped element value is :"+pop1);
        int pop2 =stack1.pop();
        System.out.println("popped element value is :"+pop2);
    }
}
