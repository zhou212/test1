public class as{
	public static void main(String [] args){
	int [] arr = {12,13,1,5,12};
	for(int i = 0;i < arr.length;i++){
		for(int j = i;j < arr.length;j++){
			if(arr[i]>arr[j]){
			int e=arr[i];
			arr[i]=arr[j];
			arr[j]=e;
}
}
}
	for(int i:arr){
		System.out.print(i+" ");

}

}


}
