import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.BitSet;
import java.util.StringTokenizer;

public class n13701_중복제거 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int val;
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    BitSet bs = new BitSet();
	    
	    while(st.hasMoreTokens()){
	        val = Integer.parseInt(st.nextToken());
	        
	        if(bs.get(val)) continue;
	        bs.set(val);
	        
	        bw.write(val+" ");
	    }
	    bw.flush();
	}

}
