import java.util.HashMap;

public class CommonElement {
    
    public static boolean itemInCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int i : arr1){
            hashMap.put(i, true);
        }

        for(int j : arr2){
            if(hashMap.get(j) != null)
                return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,5};

        System.out.println(itemInCommon(array1, array2));
    }
}
