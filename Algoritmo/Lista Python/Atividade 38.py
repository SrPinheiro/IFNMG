nome=str(input("qual seu nome?"))
ifxo=int(input("você é [1]Homem ou [2]Mulher?"))
if (ifxo == 1):
    tam=float(input("qual sua altura? [metros]"))
    if (tam > 1.70):
        idade=int(input("qual sua idade? "))
        if (idade <= 20):
            print(nome, f" seu peso ideia é : {((72.7 * tam) - 58):.1f}")
        if (idade >= 21 and idade <= 39):
            print(nome, f" seu peso ideia é : {((72.7 * tam) - 53):.1f}")
        if (idade >= 40):
            print(nome, f" seu peso ideia é : {((72.7 * tam) - 45):.1f}")
    elif (tam <= 1.70):
        idade=int(input("qual sua idade? "))
        if (idade <= 40):
            print(nome, f" seu peso ideia é : {((72.7 * tam) - 50):.1f}")

        if (idade > 40):
            print(nome, f" seu peso ideia é : {((72.7 * tam) - 58):.1f}")
elif(ifxo == 2):
    tam=float(input("qual sua altura? [metros]"))
    if (tam > 1.50):
        print(nome, f" seu peso ideia é :{((62.1 * tam) - 44.7):.1f} ")

    if (tam <= 1.50):
        idade=int(input("qual sua idade? "))
        if idade < 35:
            print(nome, f" seu peso ideia é : {((62.1 * tam) - 49):.1f}")
        if (idade >= 35):
            print(nome, f" seu peso ideia é : {(62.1 * tam) - 45:.1f})")

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈







