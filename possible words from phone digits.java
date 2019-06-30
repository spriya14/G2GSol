import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {public static void main (String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parseInt(br.readLine());
while(t-->0){
int n = Integer.parseInt(br.readLine());
int arr[] = new int[n];
String[] s = br.readLine().split(" ");
for(int i = 0 ; i < n ; i++)
{
arr[i] = Integer.parseInt(s[i]);
}

List<String> ar = new ArrayList<String>();
String[] map = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv" ,"wxyz"	};
helper(arr , 0 ,"", ar ,map);

StringBuffer sb = new StringBuffer(); 
for (int i = 0; i < ar.size(); i++) 
sb.append(ar.get(i) + " ");

System.out.print(sb); 
System.out.println();

}}

private static void helper(int[] arr, int i, String string, List<String> ar, String[] map) 
{
if(i == arr.length) {
ar.add(string);
return;}
String ss = map[arr[i]];

for(int i1 = 0 ; i1 < ss.length() ; i1++)
{
helper(arr, i+1, string+ss.charAt(i1), ar, map);
}

}
}
