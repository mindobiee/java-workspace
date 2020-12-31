package Labs;

public class day07_1 {

	public static void main(String[] args) {
		 MyStack stack = new MyStack(10);   
		 if(stack.isEmpty()){    
			 System.out.println("스택이 비어있습니다.");
			 }      
		 for (int i = 1; i <= 10; i++) {
			 stack.push(i);   
			 }      
		 if(stack.isFull()){    
			 System.out.println("스택이 가득 찼습니다.");
			 }      
		 System.out.println("최상위 숫자 : " + stack.top());
		 System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());   
		 System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());  
		 System.out.println("");   System.out.println("== 스택 리스트 ==");   
		 for (int i = 1; i <= 10; i++) {    
			 int num = stack.pop();    
			 if(num != -1)     
				 System.out.println(num); 
		 }
	}

}
// mystack 클래스 만들기 
// 조건 : 0을 초깃값으로 하기 때문에, 비어있는 값을 0으로 전제함. 
class MyStack{
	int[] arr= null;
	// 생성자 생성하기
	public MyStack() {
		arr=new int[10];
	}
	
	public MyStack(int n) {
		if (n>0)
			arr=new int[n];
		else
			arr=new int[10];
	}
	public MyStack(int[] arr) {
		super();
		this.arr = arr;
	}
	// 스택에 정수 저장하기 
	public void push(int num) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==0) {
				arr[i]=num;
				break;
			}
	}
	// 스택이 비었는지 확인
	public boolean isEmpty() {
		for(int i=arr.length-1;i>=0;i--)
			if(arr[i]!=0) 
				return false;
		return true;	
			
	}
	// isFull
	public boolean isFull() {
		for(int i=arr.length-1;i>=0;i--)
			if(arr[i]==0) {
				return false;
			}
		return true;
	}
	// top 메서드
	public int top() {
		for(int i=arr.length-1;i>=0;i--)
			if(arr[i]!=0) {
				return arr[i];
			}
		return -1;
	}
	
	// pop 메서드
	public int pop() {
		for(int i=arr.length-1;i>=0;i--)
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=0;
				return temp;
			}
		return -1;
	}
	
	
}