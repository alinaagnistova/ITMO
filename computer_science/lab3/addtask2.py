import re
#pattern = r'\w+@\w+\.\w+'
arrayStrings = ['agnistova1@mail.ru', 'a5748392@gmail', 'todayisabeatifulday', 'agnistova1@google. com', 'pokemons@@yandex.name']
def is_email_right(string):
    pattern = r'\w+@(\w+\.\w+)'
    result = re.fullmatch(pattern, string)
    print(result.group())
    return str(result)

for i in range(len(arrayStrings)):
    string = arrayStrings[i]
    if is_email_right(string) == 'None':
        print('Fail!')
    else:
        string = re.split(r'@', string)
        print('Mail server:', string[1])

