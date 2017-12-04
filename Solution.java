import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
	Arrays.sort(A);
	int cont = 0;
	int val = A[0];
	for (int i = 0; i < A.length; ++i)
	    if (A[i] == val)
		++cont;
	    else{
		if (cont % 2 != 0)
		    return val;
		cont = 1;
		val = A[i];
	    }
	return -1;
    }
}
