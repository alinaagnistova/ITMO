'''
Результаты тестов, посчитанные вручную:
тест 1: 10
тест 2: 8
тест 3: 12
тест 4: 22
тест 5: 66
'''
import re
eyes = [':', ';', 'X', '8', '=']
nose = ['-', '<', '-{', '<{']
mouth = ['(', ')', 'O', '|', r'\', /, "P']
def mySmileyFace(num):
    smileyFace = eyes[num%5] + nose[num%4] + mouth[num%7]
    return smileyFace
smile = mySmileyFace(370540)
def count_smiles(filename):
    smile = re.compile(r':-O')
    return len(re.findall(smile, filename))
for i in range(1, 6):
   sequence = open('тест' + str(i)).read()
   print(i)
   print(sequence)
   print('Тест', i, ':', count_smiles(sequence))

