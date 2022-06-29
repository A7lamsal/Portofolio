import re 
def contains(item): #A method or a function that helps to find out if the password matches the criteria
    """
    The below attributes assigns it to False as 
    it will change its value if the password 
    matches the criteria. 
    """
    contains_lowercase = False
    contains_uppercase= False
    contains_digit= False
    contains_specialchar= False
    specialcharFound= re.compile('[a-zA-Z0-9]')
    contains_suffix= False
    suffixFound= re.compile('@aou.edu.sa')
    for character in item: #The for loop is used to iterate in the password
        if character.islower: #The if statement is used to check if the password has a lowercase and changes its value to True.
            contains_lowercase= True
        if character.isupper: #The if statement is used to check if the password has a uppercase and changes its value to True.
            contains_uppercase= True
        if character.isdigit: #The if statement is used to check if the password has a digit and changes its value to True.
            contains_digit= True
        if specialcharFound.search(character): #The if statement is used to check if the password has a special character and changes its value to True.
            contains_specialchar= True
        if suffixFound.search(item): #The if statement is used to check if the password has a suffix and changes its value to True.
            contains_suffix= True
        passwordLength =len(item)
        if (passwordLength>= 15 and contains_lowercase and contains_uppercase and contains_digit 
            and contains_specialchar and contains_suffix) : #The if statement is used to check if the password matches the criteria and prints it.
            print(item)
            break
password= "As_lj8hhhhkh@aou.edu.sa,ashh123,As_lj8,Sa_12345678909875,Sa_7789979@aou.edu.sa,As1@aou.edu.sa" 
list= password.split(',')
print(list) #prints the list of passwords.
for i in range (len(list)): #the for loop is used to iterate in the list of passwords one by one.
    contains(list[i]) #calls the above method or function.



    

