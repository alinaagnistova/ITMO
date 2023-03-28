from time import time #dop3
start = time() #dop3 (точка отсчёта времени)
def yaml_to_list(filename):
    with open(filename, "r") as file:
        strings = file.read().split('\n')
        dayname = ''
        count = -1 #counter of the number of lessons
        main = {} #nice sequence to do json
        for i in strings:
            strr = i.lstrip().rstrip()
            if strr.count(':') == 1:
                key, expression = strr.split(':')
                if '-' not in key and len(expression) == 0:
                    main[key] = []
                    dayname = key
                elif '-' in key:
                    temp = key.lstrip('- ')
                    main[dayname].append({temp: {}})
                    count += 1
                    lessonatm = temp # we save lesson what we have at the moment
                else:
                    expression = expression.lstrip().rstrip()
                    if "'" in expression:
                        expression = expression.lstrip("'").lstrip("'")
                    main[dayname][count][lessonatm][key] = expression
            elif strr.count(':') == 3:
                key, timepart1, timepart2, timepart3 = strr.split(":")
                expression = timepart1 + ":" + timepart2 + ":" + timepart3
                expression = expression.lstrip().rstrip()
                if "'" in expression:
                    expression = expression.lstrip("'").rstrip("'")
                main[dayname][count][lessonatm][key] = expression

        return [main, dayname]

###################################
def list_to_json(main, dayname, output_filename):
    spaces = 2
    with open(output_filename, "w") as file1:
        numb = 0
        file1.write("{\n")
        file1.write(spaces*"" + '"' + dayname + '": [\n')
        spaces += 2
        file1.write(spaces*"" + "{\n")
        spaces += 2
        for i in main[dayname]:
            for key1 in i.keys():
                file1.write(spaces*"" + '"' + key1 + '":{\n')
                temp_main = main[dayname][numb][key1]
                numb += 1
                spaces += 2
                for key2 in temp_main.keys():
                    file1.write(spaces*'' + '"' + key2 + '": ')
                    if key2 != "teacher":
                        file1.write('"' + temp_main[key2] + '", \n')
                    else:
                        file1.write('"' + temp_main[key2] + '"\n')
                spaces -= 2
                file1.write(spaces*'' + "}\n")
                if key1 != "ОПД(практика 2)":
                    file1.write(spaces * ' ' + "},\n")
                    file1.write(spaces * ' ' + "{\n")
                else:
                    file1.write(spaces * ' ' + "}\n")
                    spaces -= 2
                    file1.write(spaces * ' ' + "]\n")
                    spaces -= 2
                    file1.write(spaces * ' ' + "}\n")

                spaces += 2

middle_stage = yaml_to_list("yaml")
last_stage = list_to_json(*middle_stage, "json")
file = open("json").read()
print(file)
print("time base_task:", 10*(time() - start)) #dop3 (время работы программы, время в данный момент - время старта)


