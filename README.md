# Java-Bank-Application-Database
# Author : Sayantan Ghosh
1.Read a CSV file of names,social security numbers, account type and initial Deposit
2.Use a proper Data Structure to hold all those accounts
3.Both Savings and Checking account have the following features
   | deposit()
   |withdraw()
   |transfer()
   |showinfo()
   
   11digit account Number(generated with the following process : 1 or 2 depending on Savings or Checking,last two digits of
   SSN,unique 5 digit number,and random 3 digit number.
   
   1.Savings account holder are given a safety deposit box,identified by a 3 digit number and a $ digit Code(Randomly Generated).
   2.Checking accouunt Holders are assigned a Debit Card Number (12 digit) and a $ digit PIN Number($ Number)
   3.Both accounts will use a interface that determines the Base Interest Rate,
     Savings accounts will hold 0.25 less than the Base Interest rate.
     Checking account will hold 0.15 more than the Base Rate.
   4.The showinfo method should reveal all the details of the account Holder.
