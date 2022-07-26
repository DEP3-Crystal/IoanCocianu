# IoanCocianu

The program is functional but lacks some tweaks like interplay or refresh list.. and i think... IM SURE there is a bug somewhere..

the idea:
  1. read file "names.txt"
	
  2. put every line of the file in the arraylist
	
  3. select random name from list
	
  4. check to see if the name was last picked in "lastPicked.txt" or already chosen in the file "chosen.txt"
		
      - if it's last picked. WE RUN AGAIN
		
      - if it's in the "chosen.txt"  THAT'S where the probability kicks in. For every iteration found in "chosen.txt" we run a for-loop
	which the max is the number of times found. IF the name is not in the "chosen.txt" then we break the loop. 
		  
  5. We add the name to the "chosen.txt" and replace whats in the "lastPicked.txt"
