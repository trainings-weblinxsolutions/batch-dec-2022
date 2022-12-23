public class ArrayExampleMultiDimensional{

boolean createNewFile(){
return true;
}

public static void main(String []args) {


int matrix[][] = new int[3][5];

System.out.println(matrix.length);

matrix[0][0]=1;
matrix[0][1]=2;
matrix[0][2]=5;


matrix[1][0]=8;
matrix[1][1]=7;
matrix[1][2]=6;

matrix[2][0]=3;
matrix[2][1]=4;
matrix[2][2]=9;


System.out.println(matrix[2][1]);



// second way of declaring

int matrix2[][] = { {1,2,5},{8,7,6},{3,4,9}  };

System.out.println(matrix2[1][2]);
System.out.println("-----");



// multiple for loop to print elements of a matrix


for(int i = 0 ; i < matrix.length ; i++){

	for(int j=0; j < matrix[1].length; j++){
		System.out.println(matrix[i][j]);
		
	}


}


if()

}

}