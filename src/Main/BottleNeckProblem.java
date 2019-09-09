package Main;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
class LeastBottleFinder
{
    static int arrayElementCount(int inputArray[]) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        for (int i : inputArray) {
            if (elementCountMap.containsKey(i)) {
                elementCountMap.put(i, elementCountMap.get(i) + 1);
            } else {
                elementCountMap.put(i, 1);
            }
        }
        int[] c = new int[inputArray.length];
        System.out.println("Input Array : " + Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length ; ) {
            int j = 0;
            c[i]=elementCountMap.getOrDefault(inputArray[i] , elementCountMap.get(inputArray[i]) + 1);
            i = i +c[i];
        }
        int m = 0;
        for (int i : c ){
            if (m < i){
                m = i;
            }
        }
        return m;
    }
    }
public class BottleNeckProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Bottles :- ");
        int num = s.nextInt();
        int[] radius = new int[num];
        for (int i = 0; i < num; i++) {
            radius[i] = s.nextInt();
        }
        Arrays.sort(radius);
        LeastBottleFinder.arrayElementCount(radius);
        }
    }