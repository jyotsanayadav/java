public class argument {
    // array always passed by reference
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1; //update each marks by 1
        }
    }
    public static void main(String args[]){
        int marks[]={98,97,95};
        update(marks);
        //print the updated marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}
