public class Solution
{
	public int solution(int[] A)

	{
	    int result = 0;
	    int n=A.length;
	    for (int i = 0; i < n - 1; i++)
	    {
	    if (A[i] == 0)
	    {
	        for (int j = i + 1; j < n; j++)
	            if (A[j] == 1)
	                result++;
	    }
	    }
	    return result;
	}
	 

	public static void main(String[] args)
	{
		Solution a=new Solution();
	    int[] A = {0, 1, 0, 1, 1};
	    int n = A.length;
	    System.out.println(a.solution(A));
	}
	}
 