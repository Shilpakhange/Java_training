package OopsConceptPart1;

public class CallByValueAndCallByRef {
	int p=50;
	int q=60;

	public static void main(String[] args) {

		int i=10;
		int j=20;
		CallByValueAndCallByRef obj=new CallByValueAndCallByRef();
        int m=obj.sum(i,j);//call by value or pass by value
        System.out.println(m);
        
        System.out.println(obj.p);
        System.out.println(obj.q);

        obj.swap(obj);//call by reference or pass by reference
       //After swap values of p and q
        System.out.println(obj.p);
        System.out.println(obj.q);


	}

	public int sum(int k,int l) {//copy of variable i and j will be given to the k and l respectively.
	      k=5;
	      l=36;
		return(k+l);
	}
	
	public void swap(CallByValueAndCallByRef t) { //copy of object reference is given to the function.
		int temp;
		temp=t.p;//50
		t.p=t.q;//60
		t.q=temp;//50
	}
}
