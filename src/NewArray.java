public class NewArray {
    public static int[] InsertInArray(int [] arr, int index, int num){
        int[] newArr= new int[arr.length+1];
        for(int i=0; i<index; i++){
            newArr[i]=arr[i];
        }
        newArr[index]=num;
        for(int i=index+1; i<newArr.length; i++){
            newArr[i]=arr[i-1];
        }
        return newArr;
    }
}
