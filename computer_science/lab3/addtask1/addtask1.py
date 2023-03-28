
import re
def change_time(string):
   pattern = r'(?:[01]\d|2[0-3])(:(?:[0-5]\d)){1,2}(?![:\d])'
   repl = r'TBD'
   result = re.sub(pattern, repl, string)
   return result


for i in range(1, 6):
   sequence = open('test' + str(i)).read()
   print(i)
   print(sequence)
   print(change_time(sequence))
