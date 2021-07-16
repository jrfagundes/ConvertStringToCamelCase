import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    StringBuilder sb = new StringBuilder();
    boolean primeiraLetra = true;
       if (s.contains("_")) {
        for( String oneString : s.split("_") )
        {
             if(primeiraLetra){
                sb.append( oneString.substring(0,1) );
                primeiraLetra = false;
            }else{
                sb.append( oneString.substring(0,1).toUpperCase() );                
            }
            
            sb.append( oneString.substring(1).toLowerCase() );
          
           
             
        }
       }
       if (s.contains("-")) {
        for( String oneString : s.split("-") )
        {
            if(primeiraLetra){
                sb.append( oneString.substring(0,1) );
                primeiraLetra = false;
            }else{
                sb.append( oneString.substring(0,1).toUpperCase() );                
            }
            
            sb.append( oneString.substring(1).toLowerCase() );
          
            
             
        }
       }
   
    return sb.toString();
  }
}