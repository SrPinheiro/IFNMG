nome=str(input("Digite seu nome"))
matri=int(input("Qual sua matricula"))
no1=float(input("Digite a nota do laboratorio"))
no2=float(input("Digite a nota da avaliação"))
no3=float(input("Digite a nota do exame final"))
media = (((no1 * 2) + (no2 * 3) + (no3 * 5)) // 10)
if (media >= 8 and media < 10):
    print("\n", nome, " ,número de matrícula ", matri, " sua nota final é de ", media, " and a sua classificação é A")

if (media >= 7 and media < 8):
    print("\n", nome, " ,número de matrícula ", matri, " sua nota final é de ", media, " and a sua classificaçao é B")

if (media >= 6 and media < 7):
    print("\n", nome, " ,número de matrícula ", matri, " sua nota final é de ", media, " and a sua classificaçao é C")

if (media >= 5 and media < 6):
    print("\n", nome, " ,número de matrícula ", matri, " sua nota final é de ", media, " and a sua classificaçao é D")

if (media >= 0 and media < 5):
    print("\n", nome, " ,número de matrícula ", matri, " sua nota final é de ", media, " and a sua classificaçao é R")

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈