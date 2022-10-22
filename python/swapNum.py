#Python program to swap two variables

A = int( input("Please enter value for A: "))  
B = int( input("Please enter value for B: "))  
   
# To Swap the values of two variables using XOR  
A = A ^ B
B = A ^ B
A = A ^ B  
   
print ("The Value of A after swapping: ", A)  
print ("The Value of B after swapping: ", B)  


# We can also use the bitwise XOR method for swapping two variables. 
# The XOR of two variables, A and B, will return the number which has all the bits as 1 whenever the bits of the A and B variables differ.
# Such as XOR of 4 (in binary 0100) and 6 (in binary 0110) is 1010.
# XOR of 2 (in binary 0010) and 8 (in binary 1000) is 1010.