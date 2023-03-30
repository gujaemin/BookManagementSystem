
public class Assignment33 {

	public static void main(String[] args) {
		int [][] scores = {{1,0,2}, {-1, 3, 1}};
		int [][] scores2 = {{3,1},{2,1},{1,0}};
		int arr_1 = 0;
		int arr_2 = 0; 
		int arr_3 = 0; 
		int arr_4 = 0;

		for (int i = 0; i < 3; i++) {
			 arr_1 += scores[0][i]*scores2[i][0];
			 arr_2 += scores[0][i]*scores2[i][1];
			 arr_3 += scores[1][i]*scores2[i][0];
			 arr_4 += scores[1][i]*scores2[i][1];
			 }
		int [][] arr = {{arr_1,arr_2},{arr_3,arr_4}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		}
	}



