package com.dikshit.chapter1;

public class MatrixZeroValueCheck {

	public static int[][] performOperation(int[][] inputMatrix) {
		int[] zeroPositionRows = new int[3];
		int[] zeroPositionCols = new int[3];
		int rowIndex=0;
		int colIndex=0;
		for(int row=0; row<3; row++){
			for(int col=0;col<3;col++){
				if(inputMatrix[row][col]==0){
					zeroPositionRows[rowIndex++]=row;
					zeroPositionCols[colIndex++]=col;
				}
			}
		}
		int rowLen=0;
		for(int rowNo=0;rowNo<3;rowNo++){
			if(zeroPositionRows[rowNo]!=0)
			{
				for(int colPos=0;colPos<3;colPos++)
			{
				inputMatrix[zeroPositionRows[rowNo]][colPos]=0;
			}
			}
		}
		
		for(int colNo=0;colNo<3;colNo++){
			if(zeroPositionCols[colNo]!=0){
				for(int rowPos=0;rowPos<3;rowPos++){
					inputMatrix[rowPos][zeroPositionCols[colNo]]=0;
				}
			}
		}
			
	return inputMatrix;
	}

}
