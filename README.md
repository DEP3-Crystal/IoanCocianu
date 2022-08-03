# IoanCocianu - Vending machine algorithm

Vending machine has following coins: 1c, 5c, 10c, 25c, 50c, 1$. 
Your task is to write a program that will be used in a vending machine to return change. 
Assume vending machine will always want to return the least number of coins. 
Devise a function getChange(M, P) where M is how much money was inserted into the machine and P the price of the item selected that returns an array of the integer representing the number of denominations to return. 

Example:
getChange(5, 0.99) should return [1,0,0,0,0,4]

4.01
0.01 -> 0.1
