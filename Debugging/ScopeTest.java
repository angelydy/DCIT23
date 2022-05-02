public class ScopeTest {
    
    public static void main(String[] args) {
        int i,j,k;
        
        for(i = 64; i > 0; i=i/2 ){
            System.out.print(i +" ");
        } 
                
        System.out.println("");
        for(j = 0; j<=5; j++){
            System.out.print(j +" ");
        }
        
        System.out.println("");
        for(j = 5; j>=0; j--){
            System.out.print(j +" ");
        }
        
        System.out.println("");
        for(k = 2; k<=64; k=k*2){
            System.out.print(k +" ");
        }
        

    }  
}
