In this Project database, there are two table one will be having default entry of having 
	parking slot entry(i.e. how many slot are available there in parking).
Another table is for maintaining history of parked car till date.
There are rest point created for getting :-
	1. All slot available
	2. Slot information of specific slot
	3. Slot availability of specific slot
	4. Park vehicle
	5. Unpark vehicle (fare will be automatically calculated on the basis of entry time and exit time)
					  (A Enum is created for defining Fare per Hour basis & Day basis)	
	
Security is implemented, two account are mentioned in SpringSecurityCofig file.

	 