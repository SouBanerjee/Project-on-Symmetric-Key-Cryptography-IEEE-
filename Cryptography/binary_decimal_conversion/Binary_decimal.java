package binary_decimal_conversion;

import array.Array_int;

public class Binary_decimal {

	/**
	 * This function converts a binary number to its decimal equivalent
	 * representation and returns it
	 * @param ob is an object of type Array_int which contains a one
	 *           dimentional array and it contains binary representation of
	 *           a number
	 * @param lb is the lower bound of the one dimentional array
	 * @param ub is the upper bound of the one dimentional array
	 * @return decimal equivalent of the binary number
	 */
	public int binary_to_decimal(Array_int ob, int lb, int ub)
	{
		int j = 0, sum = 0;
		for(int i = ub; i >= lb; i--){
			sum += ob.arr[i] * (int)Math.pow(2, j);
			j++;
		}
		return sum;
	}

	/**
	 * This function converts a decimal number to its equivalent binary representation
	 * and binary representation is stored in an object of type Array_int which contains
	 * a one dimentional array
	 * @param ob is an object of type Array_int which contains a one dimentional array
	 *           which is used to store binary equivalent of the decimal number data
	 * @param lb is the lower bound of the one dimentional array
	 * @param ub is the upper bound of the one dimentional array
	 * @param data is decimal number whose binary equivalent is generated by this function
	 *             and stored in the one dimentional array
	 */
	public void decimal_to_binary(Array_int ob, int lb, int ub, int data)
	{
		int j = ub;
		while(true){
			ob.arr[j--] = data % 2;
			data -= (data % 2);
			if(data == 0)
				break;
			data /= 2;
			if(data / 2 == 0)
			{
				ob.arr[j--] = data;
				break;
			}
		}
		while(j >= lb){
			ob.arr[j--] = 0;
		}
	}
	
}
