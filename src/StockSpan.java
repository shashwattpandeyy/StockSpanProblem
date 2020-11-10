import java.util.Stack;

public class StockSpan {
    static class Pair{
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public static int[] Stock(int[] array, int[] outputArray, int size){
        int j = 0;
        Stack<Pair> stack = new Stack<> ();
        for (int i = 0; i < size; i++) {
            if(stack.size () == 0)
                outputArray[j++] = -1;

            else if (stack.size () > 0 && stack.peek ().value > array[i]){
                outputArray[j++] = stack.peek ().index;
            }

            else if (stack.size () > 0 && stack.peek ().value <= array[i]){
                while (stack.size () > 0  && stack.peek ().value <= array[i]){
                    stack.pop ();
                }
                if (stack.size () == 0)
                    outputArray[j++] = -1;
                else
                    outputArray[j++]  =stack.peek ().index;
            }
            stack.push ( new Pair ( array[i] , i ) );

        }
        for (int i = 0; i <outputArray.length ; i++) {
            outputArray[i]  = i - outputArray[i];
        }
        return outputArray;


    }
}
