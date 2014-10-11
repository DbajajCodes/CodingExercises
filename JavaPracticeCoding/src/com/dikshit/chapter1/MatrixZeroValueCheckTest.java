package com.dikshit.chapter1;

import static org.junit.Assert.*;
import lombok.Data;

import org.junit.Test;

@Data
public class MatrixZeroValueCheckTest {

@Test
public void testMarixContainingZeroPerformsOperationCorrectly(){
	int inputMatrix[][] = new int[3][3];
	int outputMatrix[][] = new int[3][3];
	
	inputMatrix = populateInputMatrix(inputMatrix);
	outputMatrix = populateOutputMatrix(outputMatrix);
	
	
	assertArrayEquals(outputMatrix, MatrixZeroValueCheck.performOperation(inputMatrix));
	
}

private int[][] populateOutputMatrix(int[][] inputMatrix) {
	inputMatrix[0][0]=2;
	inputMatrix[0][1]=0;
	inputMatrix[0][2]=6;
	inputMatrix[1][0]=0;
	inputMatrix[1][1]=0;
	inputMatrix[1][2]=0;
	inputMatrix[2][0]=3;
	inputMatrix[2][1]=0;
	inputMatrix[2][2]=9;

	return inputMatrix;

}

private int[][] populateInputMatrix(int[][] inputMatrix) {
	inputMatrix[0][0]=2;
	inputMatrix[0][1]=4;
	inputMatrix[0][2]=6;
	inputMatrix[1][0]=8;
	inputMatrix[1][1]=0;
	inputMatrix[1][2]=5;
	inputMatrix[2][0]=3;
	inputMatrix[2][1]=7;
	inputMatrix[2][2]=9;

	return inputMatrix;
}
	
}
