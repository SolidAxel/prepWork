public class parse {
    public static void main(String args []){
        String source1 = "March032021";
        String returnedArray1 = source1.replaceAll("[^0-9]", "");
        // for(String str1 :  returnedArray1){
            System.out.println(" Output1 : "+returnedArray1);
            System.out.println(" Output1 : "+source1);
        // }
        String source2 = "950-003-123-900-456 : 11 _343-1 789----";
        String [] returnedArray2 = source2.split("-");
        for(String str2 :  returnedArray2){
            System.out.println(" Output2 : "+str2);
        }

    }
}
