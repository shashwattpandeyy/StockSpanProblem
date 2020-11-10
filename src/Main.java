import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println ("enter the size");
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
        int size = Integer.parseInt ( br.readLine () );
        System.out.println ("Enter the elements");
        int[] array = new int[size];
        int[] outputArray = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i] = Integer.parseInt ( br.readLine () );
        }
        System.out.println ( Arrays.toString ( array ) );
        StockSpan.Stock ( array,outputArray,size );
        System.out.println ( Arrays.toString ( outputArray ) );
    }
}
