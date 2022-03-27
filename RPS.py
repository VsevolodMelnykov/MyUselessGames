import random

result = 11

def winn(aa, bb):
    aa = int(aa)
    bb = int(bb)
    global result
    if aa == 1:
        if bb == 1:
            result = 0
        elif bb == 2:
            result = -1
        elif bb == 3:
            result = 1
    elif aa == 2:
        if bb == 1:
            result = 1
        elif bb == 2:
            result = 0
        elif bb == 3:
            result = -1
    elif aa == 3:
        if bb == 1:
            result = -1
        elif bb == 2:
            result = 1
        elif bb == 3:
            result = 0
    else:
        result = -2
    return result


def printing(ell):
    ell = int(ell)
    if ell == 1:
        print(f'''       _____           ''')
        print(f'''      / __  \___       ''')
        print(f'''    _/ /  \     \      ''')
        print(f'''   |       \_    \     ''')
        print(f'''   /  __          \__  ''')
        print(f'''  /     \           |  ''')
        print(f'''  |_________________/  ''')
    elif ell == 3:
        print(f'''    |\      /|    ''')
        print(f'''    | \    / |    ''')
        print(f'''    |  \  /  |    ''')
        print(f'''    |   ||   |    ''')
        print(f'''    |   ||   |    ''')
        print(f'''     \  ||  /     ''')
        print(f'''      \ || /      ''')
        print(f'''       \||/       ''')
        print(f'''     __/||\__     ''')
        print(f'''    /   ||   \    ''')
        print(f'''   /    ||    \   ''')
        print(f'''  /  _  ||  _  \  ''')
        print(f'''  | | | || | | |  ''')
        print(f'''  | |_| || |_| |  ''')
        print(f'''  \     ||     /  ''')
        print(f'''   \____||____/   ''')
    elif ell == 2:
        print(f'''      __________________
     /                 /
    /                 /
   /                 /
  /_________________/''')
    return ell

def generate():
    el = random.randint(1,3)
    if el == 1:
        print(f'''       _____           ''')
        print(f'''      / __  \___       ''')
        print(f'''    _/ /  \     \      ''')
        print(f'''   |       \_    \     ''')
        print(f'''   /  __          \__  ''')
        print(f'''  /     \           |  ''')
        print(f'''  |_________________/  ''')
    elif el == 3:
        print(f'''    |\      /|    ''')
        print(f'''    | \    / |    ''')
        print(f'''    |  \  /  |    ''')
        print(f'''    |   ||   |    ''')
        print(f'''    |   ||   |    ''')
        print(f'''     \  ||  /     ''')
        print(f'''      \ || /      ''')
        print(f'''       \||/       ''')
        print(f'''     __/||\__     ''')
        print(f'''    /   ||   \    ''')
        print(f'''   /    ||    \   ''')
        print(f'''  /  _  ||  _  \  ''')
        print(f'''  | | | || | | |  ''')
        print(f'''  | |_| || |_| |  ''')
        print(f'''  \     ||     /  ''')
        print(f'''   \____||____/   ''')
    elif el == 2:
        print(f'''      __________________
     /                 /
    /                 /
   /                 /
  /_________________/''')
    return el

def roundd(input):
    printing(input)
    print(f'''\n\n\n   \          /   ___     ''')
    print(f'''    \        /   |     ''')
    print(f'''     \      /    |___     ''')
    print(f'''      \    /         |   ''')
    print(f'''       \__/       ___|   \n\n\n''')
    elo = generate()
    results = winn(input, elo)
    if results == -1:
        print("\n\n\n-----   YOU LOOSE!   -----\n\n\n")
    if results == 0:
        print("\n\n\n-----   TIE!   -----\n\n\n")
    if results == 1:
        print("\n\n\n-----   YOU WIN!   -----\n\n\n")
    if results == -2:
        print("FOCKH IT DOES NOT WORHK")



while True:
    print("Start a new round? (y/n)")
    inp = input()
    if inp == "y":
        print("Choose your play (1 - Rock, 2 - Paper, 3 - Scissors):")
        gin = input()
        roundd(gin)
    if inp == "n":
        exit()
    if inp != "y" and inp != "n":
        print("The input is incorrect\n")
