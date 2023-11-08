path = './days.txt'
days_file = open(path, 'r')
str = days_file.read()
my_dictionary = {}
if(str != ""):
    for word in str.split(' '):
        if word not in my_dictionary:
            my_dictionary[word] = 1
        else:
            my_dictionary[word] += 1
    for key, value in my_dictionary.items():
        print(key,end=" ")
        print(value)