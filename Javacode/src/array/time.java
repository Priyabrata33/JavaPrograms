package array;
import java.util.*;

class Node
{
	
	int x, y;

	
	int level;

	Node(int x, int y, int level)
	{
		this.x = x;
		this.y = y;
		this.level = level;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ')';
	}
}


public class time {

	public static void main(String[] args) {
		
		
		int[][] a = {{0,1,1},{1,1,1},{2,1,2}};
		
		System.out.println(findPath(2,2,a));
		
		
		

	}
	
	
	
		
		 static int[] row = { -1, 0, 0, 1 };
	 	 static int[] col = { 0, -1, 1, 0 };

		
		private static  boolean isValid(int x, int y, int N) {
			return (x >= 0 && x < N) && (y >= 0 && y < N);
		}

		
		public static  int findPath(int x, int y, int matrix[][])
		{
			
			if (matrix == null || matrix.length == 0) {
				return -1;
			}

			
			int N = matrix.length;

			
			Queue<Node> q = new ArrayDeque<>();
			Node src = new Node(x, y, 0);
			q.add(src);

			
			Set<String> visited = new HashSet<>();

			String key = src.x + "," + src.y;
			visited.add(key);

			
			while (!q.isEmpty())
			{
				
				Node curr = q.poll();
				int i = curr.x;
				int j = curr.y;
				int level = curr.level;

				
				if (i == 0 && j == 0) {
					return level;
				}

				
				int n = matrix[i][j];

				
				for (int k = 0; k < row.length; k++)
				{
					
					x = i + row[k] * n;
					y = j + col[k] * n;

					
					if (isValid(x, y, N))
					{
						Node next = new Node(x, y, level + 1);

						key = next.x + "," + next.y;

						
						if (!visited.contains(key))
						{
							
							q.add(next);
							visited.add(key);
						}
					}
				}
			}

			
			return -1;
		}
	}


