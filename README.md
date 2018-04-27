# Fizz Buzz 
Return “fizz”, “buzz” or “fizzbuzz”. For a given natural number greater than zero return: - "fizz" if the number is dividable by 3 - "buzz" if the number is dividable by 5 - "fizzbuzz" if the number is dividable by 15 - the same number if no other requirement is fulfilled

Reasoning for setting the first if-statement to take 15 instead of 3:
- If given a number like 30 which is both dividable by 3 and 15, it will return the first if-statement fulfilling the criteria.
- To be able to return "fizzbuzz" at all, I needed to set the first if-statement to handle the greatest number.