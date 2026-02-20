public class JavaBasics {
    public static int findIndex(char menu[],char key){
        for(int i=0;i<menu.length;i++){
            if (menu[i]==key){
                return i;
            }
        }
                return -1;
    }
    public static void main(String args[]){
            char menu[]={'p','w','f'};
            char key='w';
            int index=findIndex(menu, key);
            System.out.println(index);
    }
}
//boilerplate code
