import java.io.PrintStream;

public class loop{
  
  public static void main(String[] args) throws Exception
  {
    System.setOut(new PrintStream(new java.io.FileOutputStream("output.txt")));
  String a = "a";
  int i = 1;
  int o = 1;
    while(true){
    	System.out.println(a);
    	System.out.println(i);
    	System.out.println(o);
    	for(int k = 0; k < o; k++, o++){
    		for(int l = 0; l < i; l++,i++){
    			System.out.println(a);
    			a += "a";
    			System.out.println(i);
    		}
    		System.out.println(o);
    	}
    }
    
  }
}