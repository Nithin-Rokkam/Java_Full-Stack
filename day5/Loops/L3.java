class L3 
{
	public static void main(String[] args) 
	{
		int i=1;
		do{
			System.out.println("Hello World!"+i);
			i++;
		}while(i<=3);
	}
}

/*
1st iteration
sop(i); i++ (i=1+1) -> 2<=3 true
2nd iter
sop(i); i++ (i=2+1) -> 3<=3 true
3rd iter
sop(i); i++ (i=3+1) -> 4<=3 false
exit
*/