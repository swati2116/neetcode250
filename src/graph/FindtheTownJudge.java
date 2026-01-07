package graph;

public class FindtheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int [] trusts= new int[n+1];
        int [] trusted= new int[n+1];
        //create an array of person who trusts and person who trusted.
        for(int [] t:trust)
        {
            trusts[t[0]]++;
            trusted[t[1]]++;
        }
        
        // iterate who trusted and get the trusted value if trusted by n-2 and its trusts index 0
        for(int i=1;i<=n; i++)
        {
            if(trusted[i]==n-1 && trusts[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindtheTownJudge ftj= new FindtheTownJudge();
		ftj.findJudge(4, new int[][] {{1,3},{4,3},{2,3}});

	}

}
