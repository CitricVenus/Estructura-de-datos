
public class QueueManager{
		int[]queue= new int [10];
		private int front, rear;
		public QueueManager(int [] input) {
			this.queue=input;
			front=0;
			rear=0;
		}
		
		public void enqueue(int n) throws Exception {
			if(rear<queue.length) {
				queue[rear]=n;
				rear++;
			
			}
			else {
				throw new Exception("Out of capacity");
			}
		}
		public void printQueue() {
			for (int i = 0; i < queue.length; i++) {
				System.out.println(queue[i]+";");
			}
		}
		public void unqueue(int n)throws Exception {
				if(rear==front) {
						rear=0;
						front=0;
				}
						return queue[front];
			else {
				return -1;
			}
		}
		public int dequeue() {
			if(front<queue.length&&front<=rear) {
				int result=queue[front];
				if (rear==front) {
					rear=0;
					front=0;
				}
				front++;
				return result;
			}
			else 
					return -1;
		} 
		public int peak() {
			
		}
	public static void main(String[] args) throws Exception{
			int test[]= {0,0,0,0,0,0,0,0,0,0};
			QueueManager qTest= new QueueManager(test);
			qTest.enqueue(3);
			qTest.enqueue(5);
			qTest.enqueue(8);
			qTest.enqueue(23);
			
			System.out.println("Firts three numbers are:" +qTest.unqueue())+ "j";

	}

}
