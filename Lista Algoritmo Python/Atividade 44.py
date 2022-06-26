#44. Faça um algoritmo para ler uma quantidade e a seguir ler esta quantidade de números. Depois de ler todos
#os números o algoritmo deve apresentar na tela o maior dos números lidos e a média dos números lidos.
nb=[]
while True:
    try:
        c=int(input('Digite a quantidade de números que quer digitar:'))
        if c < 0:
            print('Digite apenas números maiores que 0!')
        else:
            break
    except:
        print('Algo de errado, escreva apenas numeros inteiros!')


while c>0:
    nb.append(float(input('Digite um número:')))
    c-=1
    if c== 0:
        print('Programa encerrado')
print(f'Os números lidos foram: {nb}')
print(f'O maior número lido foi: {max(nb):.0f}')
print(f'A média desses número é: {sum(nb)/(len(nb)):.1f}')

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈
