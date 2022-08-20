#1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
var1=list(range(1,4))
con= 1
while con == 1:
    try:
        for c in range(1,3):
            var1[c]=float(input(f'Digite o {c}º número:'))
        print('O resultado da soma é:')
        print(var1[1]+var1[2])
    except:
        print('Digite apenas números!')
    try:
        con=int(input('Quer continuar? [1]Sim [0]Não'))
    except:
        print('Digite apenas "1" ou "0", o programa foi reiniciado automaticamente!')
print('Programa encerrado!')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈