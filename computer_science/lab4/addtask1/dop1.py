#with using libs
import yaml
import json
from time import time #dop3
sec = time() #dop3 (точка отсчёта времени)
def yaml_to_json(input_file, output_file):
    with open(input_file, 'r', encoding="UTF-8") as yamlfile, open(output_file, "w", encoding="UTF-8") as jsonfile:
        yaml_dict = yaml.safe_load(yamlfile) #reading file and show it like a dictionary
        json.dump(yaml_dict, jsonfile, ensure_ascii=False, sort_keys=True, indent=2)#write json file and do a sort dictionaries, indenting, экранирование

yaml_to_json("yaml", "json1")
file = open("json1").read()
print(file)
print("time dop1_task:", 10*(time() - sec)) #dop3 (время работы программы, время в данный момент - время старта)