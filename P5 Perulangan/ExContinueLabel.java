public class ExContinueLabel {

    public static void main(String[] args){
       outerLoop:
       for( int i= 0; i<5; i++){
           for (int j=0; j<5; j++){
               //message 1
               System.out.println ("Inside for(j) loop");
               if( j==2 ) continue outerLoop;
           }
           //message 2
           System.out.println ("Inside for(j) loop");
       }
    }
}