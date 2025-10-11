package arrayandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagrams ga= new GroupAnagrams();
		List<List<String>> lls=ga.groupAnagrams(new String[] {"act","pots","tops","cat","stop","hat"});
		for(List<String> ls :lls)
		{
			for(String str: ls)
			{
				System.out.println(str);
			
			}
			System.out.println("       ");
		}

	}
	// act","cat","hat""pots","stop","tops
	 public List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> stringArray= new ArrayList();
	        List<String> anagram= new ArrayList();
	         Arrays.sort(strs);
	         if(strs.length==1)
	         {
	        	 anagram.add(strs[0]);
	        	 stringArray.add(anagram);
	        	 return stringArray;
	         }
	        for(int i =0 ; i<strs.length; i++)
	        {
	        	  anagram= new ArrayList();
	        	  String check=strs[i];
		        	
	        	   boolean found = stringArray.stream()
	        	           .flatMap(List::stream)
	        	           .anyMatch(str -> str.equals(check));
	        	if(found)
	        	{
	        		continue;
	        	}
	           for(int j=i+1; j<strs.length; j++)
	           {
	        	  
	        	   
	             if(strs[i].length()==strs[j].length())
	             {
	                char [] strsiarray= strs[i].toCharArray();
	                char [] strsjarray= strs[j].toCharArray();
	                Arrays.sort(strsiarray);
	                Arrays.sort(strsjarray);
	                if(Arrays.equals(strsiarray, strsjarray))
	                {
	                	if(!anagram.contains(strs[i]))
	                       anagram.add(strs[i]);
	                	if(!anagram.contains(strs[j]))
	                    anagram.add(strs[j]);
	                }

	             }
	             else
	             { 
	            	 if(anagram.isEmpty())
	            	 {
	            		 anagram.add(strs[i]);
	            	 }
	            	 
	            	 break;
	             }

	           }
	          stringArray.add(anagram);
	          
	          
	        }
	         return stringArray;
	    }
}
