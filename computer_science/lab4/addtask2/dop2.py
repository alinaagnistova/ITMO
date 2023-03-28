#usingregulars
import re
from time import time #dop3
sec = time() #dop3 (точка отсчёта времени)
def from_yaml_to_json_with_regulars(filename, output_filename):
    with open(filename, 'r', encoding="UTF-8") as yamlf, open(output_filename, "w", encoding="UTF-8") as jsonf:
        flag_last = False
        strr = yamlf.readlines()
        jsonf.write("{\n")
        for line in strr:
            temp = re.findall(r"^\w+:", line)
            if len(temp) > 0:
                result = re.sub(r"^\w+:", " " * 2 + '"' + temp[0].rstrip(":") + '": [', line)
                jsonf.write(result)
            temp = re.findall(r"\s+-", line)
            if len(temp) > 0:
                if "практика 2" in line:
                    flag_last = True
                jsonf.write("    {\n")
                temp = line.lstrip("  - ").rstrip(":\n")
                jsonf.write(6 * " " + '"' + temp + '": {\n')
            temp = re.findall(r"^\s+.+: .+", line)
            if len(temp) > 0:
                temp_2 = temp[0].lstrip().split(":")
                temp_2[1] = temp_2[1].lstrip(" '").rstrip("'")
                if len(temp_2) == 3:
                    jsonf.write(' ' * 8 + '"' + temp_2[0] + '": "' + temp_2[1] + ":" + temp_2[2].rstrip("'") + '",\n')
                elif "type" not in temp_2[0]:
                    jsonf.write(' ' * 8 + '"' + temp_2[0] + '": "' + temp_2[1] + '",\n')
                else:
                    jsonf.write(' ' * 8 + '"' + temp_2[0] + '": "' + temp_2[1] + '"\n')
                    if not flag_last:
                        jsonf.write(6 * ' ' + '}\n' + "    },\n")
                    else:
                        jsonf.write(6 * ' ' + '}\n' + "    }\n" + "  ]\n" + "}")
from_yaml_to_json_with_regulars("yaml", "json2")
file = open("json2").read()
print(file)
print("time dop2_task:", 10*(time() - sec)) #dop3 (время работы программы, время в данный момент - время старта)