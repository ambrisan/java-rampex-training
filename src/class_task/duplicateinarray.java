package class_task;
public class duplicateinarray {
    public static void main(String[] a) {
        String[] arr = {"sam", "jane", "sam", "tom", "sam"};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j]) && i!=j && i<j){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
